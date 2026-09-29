package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p096ei.C5408a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8316l0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPagerFragment$onViewCreated$4$1", m19206f = "SentenceEditPagerFragment.kt", m19207l = {84}, m19208m = "invokeSuspend")
public final class SentenceEditPagerFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28098e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SentenceEditPagerFragment f28099f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/lesson/edit/b$a;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPagerFragment$onViewCreated$4$1$1", m19206f = "SentenceEditPagerFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43041 extends SuspendLambda implements InterfaceC2056p<List<? extends C4307b.a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28100e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SentenceEditPagerFragment f28101f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPagerFragment$onViewCreated$4$1$1$a */
        public static final class a implements LessonProgressBar.InterfaceC4222a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C8316l0 f28102a;

            public a(C8316l0 c8316l0) {
                this.f28102a = c8316l0;
            }

            @Override // com.lingq.p055ui.lesson.LessonProgressBar.InterfaceC4222a
            /* JADX INFO: renamed from: a */
            public final void mo10113a(int i10) {
                this.f28102a.f44993c.m4683b(i10, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43041(SentenceEditPagerFragment sentenceEditPagerFragment, InterfaceC9968c<? super C43041> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28101f = sentenceEditPagerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43041 c43041 = new C43041(this.f28101f, interfaceC9968c);
            c43041.f28100e = obj;
            return c43041;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C4307b.a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43041) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f28100e;
            if (!list.isEmpty()) {
                SentenceEditPagerFragment sentenceEditPagerFragment = this.f28101f;
                sentenceEditPagerFragment.f28088C0 = new C4307b(list, sentenceEditPagerFragment);
                C8316l0 c8316l0M10181n0 = sentenceEditPagerFragment.m10181n0();
                c8316l0M10181n0.f44993c.setOffscreenPageLimit(1);
                C4307b c4307b = sentenceEditPagerFragment.f28088C0;
                if (c4307b == null) {
                    C5207g.m11117l("adapter");
                    throw null;
                }
                c4307b.f7042c = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                c4307b.f7040a.m4264g();
                C4307b c4307b2 = sentenceEditPagerFragment.f28088C0;
                if (c4307b2 == null) {
                    C5207g.m11117l("adapter");
                    throw null;
                }
                ViewPager2 viewPager2 = c8316l0M10181n0.f44993c;
                viewPager2.setAdapter(c4307b2);
                boolean zM11572e = C5408a.m11572e(sentenceEditPagerFragment.m10182o0().mo498E1());
                LessonProgressBar lessonProgressBar = c8316l0M10181n0.f44992b;
                if (zM11572e) {
                    lessonProgressBar.f27361c0 = true;
                    lessonProgressBar.m10127m();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                viewPager2.setLayoutDirection(i10);
                lessonProgressBar.setOnPageChangedListener(new a(c8316l0M10181n0));
                viewPager2.f7742c.f7767a.add(sentenceEditPagerFragment.f28089D0);
                lessonProgressBar.setTotalPages(list.size());
                lessonProgressBar.setCompletedPages(list.size());
                lessonProgressBar.m10122f(true);
                viewPager2.m4683b(((Number) sentenceEditPagerFragment.m10182o0().f28117k.getValue()).intValue() - 1, false);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPagerFragment$onViewCreated$4$1(SentenceEditPagerFragment sentenceEditPagerFragment, InterfaceC9968c<? super SentenceEditPagerFragment$onViewCreated$4$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28099f = sentenceEditPagerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SentenceEditPagerFragment$onViewCreated$4$1(this.f28099f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SentenceEditPagerFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28098e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = SentenceEditPagerFragment.f28085E0;
            SentenceEditPagerFragment sentenceEditPagerFragment = this.f28099f;
            SentenceEditPagerViewModel sentenceEditPagerViewModelM10182o0 = sentenceEditPagerFragment.m10182o0();
            C43041 c43041 = new C43041(sentenceEditPagerFragment, null);
            this.f28098e = 1;
            if (C0062b.m369m0(sentenceEditPagerViewModelM10182o0.f28109H, c43041, this) == coroutineSingletons) {
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
