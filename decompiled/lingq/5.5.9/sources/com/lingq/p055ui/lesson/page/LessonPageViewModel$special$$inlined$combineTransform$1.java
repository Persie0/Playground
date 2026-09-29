package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.LessonHighlightStyle;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.C7127c;
import ni.C7793a;
import p159hi.C6052c;
import p159hi.C6054e;
import p260m8.C7499b;
import p265mj.C7568b;
import p265mj.C7569c;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$combineTransform$1", m19206f = "LessonPageViewModel.kt", m19207l = {251}, m19208m = "invokeSuspend")
public final class LessonPageViewModel$special$$inlined$combineTransform$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super LessonPageViewModel.C4374b>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28672e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f28673f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7116c[] f28674g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonPageViewModel f28675h;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$combineTransform$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$combineTransform$1$2", m19206f = "LessonPageViewModel.kt", m19207l = {363}, m19208m = "invokeSuspend")
    public static final class C43802 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super LessonPageViewModel.C4374b>, Object[], InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28677e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f28678f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object[] f28679g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ LessonPageViewModel f28680h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43802(LessonPageViewModel lessonPageViewModel, InterfaceC9968c interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f28680h = lessonPageViewModel;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super LessonPageViewModel.C4374b> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C43802 c43802 = new C43802(this.f28680h, interfaceC9968c);
            c43802.f28678f = interfaceC7117d;
            c43802.f28679g = objArr;
            return c43802.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object next;
            C7569c c7569c;
            Object obj2;
            List<C7570d> list;
            Locale locale;
            Iterator it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28677e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7117d interfaceC7117d = this.f28678f;
                Object[] objArr = this.f28679g;
                Object obj3 = objArr[0];
                C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.lesson.page.data.SpanTokenHelper>");
                List<C7569c> list2 = (List) obj3;
                Object obj4 = objArr[1];
                C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.lesson.page.data.SpanTokenHelper>");
                List<C7569c> list3 = (List) obj4;
                C7570d c7570d = (C7570d) objArr[2];
                C7570d c7570d2 = (C7570d) objArr[3];
                Object obj5 = objArr[4];
                C5207g.m11109d(obj5, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.lesson.page.data.SpanTokenHelper>");
                Object obj6 = objArr[5];
                C5207g.m11109d(obj6, "null cannot be cast to non-null type com.lingq.shared.storage.LessonHighlightStyle");
                LessonHighlightStyle lessonHighlightStyle = (LessonHighlightStyle) obj6;
                ArrayList arrayList = new ArrayList();
                LessonPageViewModel lessonPageViewModel = this.f28680h;
                C7568b c7568b = lessonPageViewModel.f28529K;
                if (c7568b != null && (list = c7568b.f41713d) != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C7570d c7570d3 = (C7570d) it2.next();
                        Iterator it3 = list3.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            locale = lessonPageViewModel.f28530L;
                            if (!zHasNext) {
                                break;
                            }
                            if (C5207g.m11106a(c7570d3, ((C7569c) it3.next()).f41717d)) {
                                Map map = (Map) lessonPageViewModel.f28536R.getValue();
                                it = it2;
                                String str = c7570d3.f41725e;
                                C5207g.m11110e(locale, "locale");
                                C6052c c6052c = (C6052c) map.get(C7793a.m15502f(str, locale));
                                if (c6052c != null) {
                                    arrayList.add(lessonPageViewModel.m10203q2(c7570d3, c6052c, true));
                                }
                            } else {
                                it = it2;
                            }
                            it2 = it;
                        }
                        Iterator it4 = it2;
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            if (C5207g.m11106a(c7570d3, ((C7569c) it5.next()).f41717d)) {
                                Map map2 = (Map) lessonPageViewModel.f28537S.getValue();
                                String str2 = c7570d3.f41725e;
                                C5207g.m11110e(locale, "locale");
                                C6054e c6054e = (C6054e) map2.get(C7793a.m15502f(str2, locale));
                                if (c6054e != null) {
                                    arrayList.add(lessonPageViewModel.m10205t2(c7570d3, c6054e, true));
                                }
                            }
                        }
                        it2 = it4;
                    }
                }
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                for (C7569c c7569c2 : list2) {
                    Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next2 = it6.next();
                        C7569c c7569c3 = (C7569c) next2;
                        if (C5207g.m11106a(c7569c3 != null ? c7569c3.f41717d : null, c7569c2.f41717d)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    C7569c c7569c4 = (C7569c) obj2;
                    if (c7569c4 != null) {
                        c7569c2 = c7569c4;
                    }
                    arrayList2.add(c7569c2);
                }
                ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
                for (C7569c c7569c5 : list3) {
                    Iterator it7 = arrayList.iterator();
                    do {
                        if (!it7.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it7.next();
                        c7569c = (C7569c) next;
                    } while (!C5207g.m11106a(c7569c != null ? c7569c.f41717d : null, c7569c5.f41717d));
                    C7569c c7569c6 = (C7569c) next;
                    if (c7569c6 != null) {
                        c7569c5 = c7569c6;
                    }
                    arrayList3.add(c7569c5);
                }
                C7568b c7568b2 = lessonPageViewModel.f28529K;
                LessonPageViewModel.C4374b c4374b = new LessonPageViewModel.C4374b(arrayList2, arrayList3, c7570d, C5207g.m11106a(c7570d2, c7568b2 != null ? c7568b2.f41710a : null) ? c7570d2 : null, lessonHighlightStyle);
                this.f28677e = 1;
                if (interfaceC7117d.mo1339r(c4374b, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$special$$inlined$combineTransform$1(InterfaceC7116c[] interfaceC7116cArr, InterfaceC9968c interfaceC9968c, LessonPageViewModel lessonPageViewModel) {
        super(2, interfaceC9968c);
        this.f28674g = interfaceC7116cArr;
        this.f28675h = lessonPageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        LessonPageViewModel$special$$inlined$combineTransform$1 lessonPageViewModel$special$$inlined$combineTransform$1 = new LessonPageViewModel$special$$inlined$combineTransform$1(this.f28674g, interfaceC9968c, this.f28675h);
        lessonPageViewModel$special$$inlined$combineTransform$1.f28673f = obj;
        return lessonPageViewModel$special$$inlined$combineTransform$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super LessonPageViewModel.C4374b> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$special$$inlined$combineTransform$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28672e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = (InterfaceC7117d) this.f28673f;
            final InterfaceC7116c[] interfaceC7116cArr = this.f28674g;
            InterfaceC2041a<Object[]> interfaceC2041a = new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$combineTransform$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object[] mo807E() {
                    return new Object[interfaceC7116cArr.length];
                }
            };
            C43802 c43802 = new C43802(this.f28675h, null);
            this.f28672e = 1;
            if (C7127c.m14386a(this, interfaceC2041a, c43802, interfaceC7117d, interfaceC7116cArr) == coroutineSingletons) {
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
