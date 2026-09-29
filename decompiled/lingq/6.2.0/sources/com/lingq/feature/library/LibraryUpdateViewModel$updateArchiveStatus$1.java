package com.lingq.feature.library;

import com.lingq.core.domain.model.language.Language;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.InterfaceC3274ku;
import p000.c32;
import p000.cma;
import p000.eh9;
import p000.sq5;
import p000.un1;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$updateArchiveStatus$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {1013, 1014}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$updateArchiveStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3274ku f26615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f26616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$updateArchiveStatus$1(C2146e c2146e, InterfaceC3274ku interfaceC3274ku, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f26614b = c2146e;
        this.f26615c = interfaceC3274ku;
        this.f26616d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$updateArchiveStatus$1(this.f26614b, this.f26615c, this.f26616d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$updateArchiveStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r9 == r2) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2146e c2146e = this.f26614b;
        cma cmaVar = c2146e.f26677b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26613a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            sq5 sq5Var = c2146e.f26652A;
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f26613a = 1;
            obj = sq5Var.m21579u(strMo4589b2, this.f26615c, this.f26616d, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Language language = (Language) obj;
        if (language != null) {
            c2146e.m9065W2(language, (List) c2146e.f26671T.getValue());
        }
        return xfa.f68157a;
        if (((ym5) obj) instanceof xm5) {
            eh9 eh9VarMo4572B0 = cmaVar.mo4572B0();
            this.f26613a = 2;
            obj = AbstractC3224d.m15542u(eh9VarMo4572B0, this);
        } else {
            C3244l c3244l = c2146e.f26670S;
            c3244l.getClass();
            c3244l.m15572j(null, "Couldn't complete this action. Please try again.");
        }
        return xfa.f68157a;
    }
}
