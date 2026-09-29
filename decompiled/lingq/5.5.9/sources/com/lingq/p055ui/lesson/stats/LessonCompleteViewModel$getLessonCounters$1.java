package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p159hi.C6050a;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$getLessonCounters$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {653}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$getLessonCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29042e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteViewModel f29043f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteViewModel$getLessonCounters$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "list", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$getLessonCounters$1$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44311 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29044e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonCompleteViewModel f29045f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44311(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super C44311> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29045f = lessonCompleteViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44311 c44311 = new C44311(this.f29045f, interfaceC9968c);
            c44311.f29044e = obj;
            return c44311;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44311) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29044e;
            if (!list.isEmpty()) {
                this.f29045f.f28978M.setValue(C6752c.m13453u0(list));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$getLessonCounters$1(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super LessonCompleteViewModel$getLessonCounters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29043f = lessonCompleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$getLessonCounters$1(this.f29043f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$getLessonCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29042e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonCompleteViewModel lessonCompleteViewModel = this.f29043f;
            InterfaceC2014g interfaceC2014g = lessonCompleteViewModel.f29001g;
            C6050a c6050a = (C6050a) lessonCompleteViewModel.f28976K.getValue();
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6075u = interfaceC2014g.mo6075u(C9000b.m17251q(new Pair(new Integer((c6050a == null || (num = c6050a.f35722b) == null) ? 0 : num.intValue()), LibraryItemType.Content.getValue())));
            C44311 c44311 = new C44311(lessonCompleteViewModel, null);
            this.f29042e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6075u, c44311, this) == coroutineSingletons) {
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
