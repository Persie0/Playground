package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7378e;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$1", m19206f = "LessonDealWithWordsFragment.kt", m19207l = {163}, m19208m = "invokeSuspend")
public final class LessonDealWithWordsFragment$onViewCreated$7$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29107e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsFragment f29108f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4465a f29109g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$1$1", m19206f = "LessonDealWithWordsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44401 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29110e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C4465a f29111f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonDealWithWordsFragment f29112g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44401(C4465a c4465a, LessonDealWithWordsFragment lessonDealWithWordsFragment, InterfaceC9968c<? super C44401> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29111f = c4465a;
            this.f29112g = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44401 c44401 = new C44401(this.f29111f, this.f29112g, interfaceC9968c);
            c44401.f29110e = obj;
            return c44401;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44401) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29110e;
            this.f29111f.m4529q(list);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29112g;
            lessonDealWithWordsFragment.m10224n0().f44833b.setText(lessonDealWithWordsFragment.m3599s().getQuantityString(R.plurals.paging_move_known_action_button, list.size(), new Integer(list.size())));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$7$1(C4465a c4465a, LessonDealWithWordsFragment lessonDealWithWordsFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29108f = lessonDealWithWordsFragment;
        this.f29109g = c4465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsFragment$onViewCreated$7$1(this.f29109g, this.f29108f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsFragment$onViewCreated$7$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29107e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29108f;
            LessonDealWithWordsViewModel lessonDealWithWordsViewModelM10226p0 = lessonDealWithWordsFragment.m10226p0();
            C44401 c44401 = new C44401(this.f29109g, lessonDealWithWordsFragment, null);
            this.f29107e = 1;
            if (C0062b.m369m0(lessonDealWithWordsViewModelM10226p0.f29139L, c44401, this) == coroutineSingletons) {
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
