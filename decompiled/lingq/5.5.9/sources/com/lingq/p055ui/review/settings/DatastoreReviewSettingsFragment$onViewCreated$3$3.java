package com.lingq.p055ui.review.settings;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$onViewCreated$3$3", m19206f = "DatastoreReviewSettingsFragment.kt", m19207l = {231}, m19208m = "invokeSuspend")
public final class DatastoreReviewSettingsFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30357e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreReviewSettingsFragment f30358f;

    /* JADX INFO: renamed from: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$onViewCreated$3$3$1", m19206f = "DatastoreReviewSettingsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46891 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DatastoreReviewSettingsFragment f30359e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46891(DatastoreReviewSettingsFragment datastoreReviewSettingsFragment, InterfaceC9968c<? super C46891> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30359e = datastoreReviewSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C46891(this.f30359e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46891) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ViewsUtilsKt.m10420f(this.f30359e, null, new Integer(R.string.activities_one_selected_activity), new Integer(R.string.ui_ok), null, null, 57);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreReviewSettingsFragment$onViewCreated$3$3(DatastoreReviewSettingsFragment datastoreReviewSettingsFragment, InterfaceC9968c<? super DatastoreReviewSettingsFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30358f = datastoreReviewSettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreReviewSettingsFragment$onViewCreated$3$3(this.f30358f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreReviewSettingsFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30357e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DatastoreReviewSettingsFragment datastoreReviewSettingsFragment = this.f30358f;
            DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u0 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
            C46891 c46891 = new C46891(datastoreReviewSettingsFragment, null);
            this.f30357e = 1;
            if (C0062b.m369m0(dataStoreReviewSettingsViewModelM10304u0.f30215f0, c46891, this) == coroutineSingletons) {
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
