package com.lingq.p055ui.lesson;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$getLessonCounters$1", m19206f = "LessonViewModel.kt", m19207l = {1958}, m19208m = "invokeSuspend")
final class LessonViewModel$getLessonCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27676e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27677f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Integer> f27678g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$getLessonCounters$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "list", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$getLessonCounters$1$2", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42532 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27679e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonViewModel f27680f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42532(LessonViewModel lessonViewModel, InterfaceC9968c<? super C42532> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27680f = lessonViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42532 c42532 = new C42532(this.f27680f, interfaceC9968c);
            c42532.f27679e = obj;
            return c42532;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42532) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f27679e;
            if (!list.isEmpty()) {
                this.f27680f.f27519y0.setValue(C6752c.m13453u0(list));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$getLessonCounters$1(LessonViewModel lessonViewModel, List<Integer> list, InterfaceC9968c<? super LessonViewModel$getLessonCounters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27677f = lessonViewModel;
        this.f27678g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$getLessonCounters$1(this.f27677f, this.f27678g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$getLessonCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27676e;
        List<Integer> list = this.f27678g;
        LessonViewModel lessonViewModel = this.f27677f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2014g interfaceC2014g = lessonViewModel.f27486j;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(new Integer(((Number) it.next()).intValue()), LibraryItemType.Content.getValue()));
            }
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6075u = interfaceC2014g.mo6075u(arrayList);
            C42532 c42532 = new C42532(lessonViewModel, null);
            this.f27676e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6075u, c42532, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        lessonViewModel.getClass();
        C5207g.m11111f(list, "ids");
        C7828f.m15570d(lessonViewModel.f27429R, null, null, new LessonViewModel$updateCounterForLesson$1(lessonViewModel, list, null), 3);
        return C9072e.f47360a;
    }
}
