package com.lingq.p055ui.lesson.stats;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p159hi.C6050a;
import p260m8.C7499b;
import p278nh.C7780g;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$getLessonStatistics$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$getLessonStatistics$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonCompleteViewModel f29046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$getLessonStatistics$1(LessonCompleteViewModel lessonCompleteViewModel, InterfaceC9968c<? super LessonCompleteViewModel$getLessonStatistics$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29046e = lessonCompleteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$getLessonStatistics$1(this.f29046e, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$getLessonStatistics$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        LessonCompleteViewModel lessonCompleteViewModel = this.f29046e;
        C6050a c6050a = (C6050a) lessonCompleteViewModel.f28976K.getValue();
        double d10 = c6050a != null ? c6050a.f35725e : 0.0d;
        C6050a c6050a2 = (C6050a) lessonCompleteViewModel.f28976K.getValue();
        double d11 = c6050a2 != null ? c6050a2.f35726f : 0.0d;
        C7780g[] c7780gArr = new C7780g[1];
        boolean z10 = d10 == 0.0d;
        int i10 = R.attr.colorError;
        c7780gArr[0] = new C7780g("Read", d10, R.string.lesson_read_count, z10 ? R.attr.colorError : R.attr.primaryTextColor);
        ArrayList arrayListM17254t = C9000b.m17254t(c7780gArr);
        if (!(d11 == 0.0d)) {
            i10 = R.attr.primaryTextColor;
        }
        arrayListM17254t.add(new C7780g("Listen", d11, R.string.lesson_listened_count, i10));
        lessonCompleteViewModel.f28998e0.setValue(new Pair(arrayListM17254t, Boolean.FALSE));
        return C9072e.f47360a;
    }
}
