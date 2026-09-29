package com.lingq.p055ui.home.vocabulary.filter;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "VocabularyFilterSelectionFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4042xb5dde541 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f26388f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f26389g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ VocabularyFilterSelectionFragment f26390h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ VocabularyFilterSelectionAdapter f26391i;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "VocabularyFilterSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26392e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFilterSelectionFragment f26393f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ VocabularyFilterSelectionAdapter f26394g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter, VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26393f = vocabularyFilterSelectionFragment;
            this.f26394g = vocabularyFilterSelectionAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26394g, this.f26393f, interfaceC9968c);
            anonymousClass1.f26392e = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f26392e;
            VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter = this.f26394g;
            VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment = this.f26393f;
            C7828f.m15570d(interfaceC7882z, null, null, new VocabularyFilterSelectionFragment$onViewCreated$4$1(vocabularyFilterSelectionAdapter, vocabularyFilterSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new VocabularyFilterSelectionFragment$onViewCreated$4$2(vocabularyFilterSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new VocabularyFilterSelectionFragment$onViewCreated$4$3(vocabularyFilterSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new VocabularyFilterSelectionFragment$onViewCreated$4$4(vocabularyFilterSelectionFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4042xb5dde541(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment, VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter) {
        super(2, interfaceC9968c);
        this.f26388f = fragment;
        this.f26389g = state;
        this.f26390h = vocabularyFilterSelectionFragment;
        this.f26391i = vocabularyFilterSelectionAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4042xb5dde541(this.f26388f, this.f26389g, interfaceC9968c, this.f26390h, this.f26391i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4042xb5dde541) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26387e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f26388f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26391i, this.f26390h, null);
            this.f26387e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f26389g, anonymousClass1, this) == coroutineSingletons) {
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
