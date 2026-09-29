package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p040c4.C1688m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$3", m19206f = "UserImportParentFragment.kt", m19207l = {95}, m19208m = "invokeSuspend")
public final class UserImportParentFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26659e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportParentFragment f26660f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$3$1", m19206f = "UserImportParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40991 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f26661e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportParentFragment f26662f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40991(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super C40991> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26662f = userImportParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40991 c40991 = new C40991(this.f26662f, interfaceC9968c);
            c40991.f26661e = ((Boolean) obj).booleanValue();
            return c40991;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40991) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f26661e) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportParentFragment.f26640T0;
                UserImportParentFragment userImportParentFragment = this.f26662f;
                NavDestination navDestinationM3986g = userImportParentFragment.m10092v0().m3986g();
                Integer num = navDestinationM3986g != null ? new Integer(navDestinationM3986g.f6834h) : null;
                if (num != null) {
                    C1688m c1688mM10092v0 = userImportParentFragment.m10092v0();
                    int iIntValue = num.intValue();
                    NavDestination navDestinationM3986g2 = c1688mM10092v0.m3986g();
                    if (navDestinationM3986g2 != null && iIntValue == navDestinationM3986g2.f6834h) {
                        c1688mM10092v0.m3992m(R.id.fragment_user_import, null, null);
                    }
                } else {
                    userImportParentFragment.m10092v0().m3995p();
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportParentFragment$onViewCreated$3$3(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super UserImportParentFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26660f = userImportParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportParentFragment$onViewCreated$3$3(this.f26660f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportParentFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26659e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            UserImportParentFragment userImportParentFragment = this.f26660f;
            InterfaceC7137r<Boolean> interfaceC7137rMo10079R = UserImportParentFragment.m10091u0(userImportParentFragment).mo10079R();
            C40991 c40991 = new C40991(userImportParentFragment, null);
            this.f26659e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10079R, c40991, this) == coroutineSingletons) {
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
