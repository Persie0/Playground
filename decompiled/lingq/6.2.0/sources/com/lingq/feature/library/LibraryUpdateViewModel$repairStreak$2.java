package com.lingq.feature.library;

import com.lingq.core.data.repository.C1294j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.h68;
import p000.ja5;
import p000.je2;
import p000.oo4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$repairStreak$2", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1286}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$repairStreak$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h68 f26590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$repairStreak$2(C2146e c2146e, h68 h68Var, Continuation continuation) {
        super(2, continuation);
        this.f26589b = c2146e;
        this.f26590c = h68Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$repairStreak$2(this.f26589b, this.f26590c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$repairStreak$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7240n;
        Object value;
        ja5 ja5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26588a;
        h68 h68Var = this.f26590c;
        C2146e c2146e = this.f26589b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            oo4 oo4Var = c2146e.f26654C;
            String strMo4589b2 = c2146e.f26677b.mo4589b2();
            int i2 = h68Var.f41841b;
            this.f26588a = 1;
            objM7240n = ((C1294j) oo4Var).m7240n(i2, strMo4589b2, this);
            if (objM7240n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM7240n = obj;
        }
        String str = (String) objM7240n;
        if (str != null) {
            C3244l c3244l = c2146e.f26658G;
            do {
                value = c3244l.getValue();
                ja5Var = (ja5) value;
            } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, null, null, null, null, null, null, null, null, h68.m13100a(h68Var, false, str), 255), null, null, false, false, false, 2015)));
        } else {
            c2146e.m9064V2();
        }
        return xfa.f68157a;
    }
}
