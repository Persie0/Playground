package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$observeHasCreatedLingqs$1", m19206f = "VocabularyViewModel.kt", m19207l = {248}, m19208m = "invokeSuspend")
final class VocabularyViewModel$observeHasCreatedLingqs$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26302e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyViewModel f26303f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$observeHasCreatedLingqs$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$observeHasCreatedLingqs$1$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40251 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f26304e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyViewModel f26305f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40251(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super C40251> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26305f = vocabularyViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40251 c40251 = new C40251(this.f26305f, interfaceC9968c);
            c40251.f26304e = ((Number) obj).intValue();
            return c40251;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40251) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26305f.f26225L.setValue(Boolean.valueOf(this.f26304e > 0));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$observeHasCreatedLingqs$1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super VocabularyViewModel$observeHasCreatedLingqs$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26303f = vocabularyViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$observeHasCreatedLingqs$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$observeHasCreatedLingqs$1(this.f26303f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26302e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            VocabularyViewModel vocabularyViewModel = this.f26303f;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(vocabularyViewModel.f26245e.mo6184f(vocabularyViewModel.mo498E1()), vocabularyViewModel.f26253i);
            C40251 c40251 = new C40251(vocabularyViewModel, null);
            this.f26302e = 1;
            if (C0062b.m369m0(interfaceC7116cM307S0, c40251, this) == coroutineSingletons) {
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
