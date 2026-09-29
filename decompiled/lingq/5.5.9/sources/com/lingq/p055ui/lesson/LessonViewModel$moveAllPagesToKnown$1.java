package com.lingq.p055ui.lesson;

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
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$moveAllPagesToKnown$1", m19206f = "LessonViewModel.kt", m19207l = {1238}, m19208m = "invokeSuspend")
final class LessonViewModel$moveAllPagesToKnown$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27699e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27700f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f27701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$moveAllPagesToKnown$1(LessonViewModel lessonViewModel, String str, InterfaceC9968c<? super LessonViewModel$moveAllPagesToKnown$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27700f = lessonViewModel;
        this.f27701g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$moveAllPagesToKnown$1(this.f27700f, this.f27701g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$moveAllPagesToKnown$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27699e;
        LessonViewModel lessonViewModel = this.f27700f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            List list = (List) lessonViewModel.f27424P0.getValue();
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C9327o.m17684D(((C7567a) it.next()).f41703c, arrayList);
                }
                int iM10152y2 = lessonViewModel.m10152y2();
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C7570d) it2.next()).f41725e);
                }
                this.f27699e = 1;
                obj = lessonViewModel.f27477g.mo6198h(iM10152y2, this.f27701g, arrayList2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C9072e.f47360a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7499b.m14977z0(obj);
        if (((Number) obj).intValue() > 0) {
            lessonViewModel.getClass();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$trackAchievements$1(lessonViewModel, null), 3);
        }
        return C9072e.f47360a;
    }
}
