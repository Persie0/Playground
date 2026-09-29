package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$2", m19206f = "LessonEditParentFragment.kt", m19207l = {84}, m19208m = "invokeSuspend")
public final class LessonEditParentFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27887e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonEditParentFragment f27888f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$2$1", m19206f = "LessonEditParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42751 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f27889e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonEditParentFragment f27890f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42751(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super C42751> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27890f = lessonEditParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42751 c42751 = new C42751(this.f27890f, interfaceC9968c);
            c42751.f27889e = ((Boolean) obj).booleanValue();
            return c42751;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42751) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f27889e) {
                Fragment fragmentM3615C = this.f27890f.m3594l().m3615C(R.id.nav_host_fragment_lesson_edit);
                C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                ((NavHostFragment) fragmentM3615C).m4035m0().m3995p();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditParentFragment$onViewCreated$2$2(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super LessonEditParentFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27888f = lessonEditParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonEditParentFragment$onViewCreated$2$2(this.f27888f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonEditParentFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27887e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonEditParentFragment lessonEditParentFragment = this.f27888f;
            InterfaceC7137r<Boolean> interfaceC7137rMo10155K0 = LessonEditParentFragment.m10154u0(lessonEditParentFragment).mo10155K0();
            C42751 c42751 = new C42751(lessonEditParentFragment, null);
            this.f27887e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10155K0, c42751, this) == coroutineSingletons) {
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
