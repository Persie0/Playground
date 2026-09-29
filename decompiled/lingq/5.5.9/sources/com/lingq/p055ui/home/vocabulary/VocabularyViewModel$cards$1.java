package com.lingq.p055ui.home.vocabulary;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p264mi.C7563c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lmi/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$cards$1", m19206f = "VocabularyViewModel.kt", m19207l = {80}, m19208m = "invokeSuspend")
final class VocabularyViewModel$cards$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends C7563c>>, List<? extends C7563c>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26273e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f26274f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f26275g;

    public VocabularyViewModel$cards$1(InterfaceC9968c<? super VocabularyViewModel$cards$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends C7563c>> interfaceC7117d, List<? extends C7563c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        VocabularyViewModel$cards$1 vocabularyViewModel$cards$1 = new VocabularyViewModel$cards$1(interfaceC9968c);
        vocabularyViewModel$cards$1.f26274f = interfaceC7117d;
        vocabularyViewModel$cards$1.f26275g = list;
        return vocabularyViewModel$cards$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26273e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f26274f;
            ArrayList arrayListM13421O = C6752c.m13421O(this.f26275g);
            this.f26274f = null;
            this.f26273e = 1;
            if (interfaceC7117d.mo1339r(arrayListM13421O, this) == coroutineSingletons) {
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
