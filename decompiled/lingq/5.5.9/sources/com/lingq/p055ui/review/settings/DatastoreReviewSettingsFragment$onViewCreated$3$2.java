package com.lingq.p055ui.review.settings;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8339p;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$onViewCreated$3$2", m19206f = "DatastoreReviewSettingsFragment.kt", m19207l = {225}, m19208m = "invokeSuspend")
public final class DatastoreReviewSettingsFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30353e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreReviewSettingsFragment f30354f;

    /* JADX INFO: renamed from: com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DatastoreReviewSettingsFragment$onViewCreated$3$2$1", m19206f = "DatastoreReviewSettingsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46881 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f30355e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DatastoreReviewSettingsFragment f30356f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46881(DatastoreReviewSettingsFragment datastoreReviewSettingsFragment, InterfaceC9968c<? super C46881> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30356f = datastoreReviewSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46881 c46881 = new C46881(this.f30356f, interfaceC9968c);
            c46881.f30355e = ((Number) obj).intValue();
            return c46881;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46881) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f30355e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = DatastoreReviewSettingsFragment.f30337T0;
            DatastoreReviewSettingsFragment datastoreReviewSettingsFragment = this.f30356f;
            datastoreReviewSettingsFragment.getClass();
            ((C8339p) datastoreReviewSettingsFragment.f30338Q0.m10489a(datastoreReviewSettingsFragment, DatastoreReviewSettingsFragment.f30337T0[0])).f45121c.setTitle(datastoreReviewSettingsFragment.m3600t(i10));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreReviewSettingsFragment$onViewCreated$3$2(DatastoreReviewSettingsFragment datastoreReviewSettingsFragment, InterfaceC9968c<? super DatastoreReviewSettingsFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30354f = datastoreReviewSettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreReviewSettingsFragment$onViewCreated$3$2(this.f30354f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreReviewSettingsFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30353e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DatastoreReviewSettingsFragment datastoreReviewSettingsFragment = this.f30354f;
            DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModelM10304u0 = DatastoreReviewSettingsFragment.m10304u0(datastoreReviewSettingsFragment);
            C46881 c46881 = new C46881(datastoreReviewSettingsFragment, null);
            this.f30353e = 1;
            if (C0062b.m369m0(dataStoreReviewSettingsViewModelM10304u0.f30218h, c46881, this) == coroutineSingletons) {
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
