package com.lingq.feature.library;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.notification.Notice;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.ja5;
import p000.je2;
import p000.u91;
import p000.x16;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$observeAndHandleNotifications$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {832}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$observeAndHandleNotifications$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public Notice f26505a;

    /* JADX INFO: renamed from: b */
    public int f26506b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f26507c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f26508d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2146e f26509e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Language f26510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$observeAndHandleNotifications$1(C2146e c2146e, Language language, Continuation continuation) {
        super(3, continuation);
        this.f26509e = c2146e;
        this.f26510f = language;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        LibraryUpdateViewModel$observeAndHandleNotifications$1 libraryUpdateViewModel$observeAndHandleNotifications$1 = new LibraryUpdateViewModel$observeAndHandleNotifications$1(this.f26509e, this.f26510f, (Continuation) obj3);
        libraryUpdateViewModel$observeAndHandleNotifications$1.f26507c = (List) obj;
        libraryUpdateViewModel$observeAndHandleNotifications$1.f26508d = zBooleanValue;
        return libraryUpdateViewModel$observeAndHandleNotifications$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Notice notice;
        Object objM16514p;
        Object value;
        ja5 ja5Var;
        List list = this.f26507c;
        boolean z = this.f26508d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26506b;
        C2146e c2146e = this.f26509e;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                boolean z2 = c2146e.mo8744P0(TooltipStep.Finished) && z;
                notice = (Notice) u91.m22591I0(list);
                if (z2 && notice != null) {
                    String str = this.f26510f.f19024a;
                    this.f26507c = null;
                    this.f26505a = notice;
                    this.f26508d = z;
                    this.f26506b = 1;
                    objM16514p = c2146e.f26687l.m16514p(str, notice, this);
                    if (objM16514p == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Notice notice2 = this.f26505a;
            AbstractC3193b.m15359b(obj);
            notice = notice2;
            objM16514p = obj;
            List list2 = (List) objM16514p;
            C3244l c3244l = c2146e.f26658G;
            do {
                value = c3244l.getValue();
                ja5Var = (ja5) value;
            } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, new x16(true, notice, u91.m22615g1(list2, 3)), null, null, null, 479), null, null, false, false, false, 2015)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
