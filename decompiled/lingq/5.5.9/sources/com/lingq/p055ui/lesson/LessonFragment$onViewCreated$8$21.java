package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.widget.LinearLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
import ph.C8278e4;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$21", m19206f = "LessonFragment.kt", m19207l = {835}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$21 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27133e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27134f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$21$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$21$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41831 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f27135e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27136f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41831(LessonFragment lessonFragment, InterfaceC9968c<? super C41831> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27136f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41831 c41831 = new C41831(this.f27136f, interfaceC9968c);
            c41831.f27135e = ((Boolean) obj).booleanValue();
            return c41831;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41831) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f27135e;
            LessonFragment lessonFragment = this.f27136f;
            if (z10) {
                C8278e4 c8278e4 = lessonFragment.f27059F0;
                if (c8278e4 == null) {
                    C5207g.m11117l("viewLessonMenuBinding");
                    throw null;
                }
                LinearLayout linearLayout = c8278e4.f44737b;
                C5207g.m11110e(linearLayout, "viewLessonMenuBinding.btnGrammarGuide");
                C4924a.m10457e0(linearLayout);
            } else {
                C8278e4 c8278e5 = lessonFragment.f27059F0;
                if (c8278e5 == null) {
                    C5207g.m11117l("viewLessonMenuBinding");
                    throw null;
                }
                LinearLayout linearLayout2 = c8278e5.f44737b;
                C5207g.m11110e(linearLayout2, "viewLessonMenuBinding.btnGrammarGuide");
                C4924a.m10442U(linearLayout2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$21(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$21> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27134f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$21(this.f27134f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$21) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27133e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27134f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C41831 c41831 = new C41831(lessonFragment, null);
            this.f27133e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27485i1, c41831, this) == coroutineSingletons) {
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
