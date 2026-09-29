package com.lingq.p055ui.home.vocabulary;

import ci.InterfaceC2025r;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$fetchCards$1", m19206f = "VocabularyViewModel.kt", m19207l = {261}, m19208m = "invokeSuspend")
final class VocabularyViewModel$fetchCards$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26282e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyViewModel f26283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$fetchCards$1(VocabularyViewModel vocabularyViewModel, InterfaceC9968c<? super VocabularyViewModel$fetchCards$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26283f = vocabularyViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$fetchCards$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$fetchCards$1(this.f26283f, interfaceC9968c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objMo6188j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26282e;
        VocabularyViewModel vocabularyViewModel = this.f26283f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            vocabularyViewModel.f26226M.setValue(new Integer(0));
            InterfaceC2025r interfaceC2025r = vocabularyViewModel.f26245e;
            String strMo498E1 = vocabularyViewModel.mo498E1();
            StateFlowImpl stateFlowImpl = vocabularyViewModel.f26223J;
            boolean z10 = stateFlowImpl.getValue() == VocabularyAdapter.SelectedContent.SrsDue;
            boolean z11 = stateFlowImpl.getValue() == VocabularyAdapter.SelectedContent.Phrases;
            int iIntValue = ((Number) vocabularyViewModel.f26232S.getValue()).intValue();
            String str = (String) vocabularyViewModel.f26224K.getValue();
            this.f26282e = 1;
            objMo6188j = interfaceC2025r.mo6188j(strMo498E1, iIntValue, (96 & 4) != 0 ? "" : str, (96 & 8) != 0 ? false : z10, (96 & 16) != 0 ? false : z11, (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? -1 : 0, this);
            if (objMo6188j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            objMo6188j = obj;
        }
        int iIntValue2 = ((Number) ((Triple) objMo6188j).f38022b).intValue();
        vocabularyViewModel.f26228O.setValue(Boolean.FALSE);
        vocabularyViewModel.f26226M.setValue(new Integer(iIntValue2));
        vocabularyViewModel.m10056n2();
        return C9072e.f47360a;
    }
}
