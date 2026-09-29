package com.lingq.p055ui.lesson;

import ci.InterfaceC2026s;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$movePageToKnown$1", m19206f = "LessonViewModel.kt", m19207l = {1216, 1217}, m19208m = "invokeSuspend")
final class LessonViewModel$movePageToKnown$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f27702e;

    /* JADX INFO: renamed from: f */
    public int f27703f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27704g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f27705h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$movePageToKnown$1(LessonViewModel lessonViewModel, int i10, InterfaceC9968c<? super LessonViewModel$movePageToKnown$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27704g = lessonViewModel;
        this.f27705h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$movePageToKnown$1(this.f27704g, this.f27705h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$movePageToKnown$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<C7570d> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27703f;
        LessonViewModel lessonViewModel = this.f27704g;
        if (i10 != 0) {
            if (i10 == 1) {
                list = this.f27702e;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            if (((Number) obj).intValue() > 0) {
                lessonViewModel.f27414M.m15505b(null, "paged_to_known");
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$trackAchievements$1(lessonViewModel, null), 3);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        List list2 = (List) lessonViewModel.f27424P0.getValue();
        if (!list2.isEmpty()) {
            int i11 = this.f27705h;
            if (i11 - 1 >= 0 && i11 < list2.size()) {
                list = ((C7567a) list2.get(i11 - 1)).f41703c;
                String strMo498E1 = lessonViewModel.mo498E1();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7570d) it.next()).f41725e);
                }
                this.f27702e = list;
                this.f27703f = 1;
                obj = lessonViewModel.f27477g.mo6197g(strMo498E1, arrayList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
        InterfaceC2026s interfaceC2026s = lessonViewModel.f27477g;
        String strMo498E2 = lessonViewModel.mo498E1();
        int iM10152y2 = lessonViewModel.m10152y2();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C7570d) it2.next()).f41725e);
        }
        this.f27702e = null;
        this.f27703f = 2;
        obj = interfaceC2026s.mo6198h(iM10152y2, strMo498E2, arrayList2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Number) obj).intValue() > 0) {
            lessonViewModel.f27414M.m15505b(null, "paged_to_known");
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$trackAchievements$1(lessonViewModel, null), 3);
        }
        return C9072e.f47360a;
    }
}
