package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$5", m19206f = "VocabularyFragment.kt", m19207l = {280}, m19208m = "invokeSuspend")
public final class VocabularyFragment$onViewCreated$3$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26191e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFragment f26192f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$5$1", m19206f = "VocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40141 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26193e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFragment f26194f;

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$5$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f26195a;

            static {
                int[] iArr = new int[Resource.Status.values().length];
                try {
                    iArr[Resource.Status.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Resource.Status.EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f26195a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40141(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super C40141> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26194f = vocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40141 c40141 = new C40141(this.f26194f, interfaceC9968c);
            c40141.f26193e = obj;
            return c40141;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40141) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = a.f26195a[((Resource.Status) this.f26193e).ordinal()];
            VocabularyFragment vocabularyFragment = this.f26194f;
            if (i10 == 1) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
                vocabularyFragment.m10021p0().f45495h.m4935d();
            } else if (i10 != 2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = VocabularyFragment.f26133G0;
                CircularProgressIndicator circularProgressIndicator = vocabularyFragment.m10021p0().f45495h;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = VocabularyFragment.f26133G0;
                CircularProgressIndicator circularProgressIndicator2 = vocabularyFragment.m10021p0().f45495h;
                C5207g.m11110e(circularProgressIndicator2, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFragment$onViewCreated$3$5(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super VocabularyFragment$onViewCreated$3$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26192f = vocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFragment$onViewCreated$3$5(this.f26192f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFragment$onViewCreated$3$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26191e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = this.f26192f;
            VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
            C40141 c40141 = new C40141(vocabularyFragment, null);
            this.f26191e = 1;
            if (C0062b.m369m0(vocabularyViewModelM10022q0.f26230Q, c40141, this) == coroutineSingletons) {
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
