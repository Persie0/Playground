package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8304j0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$3", m19206f = "LessonEditParentFragment.kt", m19207l = {95}, m19208m = "invokeSuspend")
public final class LessonEditParentFragment$onViewCreated$2$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27891e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonEditParentFragment f27892f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$3$1", m19206f = "LessonEditParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42761 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f27893e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonEditParentFragment f27894f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42761(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super C42761> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27894f = lessonEditParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42761 c42761 = new C42761(this.f27894f, interfaceC9968c);
            c42761.f27893e = ((Boolean) obj).booleanValue();
            return c42761;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42761) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f27893e;
            LessonEditParentFragment lessonEditParentFragment = this.f27894f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonEditParentFragment.f27870U0;
                lessonEditParentFragment.getClass();
                ((C8304j0) lessonEditParentFragment.f27872R0.m10489a(lessonEditParentFragment, LessonEditParentFragment.f27870U0[0])).f44908a.m4935d();
                LessonEditParentViewModel lessonEditParentViewModel = (LessonEditParentViewModel) lessonEditParentFragment.f27873S0.getValue();
                C7828f.m15570d(C8573r0.m16767w0(lessonEditParentViewModel), null, null, new LessonEditParentViewModel$sendSentenceEdits$1(lessonEditParentViewModel, null), 3);
            } else {
                lessonEditParentFragment.mo3766m0();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditParentFragment$onViewCreated$2$3(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super LessonEditParentFragment$onViewCreated$2$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27892f = lessonEditParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonEditParentFragment$onViewCreated$2$3(this.f27892f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonEditParentFragment$onViewCreated$2$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27891e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonEditParentFragment lessonEditParentFragment = this.f27892f;
            InterfaceC7137r<Boolean> interfaceC7137rMo10161m0 = LessonEditParentFragment.m10154u0(lessonEditParentFragment).mo10161m0();
            C42761 c42761 = new C42761(lessonEditParentFragment, null);
            this.f27891e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10161m0, c42761, this) == coroutineSingletons) {
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
