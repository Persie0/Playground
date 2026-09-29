package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyAddViewModel$wordExists$1", m19206f = "VocabularyAddViewModel.kt", m19207l = {31}, m19208m = "invokeSuspend")
final class VocabularyAddViewModel$wordExists$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26128e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyAddViewModel f26129f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f26130g;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAddViewModel$wordExists$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyAddViewModel$wordExists$1$1", m19206f = "VocabularyAddViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C39961 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26131e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyAddViewModel f26132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39961(VocabularyAddViewModel vocabularyAddViewModel, InterfaceC9968c<? super C39961> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26132f = vocabularyAddViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C39961 c39961 = new C39961(this.f26132f, interfaceC9968c);
            c39961.f26131e = obj;
            return c39961;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C39961) mo1336a(num, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Boolean boolValueOf;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Integer num = (Integer) this.f26131e;
            StateFlowImpl stateFlowImpl = this.f26132f.f26126g;
            if (num != null) {
                boolValueOf = Boolean.valueOf(num.intValue() > 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            stateFlowImpl.setValue(boolValueOf);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyAddViewModel$wordExists$1(VocabularyAddViewModel vocabularyAddViewModel, String str, InterfaceC9968c<? super VocabularyAddViewModel$wordExists$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26129f = vocabularyAddViewModel;
        this.f26130g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyAddViewModel$wordExists$1(this.f26129f, this.f26130g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyAddViewModel$wordExists$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26128e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            VocabularyAddViewModel vocabularyAddViewModel = this.f26129f;
            InterfaceC7116c<Integer> interfaceC7116cMo6194d = vocabularyAddViewModel.f26123d.mo6194d(vocabularyAddViewModel.mo498E1(), C7076b.m14277B3(this.f26130g).toString());
            C39961 c39961 = new C39961(vocabularyAddViewModel, null);
            this.f26128e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6194d, c39961, this) == coroutineSingletons) {
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
