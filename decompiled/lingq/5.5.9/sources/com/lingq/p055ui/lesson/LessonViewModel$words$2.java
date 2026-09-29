package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.C7127c;
import p159hi.C6054e;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "Lhi/e;", "", "Lmj/a;", "pages", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$words$2", m19206f = "LessonViewModel.kt", m19207l = {293}, m19208m = "invokeSuspend")
final class LessonViewModel$words$2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Map<String, ? extends C6054e>>, List<? extends C7567a>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27831e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f27832f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f27833g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonViewModel f27834h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$words$2(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$words$2> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f27834h = lessonViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Map<String, ? extends C6054e>> interfaceC7117d, List<? extends C7567a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonViewModel$words$2 lessonViewModel$words$2 = new LessonViewModel$words$2(this.f27834h, interfaceC9968c);
        lessonViewModel$words$2.f27832f = interfaceC7117d;
        lessonViewModel$words$2.f27833g = list;
        return lessonViewModel$words$2.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonViewModel lessonViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27831e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f27832f;
            List list = this.f27833g;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9327o.m17684D(((C7567a) it.next()).f41703c, arrayList);
            }
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C7570d) it2.next()).f41725e);
            }
            ArrayList arrayListM13414H = C6752c.m13414H(C6752c.m13416J(arrayList2), 200);
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayListM13414H, 10));
            Iterator it3 = arrayListM13414H.iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                lessonViewModel = this.f27834h;
                if (!zHasNext) {
                    break;
                }
                arrayList3.add(lessonViewModel.f27477g.mo6193c((List) it3.next(), lessonViewModel.mo498E1()));
            }
            Object[] array = C6752c.m13453u0(arrayList3).toArray(new InterfaceC7116c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            final InterfaceC7116c[] interfaceC7116cArr = (InterfaceC7116c[]) array;
            this.f27832f = null;
            this.f27831e = 1;
            C0062b.m289M0(interfaceC7117d);
            Object objM14386a = C7127c.m14386a(this, new InterfaceC2041a<List<? extends C6054e>[]>() { // from class: com.lingq.ui.lesson.LessonViewModel$words$2$invokeSuspend$$inlined$combine$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final List<? extends C6054e>[] mo807E() {
                    return new List[interfaceC7116cArr.length];
                }
            }, new LessonViewModel$words$2$invokeSuspend$$inlined$combine$1$3(lessonViewModel, null), interfaceC7117d, interfaceC7116cArr);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objM14386a != coroutineSingletons2) {
                objM14386a = C9072e.f47360a;
            }
            if (objM14386a != coroutineSingletons2) {
                objM14386a = C9072e.f47360a;
            }
            if (objM14386a == coroutineSingletons) {
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
