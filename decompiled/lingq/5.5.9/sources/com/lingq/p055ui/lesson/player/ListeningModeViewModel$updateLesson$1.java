package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import ki.C6695a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$updateLesson$1", m19206f = "ListeningModeViewModel.kt", m19207l = {254}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$updateLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28877e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeViewModel f28878f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28879g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$updateLesson$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lki/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$updateLesson$1$1", m19206f = "ListeningModeViewModel.kt", m19207l = {257}, m19208m = "invokeSuspend")
    public static final class C44101 extends SuspendLambda implements InterfaceC2056p<C6695a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28880e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f28881f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ListeningModeViewModel f28882g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f28883h;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$updateLesson$1$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lki/a;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$updateLesson$1$1$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C6695a, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f28884e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ListeningModeViewModel f28885f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28885f = listeningModeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28885f, interfaceC9968c);
                anonymousClass1.f28884e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C6695a c6695a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c6695a, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f28885f.f28793I.setValue((C6695a) this.f28884e);
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44101(ListeningModeViewModel listeningModeViewModel, int i10, InterfaceC9968c<? super C44101> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28882g = listeningModeViewModel;
            this.f28883h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44101 c44101 = new C44101(this.f28882g, this.f28883h, interfaceC9968c);
            c44101.f28881f = obj;
            return c44101;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6695a c6695a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44101) mo1336a(c6695a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28880e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C6695a c6695a = (C6695a) this.f28881f;
                ListeningModeViewModel listeningModeViewModel = this.f28882g;
                listeningModeViewModel.f28793I.setValue(c6695a);
                if (c6695a == null) {
                    InterfaceC7116c<C6695a> interfaceC7116cMo9498T = listeningModeViewModel.f28807d.mo9498T(this.f28883h);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(listeningModeViewModel, null);
                    this.f28880e = 1;
                    if (C0062b.m369m0(interfaceC7116cMo9498T, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public ListeningModeViewModel$updateLesson$1(ListeningModeViewModel listeningModeViewModel, int i10, InterfaceC9968c<? super ListeningModeViewModel$updateLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28878f = listeningModeViewModel;
        this.f28879g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeViewModel$updateLesson$1(this.f28878f, this.f28879g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeViewModel$updateLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28877e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ListeningModeViewModel listeningModeViewModel = this.f28878f;
            InterfaceC3324a interfaceC3324a = listeningModeViewModel.f28807d;
            int i11 = this.f28879g;
            InterfaceC7116c<C6695a> interfaceC7116cMo9494P = interfaceC3324a.mo9494P(i11);
            C44101 c44101 = new C44101(listeningModeViewModel, i11, null);
            this.f28877e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9494P, c44101, this) == coroutineSingletons) {
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
