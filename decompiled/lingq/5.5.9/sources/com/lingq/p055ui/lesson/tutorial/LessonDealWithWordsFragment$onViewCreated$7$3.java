package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import mo.C7661i;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$3", m19206f = "LessonDealWithWordsFragment.kt", m19207l = {185}, m19208m = "invokeSuspend")
public final class LessonDealWithWordsFragment$onViewCreated$7$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29117e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsFragment f29118f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$3$1", m19206f = "LessonDealWithWordsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44421 extends SuspendLambda implements InterfaceC2056p<List<? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29119e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonDealWithWordsFragment f29120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44421(LessonDealWithWordsFragment lessonDealWithWordsFragment, InterfaceC9968c<? super C44421> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29120f = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44421 c44421 = new C44421(this.f29120f, interfaceC9968c);
            c44421.f29119e = obj;
            return c44421;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends String> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44421) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List<String> list = (List) this.f29119e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29120f;
            if (lessonDealWithWordsFragment.m10226p0().f29150k == -1) {
                lessonDealWithWordsFragment.m10226p0().m10228l2(list);
            } else {
                lessonDealWithWordsFragment.m10226p0().m10228l2(EmptyList.f38032a);
            }
            String strM3600t = lessonDealWithWordsFragment.m3600t(R.string.paging_move_known_title);
            C5207g.m11110e(strM3600t, "getString(R.string.paging_move_known_title)");
            List<Integer> list2 = C6716m.f37937a;
            String strM15254T2 = C7661i.m15254T2(strM3600t, "**", "");
            String strM14302v3 = C7076b.m14302v3(strM3600t, "**", strM3600t);
            String strM14302v4 = C7076b.m14302v3(strM14302v3, "**", strM14302v3);
            lessonDealWithWordsFragment.m10224n0().f44837f.setText(C6716m.m13322g(strM15254T2, C7076b.m14306z3(C7076b.m14302v3(strM3600t, "**", strM3600t), "**"), C7076b.m14306z3(C7076b.m14302v3(strM14302v4, "**", strM14302v4), "**")), TextView.BufferType.SPANNABLE);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$7$3(LessonDealWithWordsFragment lessonDealWithWordsFragment, InterfaceC9968c<? super LessonDealWithWordsFragment$onViewCreated$7$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29118f = lessonDealWithWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsFragment$onViewCreated$7$3(this.f29118f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsFragment$onViewCreated$7$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29117e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29118f;
            LessonViewModel lessonViewModelM10225o0 = lessonDealWithWordsFragment.m10225o0();
            C44421 c44421 = new C44421(lessonDealWithWordsFragment, null);
            this.f29117e = 1;
            if (C0062b.m369m0(lessonViewModelM10225o0.f27512u1, c44421, this) == coroutineSingletons) {
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
