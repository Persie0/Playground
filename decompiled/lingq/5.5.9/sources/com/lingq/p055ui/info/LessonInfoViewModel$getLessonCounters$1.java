package com.lingq.p055ui.info;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getLessonCounters$1", m19206f = "LessonInfoViewModel.kt", m19207l = {285}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$getLessonCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26982e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f26983f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Integer> f26984g;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoViewModel$getLessonCounters$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getLessonCounters$1$2", m19206f = "LessonInfoViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41492 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26985e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoViewModel f26986f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41492(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super C41492> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26986f = lessonInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41492 c41492 = new C41492(this.f26986f, interfaceC9968c);
            c41492.f26985e = obj;
            return c41492;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41492) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26986f.f26923K.setValue(C6752c.m13425S((List) this.f26985e));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$getLessonCounters$1(LessonInfoViewModel lessonInfoViewModel, List<Integer> list, InterfaceC9968c<? super LessonInfoViewModel$getLessonCounters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26983f = lessonInfoViewModel;
        this.f26984g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$getLessonCounters$1(this.f26983f, this.f26984g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$getLessonCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26982e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonInfoViewModel lessonInfoViewModel = this.f26983f;
            InterfaceC2014g interfaceC2014g = lessonInfoViewModel.f26944e;
            List<Integer> list = this.f26984g;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair<>(new Integer(((Number) it.next()).intValue()), LibraryItemType.Content.getValue()));
            }
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6075u = interfaceC2014g.mo6075u(arrayList);
            C41492 c41492 = new C41492(lessonInfoViewModel, null);
            this.f26982e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6075u, c41492, this) == coroutineSingletons) {
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
