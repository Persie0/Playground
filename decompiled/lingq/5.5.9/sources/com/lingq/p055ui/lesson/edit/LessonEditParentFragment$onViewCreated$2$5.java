package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8304j0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$5", m19206f = "LessonEditParentFragment.kt", m19207l = {116}, m19208m = "invokeSuspend")
public final class LessonEditParentFragment$onViewCreated$2$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27899e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonEditParentFragment f27900f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$5$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "loadingStatus", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$5$1", m19206f = "LessonEditParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42781 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonEditParentFragment f27901e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42781(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super C42781> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27901e = lessonEditParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C42781(this.f27901e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42781) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonEditParentFragment.f27870U0;
            LessonEditParentFragment lessonEditParentFragment = this.f27901e;
            lessonEditParentFragment.getClass();
            CircularProgressIndicator circularProgressIndicator = ((C8304j0) lessonEditParentFragment.f27872R0.m10489a(lessonEditParentFragment, LessonEditParentFragment.f27870U0[0])).f44908a;
            C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
            C4924a.m10442U(circularProgressIndicator);
            lessonEditParentFragment.mo3766m0();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditParentFragment$onViewCreated$2$5(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super LessonEditParentFragment$onViewCreated$2$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27900f = lessonEditParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonEditParentFragment$onViewCreated$2$5(this.f27900f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonEditParentFragment$onViewCreated$2$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27899e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonEditParentFragment lessonEditParentFragment = this.f27900f;
            LessonViewModel lessonViewModel = (LessonViewModel) lessonEditParentFragment.f27874T0.getValue();
            C42781 c42781 = new C42781(lessonEditParentFragment, null);
            this.f27899e = 1;
            if (C0062b.m369m0(lessonViewModel.f27431R1, c42781, this) == coroutineSingletons) {
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
