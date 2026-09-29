package com.lingq.p055ui.imports.userImport;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "UserImportSelectionFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4103x6316e4af extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26688e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f26689f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f26690g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ UserImportSelectionFragment f26691h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ VocabularyFilterSelectionAdapter f26692i;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "UserImportSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26693e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportSelectionFragment f26694f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ VocabularyFilterSelectionAdapter f26695g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter, UserImportSelectionFragment userImportSelectionFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26694f = userImportSelectionFragment;
            this.f26695g = vocabularyFilterSelectionAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26695g, this.f26694f, interfaceC9968c);
            anonymousClass1.f26693e = obj;
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
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f26693e;
            VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter = this.f26695g;
            UserImportSelectionFragment userImportSelectionFragment = this.f26694f;
            C7828f.m15570d(interfaceC7882z, null, null, new UserImportSelectionFragment$onViewCreated$4$1(vocabularyFilterSelectionAdapter, userImportSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new UserImportSelectionFragment$onViewCreated$4$2(userImportSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new UserImportSelectionFragment$onViewCreated$4$3(userImportSelectionFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new UserImportSelectionFragment$onViewCreated$4$4(userImportSelectionFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4103x6316e4af(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, UserImportSelectionFragment userImportSelectionFragment, VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter) {
        super(2, interfaceC9968c);
        this.f26689f = fragment;
        this.f26690g = state;
        this.f26691h = userImportSelectionFragment;
        this.f26692i = vocabularyFilterSelectionAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4103x6316e4af(this.f26689f, this.f26690g, interfaceC9968c, this.f26691h, this.f26692i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4103x6316e4af) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26688e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f26689f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26692i, this.f26691h, null);
            this.f26688e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f26690g, anonymousClass1, this) == coroutineSingletons) {
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
