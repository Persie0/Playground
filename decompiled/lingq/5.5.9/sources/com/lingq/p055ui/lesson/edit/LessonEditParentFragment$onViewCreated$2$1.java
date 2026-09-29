package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p204jj.C6486g;
import p204jj.C6488i;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$1", m19206f = "LessonEditParentFragment.kt", m19207l = {71}, m19208m = "invokeSuspend")
public final class LessonEditParentFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27883e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonEditParentFragment f27884f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentFragment$onViewCreated$2$1$1", m19206f = "LessonEditParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42741 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27885e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonEditParentFragment f27886f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42741(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super C42741> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27886f = lessonEditParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42741 c42741 = new C42741(this.f27886f, interfaceC9968c);
            c42741.f27885e = obj;
            return c42741;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends Integer> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42741) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f27885e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            int iIntValue2 = ((Number) pair.f38013b).intValue();
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonEditParentFragment.f27870U0;
            LessonEditParentFragment lessonEditParentFragment = this.f27886f;
            C6488i c6488i = new C6488i(iIntValue, iIntValue2, ((C6486g) lessonEditParentFragment.f27871Q0.getValue()).f37088b);
            Fragment fragmentM3615C = lessonEditParentFragment.m3594l().m3615C(R.id.nav_host_fragment_lesson_edit);
            C5207g.m11109d(fragmentM3615C, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            C4924a.m10447Z(((NavHostFragment) fragmentM3615C).m4035m0(), c6488i);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditParentFragment$onViewCreated$2$1(LessonEditParentFragment lessonEditParentFragment, InterfaceC9968c<? super LessonEditParentFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27884f = lessonEditParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonEditParentFragment$onViewCreated$2$1(this.f27884f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonEditParentFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27883e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonEditParentFragment lessonEditParentFragment = this.f27884f;
            InterfaceC7137r<Pair<Integer, Integer>> interfaceC7137rMo10156M0 = LessonEditParentFragment.m10154u0(lessonEditParentFragment).mo10156M0();
            C42741 c42741 = new C42741(lessonEditParentFragment, null);
            this.f27883e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10156M0, c42741, this) == coroutineSingletons) {
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
