package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import ni.C7793a;
import p159hi.C6054e;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7568b;
import p265mj.C7569c;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lmj/c;", "", "", "Lhi/e;", "words", "Lmj/a;", "data", "Lmj/b;", "<anonymous parameter 2>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$spansForWords$1", m19206f = "LessonPageViewModel.kt", m19207l = {152}, m19208m = "invokeSuspend")
final class LessonPageViewModel$spansForWords$1 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super List<? extends C7569c>>, Map<String, ? extends C6054e>, C7567a, List<? extends C7568b>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28667e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28668f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Map f28669g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ C7567a f28670h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LessonPageViewModel f28671i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$spansForWords$1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$spansForWords$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f28671i = lessonPageViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super List<? extends C7569c>> interfaceC7117d, Map<String, ? extends C6054e> map, C7567a c7567a, List<? extends C7568b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonPageViewModel$spansForWords$1 lessonPageViewModel$spansForWords$1 = new LessonPageViewModel$spansForWords$1(this.f28671i, interfaceC9968c);
        lessonPageViewModel$spansForWords$1.f28668f = interfaceC7117d;
        lessonPageViewModel$spansForWords$1.f28669g = map;
        lessonPageViewModel$spansForWords$1.f28670h = c7567a;
        return lessonPageViewModel$spansForWords$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28667e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28668f;
            Map map = this.f28669g;
            List<C7570d> list = this.f28670h.f41703c;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                C7569c c7569cM10205t2 = null;
                if (!it.hasNext()) {
                    break;
                }
                C7570d c7570d = (C7570d) it.next();
                String str = c7570d.f41725e;
                LessonPageViewModel lessonPageViewModel = this.f28671i;
                Locale locale = lessonPageViewModel.f28530L;
                C5207g.m11110e(locale, "locale");
                C6054e c6054e = (C6054e) map.get(C7793a.m15502f(str, locale));
                if (c6054e != null) {
                    c7569cM10205t2 = lessonPageViewModel.m10205t2(c7570d, c6054e, false);
                }
                if (c7569cM10205t2 != null) {
                    arrayList.add(c7569cM10205t2);
                }
            }
            this.f28668f = null;
            this.f28669g = null;
            this.f28667e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
