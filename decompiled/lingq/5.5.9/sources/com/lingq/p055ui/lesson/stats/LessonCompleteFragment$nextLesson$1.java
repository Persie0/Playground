package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.linguist.R;
import java.util.Iterator;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p159hi.C6050a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$nextLesson$1", m19206f = "LessonCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonCompleteFragment$nextLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonCompleteFragment f28903e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C6050a f28904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteFragment$nextLesson$1(LessonCompleteFragment lessonCompleteFragment, C6050a c6050a, InterfaceC9968c<? super LessonCompleteFragment$nextLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28903e = lessonCompleteFragment;
        this.f28904f = c6050a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteFragment$nextLesson$1(this.f28903e, this.f28904f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteFragment$nextLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
        LessonCompleteFragment lessonCompleteFragment = this.f28903e;
        LessonCompleteViewModel lessonCompleteViewModelM10217q0 = lessonCompleteFragment.m10217q0();
        C6050a c6050a = this.f28904f;
        Integer num = c6050a.f35722b;
        int iIntValue = 0;
        int iIntValue2 = num != null ? num.intValue() : 0;
        Iterator it = ((Iterable) lessonCompleteViewModelM10217q0.f28978M.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((LibraryItemCounter) next).f22004a == iIntValue2));
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
        if ((libraryItemCounter == null || libraryItemCounter.f22009f) ? false : true) {
            C6050a c6050a2 = (C6050a) lessonCompleteViewModelM10217q0.f28977L.getValue();
            if ((c6050a2 != null ? c6050a2.f35733m : 0) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        Integer num2 = c6050a.f35722b;
        if (z10) {
            LessonCompleteViewModel lessonCompleteViewModelM10217q1 = lessonCompleteFragment.m10217q0();
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModelM10217q1), null, null, new LessonCompleteViewModel$showBuyPremiumLesson$1(lessonCompleteViewModelM10217q1, iIntValue, null), 3);
        } else {
            C8573r0.m16725g0(lessonCompleteFragment).m3996q(R.id.fragment_lesson, true);
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            String str = c6050a.f35724d;
            if (str == null) {
                str = "";
            }
            C4924a.m10447Z(C8573r0.m16725g0(lessonCompleteFragment), C0062b.m279J(iIntValue, c6050a.f35723c, str, LessonPath.LessonComplete.f22160a, 24));
        }
        return C9072e.f47360a;
    }
}
