package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
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

/* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "SentenceEditPageFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4297x390f3c0f extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27995e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f27996f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f27997g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SentenceEditPageFragment f27998h;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "SentenceEditPageFragment.kt", m19207l = {1796}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27999e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f28000f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SentenceEditPageFragment f28001g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SentenceEditPageFragment sentenceEditPageFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28001g = sentenceEditPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28001g, interfaceC9968c);
            anonymousClass1.f28000f = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27999e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f28000f;
                SentenceEditPageFragment sentenceEditPageFragment = this.f28001g;
                C7828f.m15570d(interfaceC7882z, null, null, new SentenceEditPageFragment$onViewCreated$2$1(sentenceEditPageFragment, null), 3);
                SentenceEditPageFragment.C4294a c4294a = SentenceEditPageFragment.f27986E0;
                SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = sentenceEditPageFragment.m10179o0();
                SentenceEditPageFragment$onViewCreated$2$2 sentenceEditPageFragment$onViewCreated$2$2 = new SentenceEditPageFragment$onViewCreated$2$2(sentenceEditPageFragment, null);
                this.f27999e = 1;
                if (C0062b.m369m0(sentenceEditPageViewModelM10179o0.f28021N, sentenceEditPageFragment$onViewCreated$2$2, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4297x390f3c0f(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, SentenceEditPageFragment sentenceEditPageFragment) {
        super(2, interfaceC9968c);
        this.f27996f = fragment;
        this.f27997g = state;
        this.f27998h = sentenceEditPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4297x390f3c0f(this.f27996f, this.f27997g, interfaceC9968c, this.f27998h);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4297x390f3c0f) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27995e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f27996f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27998h, null);
            this.f27995e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f27997g, anonymousClass1, this) == coroutineSingletons) {
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
