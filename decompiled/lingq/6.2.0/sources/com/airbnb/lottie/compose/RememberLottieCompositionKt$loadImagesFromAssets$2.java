package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cl9;
import p000.fna;
import p000.gl5;
import p000.tj5;
import p000.un1;
import p000.vk9;
import p000.wl5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", m4291f = "rememberLottieComposition.kt", m4292l = {}, m4293m = "invokeSuspend")
final class RememberLottieCompositionKt$loadImagesFromAssets$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gl5 f10698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f10699b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadImagesFromAssets$2(gl5 gl5Var, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f10698a = gl5Var;
        this.f10699b = context;
        this.f10700c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$loadImagesFromAssets$2(this.f10698a, this.f10699b, this.f10700c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        RememberLottieCompositionKt$loadImagesFromAssets$2 rememberLottieCompositionKt$loadImagesFromAssets$2 = (RememberLottieCompositionKt$loadImagesFromAssets$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        rememberLottieCompositionKt$loadImagesFromAssets$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        for (wl5 wl5Var : ((HashMap) this.f10698a.m12732f()).values()) {
            wl5Var.getClass();
            if (wl5Var.m24049a() == null) {
                String strM24050b = wl5Var.m24050b();
                if (cl9.m4842Y(strM24050b, "data:", false) && vk9.m23389l0(strM24050b, "base64,", 0, false, 6) > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strM24050b.substring(vk9.m23388k0(strM24050b, ',', 0, 6) + 1), 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        wl5Var.m24053e(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                    } catch (IllegalArgumentException e) {
                        tj5.m22152d("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.f10699b;
            if (wl5Var.m24049a() == null && (str = this.f10700c) != null) {
                String strM24050b2 = wl5Var.m24050b();
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str + strM24050b2);
                    inputStreamOpen.getClass();
                    Bitmap bitmapDecodeStream = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e2) {
                        tj5.m22152d("Unable to decode image.", e2);
                    }
                    if (bitmapDecodeStream != null) {
                        wl5Var.m24053e(fna.m11959e(bitmapDecodeStream, wl5Var.m24052d(), wl5Var.m24051c()));
                    }
                } catch (IOException e3) {
                    tj5.m22152d("Unable to open asset.", e3);
                }
            }
        }
        return xfa.f68157a;
    }
}
