package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7567a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$checkCompletedPagesAndForcePage$1", m19206f = "LessonViewModel.kt", m19207l = {1266}, m19208m = "invokeSuspend")
final class LessonViewModel$checkCompletedPagesAndForcePage$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f27641e;

    /* JADX INFO: renamed from: f */
    public int f27642f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$checkCompletedPagesAndForcePage$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$checkCompletedPagesAndForcePage$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27643g = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$checkCompletedPagesAndForcePage$1(this.f27643g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$checkCompletedPagesAndForcePage$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27642f;
        LessonViewModel lessonViewModel = this.f27643g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            List list2 = (List) lessonViewModel.f27424P0.getValue();
            this.f27641e = list2;
            this.f27642f = 1;
            Object objM14362c = FlowKt__ReduceKt.m14362c(lessonViewModel.f27436T0, this);
            if (objM14362c == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
            obj = objM14362c;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f27641e;
            C7499b.m14977z0(obj);
        }
        Map map = (Map) obj;
        if (!list.isEmpty()) {
            if (!(map == null || map.isEmpty())) {
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7567a) it.next()).f41703c);
                }
                int iM10130l2 = LessonViewModel.m10130l2(lessonViewModel, map, arrayList);
                lessonViewModel.f27487j0.setValue(Boolean.FALSE);
                lessonViewModel.f27484i0.setValue(new Integer(-1));
                lessonViewModel.f27471e1.setValue(new Integer(iM10130l2));
                if (((Boolean) lessonViewModel.f27503q0.getValue()).booleanValue() && lessonViewModel.m10147t2() > iM10130l2) {
                    lessonViewModel.m10139F2(iM10130l2, true);
                }
            }
        }
        return C9072e.f47360a;
    }
}
