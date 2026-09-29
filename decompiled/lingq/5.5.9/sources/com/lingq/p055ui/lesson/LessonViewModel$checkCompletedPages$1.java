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
import no.C7828f;
import no.InterfaceC7882z;
import p159hi.C6054e;
import p260m8.C7499b;
import p265mj.C7567a;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$checkCompletedPages$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$checkCompletedPages$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonViewModel f27639e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Map<String, C6054e> f27640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$checkCompletedPages$1(LessonViewModel lessonViewModel, Map<String, C6054e> map, InterfaceC9968c<? super LessonViewModel$checkCompletedPages$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27639e = lessonViewModel;
        this.f27640f = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$checkCompletedPages$1(this.f27639e, this.f27640f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$checkCompletedPages$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        LessonViewModel lessonViewModel = this.f27639e;
        List list = (List) lessonViewModel.f27424P0.getValue();
        if (!list.isEmpty()) {
            Map<String, C6054e> map = this.f27640f;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7567a) it.next()).f41703c);
                }
                int iM10130l2 = LessonViewModel.m10130l2(lessonViewModel, map, arrayList);
                lessonViewModel.f27471e1.setValue(new Integer(iM10130l2));
                if (iM10130l2 - 1 >= lessonViewModel.m10147t2()) {
                    C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showSentenceModeTooltip$1(lessonViewModel, null), 3);
                }
            }
        }
        return C9072e.f47360a;
    }
}
