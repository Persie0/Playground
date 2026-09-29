package com.lingq.p055ui.home.vocabulary;

import ci.InterfaceC2025r;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$getTotalPages$1", m19206f = "VocabularyViewModel.kt", m19207l = {280, 282, 287}, m19208m = "invokeSuspend")
final class VocabularyViewModel$getTotalPages$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public StateFlowImpl f26288e;

    /* JADX INFO: renamed from: f */
    public int f26289f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyViewModel f26290g;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyViewModel$getTotalPages$1$1 */
    public static final class C40221 implements InterfaceC7117d<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VocabularyViewModel f26291a;

        public C40221(VocabularyViewModel vocabularyViewModel) {
            this.f26291a = vocabularyViewModel;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX INFO: renamed from: a */
        public final Object m10066a(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            VocabularyViewModel$getTotalPages$1$1$emit$1 vocabularyViewModel$getTotalPages$1$1$emit$1;
            C40221 c40221;
            int i11;
            if (interfaceC9968c instanceof VocabularyViewModel$getTotalPages$1$1$emit$1) {
                vocabularyViewModel$getTotalPages$1$1$emit$1 = (VocabularyViewModel$getTotalPages$1$1$emit$1) interfaceC9968c;
                int i12 = vocabularyViewModel$getTotalPages$1$1$emit$1.f26296h;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    vocabularyViewModel$getTotalPages$1$1$emit$1.f26296h = i12 - Integer.MIN_VALUE;
                } else {
                    vocabularyViewModel$getTotalPages$1$1$emit$1 = new VocabularyViewModel$getTotalPages$1$1$emit$1(this, interfaceC9968c);
                }
            } else {
                vocabularyViewModel$getTotalPages$1$1$emit$1 = new VocabularyViewModel$getTotalPages$1$1$emit$1(this, interfaceC9968c);
            }
            Object objM14360a = vocabularyViewModel$getTotalPages$1$1$emit$1.f26294f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = vocabularyViewModel$getTotalPages$1$1$emit$1.f26296h;
            if (i13 == 0) {
                C7499b.m14977z0(objM14360a);
                InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = this.f26291a.f26249g.mo9685i();
                vocabularyViewModel$getTotalPages$1$1$emit$1.f26292d = this;
                vocabularyViewModel$getTotalPages$1$1$emit$1.f26293e = i10;
                vocabularyViewModel$getTotalPages$1$1$emit$1.f26296h = 1;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, vocabularyViewModel$getTotalPages$1$1$emit$1);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c40221 = this;
                i11 = i10;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = vocabularyViewModel$getTotalPages$1$1$emit$1.f26293e;
                c40221 = vocabularyViewModel$getTotalPages$1$1$emit$1.f26292d;
                C7499b.m14977z0(objM14360a);
            }
            VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) ((Map) objM14360a).get(c40221.f26291a.mo498E1());
            if (vocabularySearchQuery == null) {
                vocabularySearchQuery = new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null);
            }
            c40221.f26291a.f26231R.setValue(new Integer((int) Math.ceil(((double) i11) / ((double) vocabularySearchQuery.f22130d))));
            return C9072e.f47360a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo1339r(Integer num, InterfaceC9968c interfaceC9968c) {
            return m10066a(num.intValue(), interfaceC9968c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$getTotalPages$1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super VocabularyViewModel$getTotalPages$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26290g = vocabularyViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$getTotalPages$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$getTotalPages$1(this.f26290g, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        StateFlowImpl stateFlowImpl;
        C40221 c40221;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26289f;
        VocabularyViewModel vocabularyViewModel = this.f26290g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            if (vocabularyViewModel.f26251h.m15512e()) {
                InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9686j = vocabularyViewModel.f26249g.mo9686j();
                StateFlowImpl stateFlowImpl2 = vocabularyViewModel.f26231R;
                this.f26288e = stateFlowImpl2;
                this.f26289f = 1;
                obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9686j, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                stateFlowImpl = stateFlowImpl2;
                Integer num = (Integer) ((Map) obj).get(vocabularyViewModel.mo498E1());
                stateFlowImpl.setValue(new Integer(num != null ? num.intValue() : 0));
            } else {
                InterfaceC2025r interfaceC2025r = vocabularyViewModel.f26245e;
                String strMo498E1 = vocabularyViewModel.mo498E1();
                StateFlowImpl stateFlowImpl3 = vocabularyViewModel.f26223J;
                boolean z10 = stateFlowImpl3.getValue() == VocabularyAdapter.SelectedContent.SrsDue;
                boolean z11 = stateFlowImpl3.getValue() == VocabularyAdapter.SelectedContent.Phrases;
                String str = (String) vocabularyViewModel.f26224K.getValue();
                this.f26289f = 2;
                obj = interfaceC2025r.mo6186h(strMo498E1, str, z10, z11, null, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c40221 = new C40221(vocabularyViewModel);
                this.f26289f = 3;
                if (((InterfaceC7116c) obj).mo9539a(c40221, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i10 == 1) {
            stateFlowImpl = this.f26288e;
            C7499b.m14977z0(obj);
            Integer num2 = (Integer) ((Map) obj).get(vocabularyViewModel.mo498E1());
            stateFlowImpl.setValue(new Integer(num2 != null ? num2.intValue() : 0));
        } else if (i10 == 2) {
            C7499b.m14977z0(obj);
            c40221 = new C40221(vocabularyViewModel);
            this.f26289f = 3;
            if (((InterfaceC7116c) obj).mo9539a(c40221, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
