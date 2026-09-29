package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import ni.C7793a;
import p096ei.C5408a;
import p159hi.C6052c;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7568b;
import p265mj.C7569c;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\r\u001a\u00020\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lmj/c;", "", "", "Lhi/c;", "cards", "phrases", "Lmj/a;", "data", "Lmj/b;", "phrasesTokens", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$spansForCards$1", m19206f = "LessonPageViewModel.kt", m19207l = {137}, m19208m = "invokeSuspend")
final class LessonPageViewModel$spansForCards$1 extends SuspendLambda implements InterfaceC2060t<InterfaceC7117d<? super List<? extends C7569c>>, Map<String, ? extends C6052c>, Map<String, ? extends C6052c>, C7567a, List<? extends C7568b>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28660e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28661f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Map f28662g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Map f28663h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ C7567a f28664i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ List f28665j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LessonPageViewModel f28666k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$spansForCards$1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$spansForCards$1> interfaceC9968c) {
        super(6, interfaceC9968c);
        this.f28666k = lessonPageViewModel;
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final Object mo1858g0(InterfaceC7117d<? super List<? extends C7569c>> interfaceC7117d, Map<String, ? extends C6052c> map, Map<String, ? extends C6052c> map2, C7567a c7567a, List<? extends C7568b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonPageViewModel$spansForCards$1 lessonPageViewModel$spansForCards$1 = new LessonPageViewModel$spansForCards$1(this.f28666k, interfaceC9968c);
        lessonPageViewModel$spansForCards$1.f28661f = interfaceC7117d;
        lessonPageViewModel$spansForCards$1.f28662g = map;
        lessonPageViewModel$spansForCards$1.f28663h = map2;
        lessonPageViewModel$spansForCards$1.f28664i = c7567a;
        lessonPageViewModel$spansForCards$1.f28665j = list;
        return lessonPageViewModel$spansForCards$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        Iterator it;
        int length;
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28660e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28661f;
            Map map = this.f28662g;
            Map map2 = this.f28663h;
            C7567a c7567a = this.f28664i;
            List list = this.f28665j;
            LinkedHashMap linkedHashMapM13463P0 = C6753d.m13463P0(map, map2);
            List<C7570d> list2 = c7567a.f41703c;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C7568b) it2.next()).f41710a);
            }
            ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList, list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListM13438f0.iterator();
            while (true) {
                C7569c c7569cM10203q2 = null;
                if (!it3.hasNext()) {
                    this.f28661f = null;
                    this.f28662g = null;
                    this.f28663h = null;
                    this.f28664i = null;
                    this.f28660e = 1;
                    if (interfaceC7117d.mo1339r(arrayList2, this) != coroutineSingletons) {
                        break;
                    }
                    return coroutineSingletons;
                }
                C7570d c7570d = (C7570d) it3.next();
                String str3 = c7570d.f41725e;
                LessonPageViewModel lessonPageViewModel = this.f28666k;
                Locale locale = lessonPageViewModel.f28530L;
                C5207g.m11110e(locale, "locale");
                C6052c c6052c = (C6052c) linkedHashMapM13463P0.get(C7793a.m15502f(str3, locale));
                if (c6052c == null) {
                    linkedHashMap = linkedHashMapM13463P0;
                    it = it3;
                } else if (c6052c.f35739e) {
                    int i11 = c6052c.f35740f;
                    Integer num = c6052c.f35741g;
                    int iM10416b = ViewsUtilsKt.m10416b(i11, num);
                    Iterator it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        C7568b c7568b = (C7568b) it4.next();
                        String str4 = c7568b.f41710a.f41725e;
                        linkedHashMap = linkedHashMapM13463P0;
                        Locale locale2 = lessonPageViewModel.f28530L;
                        C5207g.m11110e(locale2, "locale");
                        it = it3;
                        if (C5207g.m11106a(C7793a.m15502f(str4, locale2), C7793a.m15502f(c7570d.f41725e, locale2))) {
                            C7569c c7569c = new C7569c(0, 0, 0, c7570d, false, 0, 503);
                            c7569c.f41714a = iM10416b;
                            c7569c.f41716c = R.attr.yellowWordBorderColor;
                            C5207g.m11106a(c7568b, lessonPageViewModel.f28529K);
                            c7569c.f41718e = true;
                            int i12 = c7570d.f41722b;
                            StateFlowImpl stateFlowImpl = lessonPageViewModel.f28531M;
                            C7567a c7567a2 = (C7567a) stateFlowImpl.getValue();
                            if (i12 >= ((c7567a2 == null || (str2 = c7567a2.f41702b) == null) ? 0 : str2.length())) {
                                C7567a c7567a3 = (C7567a) stateFlowImpl.getValue();
                                length = (c7567a3 == null || (str = c7567a3.f41702b) == null) ? 0 : str.length();
                            } else {
                                length = c7570d.f41722b;
                            }
                            int i13 = c7570d.f41721a;
                            if (i13 > length) {
                                i13 = length;
                            }
                            C7570d c7570d2 = c7569c.f41717d;
                            c7570d2.f41721a = i13;
                            c7570d2.f41722b = length;
                            c7569c.f41720g = C5408a.m11568a(i11, num);
                            c7569cM10203q2 = c7569c;
                            break;
                        }
                        linkedHashMapM13463P0 = linkedHashMap;
                        it3 = it;
                    }
                } else {
                    linkedHashMap = linkedHashMapM13463P0;
                    it = it3;
                    c7569cM10203q2 = lessonPageViewModel.m10203q2(c7570d, c6052c, false);
                }
                if (c7569cM10203q2 != null) {
                    arrayList2.add(c7569cM10203q2);
                }
                linkedHashMapM13463P0 = linkedHashMap;
                it3 = it;
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
