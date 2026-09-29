package com.lingq.core.p012ui.highlightedtext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.C0855a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import p000.C3386nv;
import p000.c32;
import p000.cd9;
import p000.d04;
import p000.e04;
import p000.f04;
import p000.g84;
import p000.l70;
import p000.p58;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$1$1$1$1", m4291f = "HighlightedText.kt", m4292l = {265}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f23983b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23984c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f23985d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f23986e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cd9 f23987f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23988g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ cd9 f23989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$1$1$1$1(Context context, String str, int i, int i2, cd9 cd9Var, String str2, cd9 cd9Var2, Continuation continuation) {
        super(2, continuation);
        this.f23983b = context;
        this.f23984c = str;
        this.f23985d = i;
        this.f23986e = i2;
        this.f23987f = cd9Var;
        this.f23988g = str2;
        this.f23989h = cd9Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HighlightedTextKt$HighlightedText$1$1$1$1(this.f23983b, this.f23984c, this.f23985d, this.f23986e, this.f23987f, this.f23988g, this.f23989h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HighlightedTextKt$HighlightedText$1$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM4952c;
        long jGreen;
        long jBlue;
        int i;
        int iRgb;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f23982a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Context context = this.f23983b;
            d04 d04Var = new d04(context);
            d04Var.f34778c = this.f23984c;
            d04Var.m9962c(this.f23985d, this.f23986e);
            d04Var.f34786k = Boolean.FALSE;
            e04 e04VarM9960a = d04Var.m9960a();
            C0855a c0855aM18903m = p58.m18903m(context);
            this.f23982a = 1;
            objM4952c = c0855aM18903m.m4952c(e04VarM9960a, this);
            if (objM4952c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM4952c = obj;
        }
        Drawable drawableMo11418a = ((f04) objM4952c).mo11418a();
        BitmapDrawable bitmapDrawable = drawableMo11418a instanceof BitmapDrawable ? (BitmapDrawable) drawableMo11418a : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            Regex regex = AbstractC1932c.f24144a;
            int height = bitmap.getHeight() / 20;
            if (height < 1) {
                height = 1;
            }
            int i4 = 0;
            g84 g84VarM15914E = l70.m15914E(height, l70.m15922M(0, bitmap.getHeight()));
            int i5 = g84VarM15914E.f40379a;
            int i6 = g84VarM15914E.f40380b;
            int i7 = g84VarM15914E.f40381c;
            long jRed = 0;
            if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
                jGreen = 0;
                jBlue = 0;
                i = 0;
            } else {
                int i8 = 0;
                jGreen = 0;
                jBlue = 0;
                while (true) {
                    int[] iArr = {i4, bitmap.getWidth() - i3};
                    for (int i9 = i4; i9 < 2; i9++) {
                        int pixel = bitmap.getPixel(iArr[i9], i5);
                        jRed += (long) Color.red(pixel);
                        jGreen += (long) Color.green(pixel);
                        jBlue += (long) Color.blue(pixel);
                        i8++;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                    i3 = 1;
                    i4 = 0;
                }
                i = i8;
            }
            if (i == 0) {
                iRgb = -7829368;
            } else {
                long j = i;
                iRgb = Color.rgb((int) (jRed / j), (int) (jGreen / j), (int) (jBlue / j));
            }
            Integer num = new Integer(iRgb);
            cd9 cd9Var = this.f23987f;
            String str = this.f23988g;
            cd9Var.put(str, num);
            this.f23989h.put(str, bitmap);
        }
        return xfa.f68157a;
    }
}
