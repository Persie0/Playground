package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$navigateLessonEdit$1", m19206f = "LessonViewModel.kt", m19207l = {1895}, m19208m = "invokeSuspend")
final class LessonViewModel$navigateLessonEdit$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public LessonViewModel f27709e;

    /* JADX INFO: renamed from: f */
    public int f27710f;

    /* JADX INFO: renamed from: g */
    public int f27711g;

    /* JADX INFO: renamed from: h */
    public int f27712h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LessonViewModel f27713i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$navigateLessonEdit$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$navigateLessonEdit$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27713i = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$navigateLessonEdit$1(this.f27713i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$navigateLessonEdit$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonViewModel lessonViewModel;
        int iM10152y2;
        List<C7570d> list;
        C7570d c7570d;
        int iM10147t2;
        Object next;
        int i10;
        Integer num;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f27712h;
        boolean z10 = false;
        if (i12 == 0) {
            C7499b.m14977z0(obj);
            lessonViewModel = this.f27713i;
            iM10152y2 = lessonViewModel.m10152y2();
            if (((Boolean) lessonViewModel.f27474f0.getValue()).booleanValue()) {
                iM10147t2 = lessonViewModel.m10147t2() + 1;
            } else {
                LessonStudyBookmark lessonStudyBookmark = (LessonStudyBookmark) lessonViewModel.f27421O0.getValue();
                StateFlowImpl stateFlowImpl = lessonViewModel.f27424P0;
                if (lessonStudyBookmark != null) {
                    Iterable iterable = (Iterable) stateFlowImpl.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        C9327o.m17684D(((C7567a) it.next()).f41703c, arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        i10 = ((C7570d) next).f41726f;
                        num = lessonStudyBookmark.f21841a;
                    } while (!(num != null && i10 == num.intValue()));
                    C7570d c7570d2 = (C7570d) next;
                    if (c7570d2 != null) {
                        iM10147t2 = c7570d2.f41727g;
                    } else {
                        iM10147t2 = 0;
                    }
                } else {
                    C7567a c7567a = (C7567a) C6752c.m13426T(lessonViewModel.m10147t2(), (List) stateFlowImpl.getValue());
                    if (c7567a == null || (list = c7567a.f41703c) == null || (c7570d = (C7570d) C6752c.m13425S(list)) == null) {
                        iM10147t2 = 0;
                    } else {
                        iM10147t2 = c7570d.f41727g;
                    }
                }
            }
            LessonStudy lessonStudy = (LessonStudy) lessonViewModel.f27515w0.getValue();
            String str = lessonStudy != null ? lessonStudy.f21820f : null;
            if (str == null || C7661i.m15250P2(str)) {
                int iM10152y3 = lessonViewModel.m10152y2();
                this.f27709e = lessonViewModel;
                this.f27710f = iM10152y2;
                this.f27711g = iM10147t2;
                this.f27712h = 1;
                Object objM10131m2 = LessonViewModel.m10131m2(lessonViewModel, iM10152y3, this);
                if (objM10131m2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i11 = iM10147t2;
                obj = objM10131m2;
            } else {
                i11 = iM10147t2;
                z10 = true;
            }
            lessonViewModel.m10134A2(new AbstractC4269c.c(iM10152y2, i11, z10));
            return C9072e.f47360a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = this.f27711g;
        iM10152y2 = this.f27710f;
        lessonViewModel = this.f27709e;
        C7499b.m14977z0(obj);
        if (((Boolean) obj).booleanValue()) {
            iM10147t2 = i11;
            i11 = iM10147t2;
            z10 = true;
        }
        lessonViewModel.m10134A2(new AbstractC4269c.c(iM10152y2, i11, z10));
        return C9072e.f47360a;
    }
}
