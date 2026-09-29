package com.lingq.p055ui.lesson.edit;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditParentViewModel$sendSentenceEdits$1", m19206f = "LessonEditParentViewModel.kt", m19207l = {35}, m19208m = "invokeSuspend")
final class LessonEditParentViewModel$sendSentenceEdits$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Iterator f27920e;

    /* JADX INFO: renamed from: f */
    public int f27921f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonEditParentViewModel f27922g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditParentViewModel$sendSentenceEdits$1(LessonEditParentViewModel lessonEditParentViewModel, InterfaceC9968c<? super LessonEditParentViewModel$sendSentenceEdits$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27922g = lessonEditParentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonEditParentViewModel$sendSentenceEdits$1(this.f27922g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonEditParentViewModel$sendSentenceEdits$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Iterator<Integer> it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27921f;
        LessonEditParentViewModel lessonEditParentViewModel = this.f27922g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            it = lessonEditParentViewModel.mo10159Z1().iterator();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f27920e;
            C7499b.m14977z0(obj);
        }
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            InterfaceC3324a interfaceC3324a = lessonEditParentViewModel.f27914d;
            String strMo498E1 = lessonEditParentViewModel.mo498E1();
            this.f27920e = it;
            this.f27921f = 1;
            if (interfaceC3324a.mo9527o(lessonEditParentViewModel.f27917g, iIntValue, strMo498E1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        lessonEditParentViewModel.f27918h.mo14371k(Boolean.valueOf(!lessonEditParentViewModel.mo10159Z1().isEmpty()));
        return C9072e.f47360a;
    }
}
