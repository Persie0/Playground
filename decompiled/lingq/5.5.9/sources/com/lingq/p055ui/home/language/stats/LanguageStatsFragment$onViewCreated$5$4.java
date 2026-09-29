package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$4", m19206f = "LanguageStatsFragment.kt", m19207l = {224}, m19208m = "invokeSuspend")
public final class LanguageStatsFragment$onViewCreated$5$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24270e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsFragment f24271f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$4$1", m19206f = "LanguageStatsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37111 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24272e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsFragment f24273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37111(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super C37111> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24273f = languageStatsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37111 c37111 = new C37111(this.f24273f, interfaceC9968c);
            c37111.f24272e = obj;
            return c37111;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37111) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (((Resource.Status) this.f24272e) == Resource.Status.LOADING) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
                LanguageStatsViewModel languageStatsViewModelM9908p0 = this.f24273f.m9908p0();
                languageStatsViewModelM9908p0.f24294R.setValue(new Triple(EmptyList.f38032a, 0, Boolean.TRUE));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsFragment$onViewCreated$5$4(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super LanguageStatsFragment$onViewCreated$5$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24271f = languageStatsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsFragment$onViewCreated$5$4(this.f24271f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsFragment$onViewCreated$5$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24270e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsFragment languageStatsFragment = this.f24271f;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = languageStatsFragment.m9908p0();
            C37111 c37111 = new C37111(languageStatsFragment, null);
            this.f24270e = 1;
            if (C0062b.m369m0(languageStatsViewModelM9908p0.f24285I, c37111, this) == coroutineSingletons) {
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
