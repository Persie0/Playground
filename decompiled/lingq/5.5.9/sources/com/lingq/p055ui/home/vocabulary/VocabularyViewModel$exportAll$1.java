package com.lingq.p055ui.home.vocabulary;

import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.ExportType;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$exportAll$1", m19206f = "VocabularyViewModel.kt", m19207l = {422}, m19208m = "invokeSuspend")
final class VocabularyViewModel$exportAll$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26279e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyViewModel f26280f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExportType f26281g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$exportAll$1(VocabularyViewModel vocabularyViewModel, ExportType exportType, InterfaceC9968c<? super VocabularyViewModel$exportAll$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26280f = vocabularyViewModel;
        this.f26281g = exportType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$exportAll$1(this.f26280f, this.f26281g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$exportAll$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26279e;
        ExportType exportType = this.f26281g;
        VocabularyViewModel vocabularyViewModel = this.f26280f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2025r interfaceC2025r = vocabularyViewModel.f26245e;
            String strMo498E1 = vocabularyViewModel.mo498E1();
            this.f26279e = 1;
            obj = interfaceC2025r.mo6185g(strMo498E1, exportType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            vocabularyViewModel.f26241b0.mo14371k(InterfaceC4029a.a.f26330a);
        } else if (exportType == ExportType.CSV) {
            vocabularyViewModel.f26241b0.mo14371k(InterfaceC4029a.c.f26332a);
        } else if (exportType == ExportType.Anki) {
            vocabularyViewModel.f26241b0.mo14371k(InterfaceC4029a.b.f26331a);
        }
        return C9072e.f47360a;
    }
}
