package com.lingq.p055ui.home.vocabulary;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p264mi.C7563c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "Lmi/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$vocabularyCanReview$1", m19206f = "VocabularyViewModel.kt", m19207l = {118}, m19208m = "invokeSuspend")
final class VocabularyViewModel$vocabularyCanReview$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Boolean>, List<? extends C7563c>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26327e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f26328f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f26329g;

    public VocabularyViewModel$vocabularyCanReview$1(InterfaceC9968c<? super VocabularyViewModel$vocabularyCanReview$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Boolean> interfaceC7117d, List<? extends C7563c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        VocabularyViewModel$vocabularyCanReview$1 vocabularyViewModel$vocabularyCanReview$1 = new VocabularyViewModel$vocabularyCanReview$1(interfaceC9968c);
        vocabularyViewModel$vocabularyCanReview$1.f26328f = interfaceC7117d;
        vocabularyViewModel$vocabularyCanReview$1.f26329g = list;
        return vocabularyViewModel$vocabularyCanReview$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26327e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f26328f;
            Boolean boolValueOf = Boolean.valueOf(!this.f26329g.isEmpty());
            this.f26328f = null;
            this.f26327e = 1;
            if (interfaceC7117d.mo1339r(boolValueOf, this) == coroutineSingletons) {
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
