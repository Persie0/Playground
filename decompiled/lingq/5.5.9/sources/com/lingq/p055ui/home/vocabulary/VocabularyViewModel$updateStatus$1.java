package com.lingq.p055ui.home.vocabulary;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$updateStatus$1", m19206f = "VocabularyViewModel.kt", m19207l = {360, 362}, m19208m = "invokeSuspend")
final class VocabularyViewModel$updateStatus$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26323e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f26324f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyViewModel f26325g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f26326h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$updateStatus$1(int i10, VocabularyViewModel vocabularyViewModel, String str, InterfaceC9968c<? super VocabularyViewModel$updateStatus$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26324f = i10;
        this.f26325g = vocabularyViewModel;
        this.f26326h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyViewModel$updateStatus$1(this.f26324f, this.f26325g, this.f26326h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyViewModel$updateStatus$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26323e;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        } else {
            C7499b.m14977z0(obj);
            int value = CardStatus.Ignored.getValue();
            String str = this.f26326h;
            VocabularyViewModel vocabularyViewModel = this.f26325g;
            int i11 = this.f26324f;
            if (i11 == value) {
                InterfaceC2008a interfaceC2008a = vocabularyViewModel.f26243d;
                String strMo498E1 = vocabularyViewModel.mo498E1();
                this.f26323e = 1;
                if (interfaceC2008a.mo5950b(i11, strMo498E1, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                InterfaceC2008a interfaceC2008a2 = vocabularyViewModel.f26243d;
                String strMo498E2 = vocabularyViewModel.mo498E1();
                this.f26323e = 2;
                if (interfaceC2008a2.mo5957i(i11, strMo498E2, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }
}
