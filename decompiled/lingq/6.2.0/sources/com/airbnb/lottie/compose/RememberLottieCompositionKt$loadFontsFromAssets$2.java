package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.c32;
import p000.gl5;
import p000.qa3;
import p000.tj5;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", m4291f = "rememberLottieComposition.kt", m4292l = {}, m4293m = "invokeSuspend")
final class RememberLottieCompositionKt$loadFontsFromAssets$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gl5 f10694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f10695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10696c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f10697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadFontsFromAssets$2(gl5 gl5Var, Context context, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f10694a = gl5Var;
        this.f10695b = context;
        this.f10696c = str;
        this.f10697d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$loadFontsFromAssets$2(this.f10694a, this.f10695b, this.f10696c, this.f10697d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        RememberLottieCompositionKt$loadFontsFromAssets$2 rememberLottieCompositionKt$loadFontsFromAssets$2 = (RememberLottieCompositionKt$loadFontsFromAssets$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        rememberLottieCompositionKt$loadFontsFromAssets$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        for (qa3 qa3Var : this.f10694a.f40962f.values()) {
            Context context = this.f10695b;
            qa3Var.getClass();
            String str = this.f10697d;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), AbstractC3393o1.m17735j(this.f10696c, qa3Var.f57488a, str));
                try {
                    typefaceCreateFromAsset.getClass();
                    String str2 = qa3Var.f57490c;
                    str2.getClass();
                    int i = 0;
                    boolean zM23380c0 = vk9.m23380c0(str2, "Italic", false);
                    boolean zM23380c1 = vk9.m23380c0(str2, "Bold", false);
                    if (zM23380c0 && zM23380c1) {
                        i = 3;
                    } else if (zM23380c0) {
                        i = 2;
                    } else if (zM23380c1) {
                        i = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    qa3Var.f57491d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    tj5.m22150b();
                }
            } catch (Exception unused2) {
                tj5.m22150b();
            }
        }
        return xfa.f68157a;
    }
}
