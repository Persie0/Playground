package com.lingq.feature.onboarding.p014v2.pages;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.io2;
import p000.ss5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1", m4291f = "PersonalizingPage.kt", m4292l = {71, 80, 85, 90, 95, 103}, m4293m = "invokeSuspend", m4294v = 2)
final class PersonalizingPageKt$PersonalizingPage$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f27491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0059a f27492c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f27493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizingPageKt$PersonalizingPage$1$1(boolean z, C0059a c0059a, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f27491b = z;
        this.f27492c = c0059a;
        this.f27493d = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalizingPageKt$PersonalizingPage$1$1(this.f27491b, this.f27492c, this.f27493d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalizingPageKt$PersonalizingPage$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009e A[PHI: r8
      0x009e: PHI (r8v4 com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1) = 
      (r8v2 com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1)
      (r8v5 com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1)
     binds: [B:25:0x009b, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e A[PHI: r8
      0x001e: PHI (r8v6 com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1) = 
      (r8v4 com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1)
      (r8v7 com.lingq.feature.onboarding.v2.pages.PersonalizingPageKt$PersonalizingPage$1$1)
     binds: [B:28:0x00b9, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (r11 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PersonalizingPageKt$PersonalizingPage$1$1 personalizingPageKt$PersonalizingPage$1$1;
        Float f;
        fda fdaVarM21703b0;
        Float f2;
        fda fdaVarM21703b1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.f27490a) {
            case 0:
                AbstractC3193b.m15359b(obj);
                if (this.f27491b) {
                    Float f3 = new Float(1.0f);
                    fda fdaVarM21703b2 = ss5.m21703b0(400, 0, io2.f44352d, 2);
                    this.f27490a = 1;
                    obj = C0059a.m744c(this.f27492c, f3, fdaVarM21703b2, null, this, 12);
                    break;
                } else {
                    personalizingPageKt$PersonalizingPage$1$1 = this;
                    boolean z = personalizingPageKt$PersonalizingPage$1$1.f27493d;
                    C0059a c0059a = personalizingPageKt$PersonalizingPage$1$1.f27492c;
                    if (!z) {
                        Float f4 = new Float(0.05f);
                        fda fdaVarM21703b3 = ss5.m21703b0(300, 0, io2.f44352d, 2);
                        personalizingPageKt$PersonalizingPage$1$1.f27490a = 6;
                        obj = C0059a.m744c(c0059a, f4, fdaVarM21703b3, null, personalizingPageKt$PersonalizingPage$1$1, 12);
                    } else {
                        Float f5 = new Float(0.25f);
                        fda fdaVarM21703b4 = ss5.m21703b0(800, 0, io2.f44352d, 2);
                        personalizingPageKt$PersonalizingPage$1$1.f27490a = 2;
                        if (C0059a.m744c(c0059a, f5, fdaVarM21703b4, null, personalizingPageKt$PersonalizingPage$1$1, 12) != coroutineSingletons) {
                            f = new Float(0.55f);
                            fdaVarM21703b0 = ss5.m21703b0(1200, 0, io2.f44352d, 2);
                            personalizingPageKt$PersonalizingPage$1$1.f27490a = 3;
                            if (C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f, fdaVarM21703b0, null, personalizingPageKt$PersonalizingPage$1$1, 12) != coroutineSingletons) {
                                f2 = new Float(0.75f);
                                fdaVarM21703b1 = ss5.m21703b0(1500, 0, io2.f44352d, 2);
                                personalizingPageKt$PersonalizingPage$1$1.f27490a = 4;
                                if (C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f2, fdaVarM21703b1, null, personalizingPageKt$PersonalizingPage$1$1, 12) != coroutineSingletons) {
                                    Float f6 = new Float(0.9f);
                                    fda fdaVarM21703b5 = ss5.m21703b0(2500, 0, io2.f44352d, 2);
                                    personalizingPageKt$PersonalizingPage$1$1.f27490a = 5;
                                    obj = C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f6, fdaVarM21703b5, null, personalizingPageKt$PersonalizingPage$1$1, 12);
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(obj);
                return xfa.f68157a;
            case 2:
                AbstractC3193b.m15359b(obj);
                personalizingPageKt$PersonalizingPage$1$1 = this;
                f = new Float(0.55f);
                fdaVarM21703b0 = ss5.m21703b0(1200, 0, io2.f44352d, 2);
                personalizingPageKt$PersonalizingPage$1$1.f27490a = 3;
                if (C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f, fdaVarM21703b0, null, personalizingPageKt$PersonalizingPage$1$1, 12) != coroutineSingletons) {
                    f2 = new Float(0.75f);
                    fdaVarM21703b1 = ss5.m21703b0(1500, 0, io2.f44352d, 2);
                    personalizingPageKt$PersonalizingPage$1$1.f27490a = 4;
                    if (C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f2, fdaVarM21703b1, null, personalizingPageKt$PersonalizingPage$1$1, 12) != coroutineSingletons) {
                        Float f7 = new Float(0.9f);
                        fda fdaVarM21703b6 = ss5.m21703b0(2500, 0, io2.f44352d, 2);
                        personalizingPageKt$PersonalizingPage$1$1.f27490a = 5;
                        obj = C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f7, fdaVarM21703b6, null, personalizingPageKt$PersonalizingPage$1$1, 12);
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                AbstractC3193b.m15359b(obj);
                personalizingPageKt$PersonalizingPage$1$1 = this;
                f2 = new Float(0.75f);
                fdaVarM21703b1 = ss5.m21703b0(1500, 0, io2.f44352d, 2);
                personalizingPageKt$PersonalizingPage$1$1.f27490a = 4;
                if (C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f2, fdaVarM21703b1, null, personalizingPageKt$PersonalizingPage$1$1, 12) != coroutineSingletons) {
                    Float f8 = new Float(0.9f);
                    fda fdaVarM21703b7 = ss5.m21703b0(2500, 0, io2.f44352d, 2);
                    personalizingPageKt$PersonalizingPage$1$1.f27490a = 5;
                    obj = C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f8, fdaVarM21703b7, null, personalizingPageKt$PersonalizingPage$1$1, 12);
                    break;
                }
                return coroutineSingletons;
            case 4:
                AbstractC3193b.m15359b(obj);
                personalizingPageKt$PersonalizingPage$1$1 = this;
                Float f9 = new Float(0.9f);
                fda fdaVarM21703b8 = ss5.m21703b0(2500, 0, io2.f44352d, 2);
                personalizingPageKt$PersonalizingPage$1$1.f27490a = 5;
                obj = C0059a.m744c(personalizingPageKt$PersonalizingPage$1$1.f27492c, f9, fdaVarM21703b8, null, personalizingPageKt$PersonalizingPage$1$1, 12);
                break;
            case 5:
                AbstractC3193b.m15359b(obj);
                return xfa.f68157a;
            case 6:
                AbstractC3193b.m15359b(obj);
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
