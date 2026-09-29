package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$4$2", m19206f = "UserImportSelectionFragment.kt", m19207l = {ModuleDescriptor.MODULE_VERSION}, m19208m = "invokeSuspend")
public final class UserImportSelectionFragment$onViewCreated$4$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26701e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportSelectionFragment f26702f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$4$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$4$2$1", m19206f = "UserImportSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41051 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f26703e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportSelectionFragment f26704f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41051(UserImportSelectionFragment userImportSelectionFragment, InterfaceC9968c<? super C41051> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26704f = userImportSelectionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41051 c41051 = new C41051(this.f26704f, interfaceC9968c);
            c41051.f26703e = ((Boolean) obj).booleanValue();
            return c41051;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41051) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f26703e) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportSelectionFragment.f26680E0;
                ((UserImportParentViewModel) this.f26704f.f26683C0.getValue()).mo10077K1();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionFragment$onViewCreated$4$2(UserImportSelectionFragment userImportSelectionFragment, InterfaceC9968c<? super UserImportSelectionFragment$onViewCreated$4$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26702f = userImportSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportSelectionFragment$onViewCreated$4$2(this.f26702f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportSelectionFragment$onViewCreated$4$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26701e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportSelectionFragment.f26680E0;
            UserImportSelectionFragment userImportSelectionFragment = this.f26702f;
            UserImportSelectionViewModel userImportSelectionViewModelM10094o0 = userImportSelectionFragment.m10094o0();
            C41051 c41051 = new C41051(userImportSelectionFragment, null);
            this.f26701e = 1;
            if (C0062b.m369m0(userImportSelectionViewModelM10094o0.f26727J, c41051, this) == coroutineSingletons) {
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
