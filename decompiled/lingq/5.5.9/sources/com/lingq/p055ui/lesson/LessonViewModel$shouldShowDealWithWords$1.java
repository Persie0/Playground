package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import li.C7378e;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$shouldShowDealWithWords$1", m19206f = "LessonViewModel.kt", m19207l = {1197}, m19208m = "invokeSuspend")
final class LessonViewModel$shouldShowDealWithWords$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27754e;

    /* JADX INFO: renamed from: f */
    public int f27755f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$shouldShowDealWithWords$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$shouldShowDealWithWords$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27756g = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$shouldShowDealWithWords$1(this.f27756g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$shouldShowDealWithWords$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f27755f;
        LessonViewModel lessonViewModel = this.f27756g;
        if (i12 == 0) {
            C7499b.m14977z0(obj);
            int iIntValue = ((Number) lessonViewModel.f27478g0.getValue()).intValue();
            List list = (List) lessonViewModel.f27424P0.getValue();
            if ((!list.isEmpty()) && (i10 = iIntValue - 1) >= 0 && iIntValue < list.size()) {
                List<C7570d> list2 = ((C7567a) list.get(i10)).f41703c;
                String strMo498E1 = lessonViewModel.mo498E1();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7570d) it.next()).f41725e);
                }
                this.f27754e = iIntValue;
                this.f27755f = 1;
                Object objMo6197g = lessonViewModel.f27477g.mo6197g(strMo498E1, arrayList, this);
                if (objMo6197g == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i11 = iIntValue;
                obj = objMo6197g;
            }
            return C9072e.f47360a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = this.f27754e;
        C7499b.m14977z0(obj);
        List list3 = (List) obj;
        if (!list3.isEmpty()) {
            C7138s c7138s = lessonViewModel.f27390C1;
            Integer num = new Integer(i11 - 1);
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C7378e) it2.next()).f41167a);
            }
            c7138s.mo14371k(new Pair(num, arrayList2));
        }
        return C9072e.f47360a;
    }
}
