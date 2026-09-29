package coil.decode;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.C3757xf;
import p000.g04;
import p000.i32;
import p000.sz6;
import p000.vv8;

/* JADX INFO: renamed from: coil.decode.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0859a {

    /* JADX INFO: renamed from: a */
    public final g04 f10445a;

    /* JADX INFO: renamed from: b */
    public final sz6 f10446b;

    /* JADX INFO: renamed from: c */
    public final vv8 f10447c;

    /* JADX INFO: renamed from: d */
    public final ExifOrientationPolicy f10448d;

    public C0859a(g04 g04Var, sz6 sz6Var, vv8 vv8Var, ExifOrientationPolicy exifOrientationPolicy) {
        this.f10445a = g04Var;
        this.f10446b = sz6Var;
        this.f10447c = vv8Var;
        this.f10448d = exifOrientationPolicy;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m4955a(ContinuationImpl continuationImpl) throws Throwable {
        BitmapFactoryDecoder$decode$1 bitmapFactoryDecoder$decode$1;
        vv8 vv8Var;
        Throwable th;
        vv8 vv8Var2;
        if (continuationImpl instanceof BitmapFactoryDecoder$decode$1) {
            bitmapFactoryDecoder$decode$1 = (BitmapFactoryDecoder$decode$1) continuationImpl;
            int i = bitmapFactoryDecoder$decode$1.f10444e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bitmapFactoryDecoder$decode$1.f10444e = i - Integer.MIN_VALUE;
            } else {
                bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuationImpl);
            }
        } else {
            bitmapFactoryDecoder$decode$1 = new BitmapFactoryDecoder$decode$1(this, continuationImpl);
        }
        Object obj = bitmapFactoryDecoder$decode$1.f10442c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bitmapFactoryDecoder$decode$1.f10444e;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                bitmapFactoryDecoder$decode$1.f10440a = this;
                vv8Var = this.f10447c;
                bitmapFactoryDecoder$decode$1.f10441b = vv8Var;
                bitmapFactoryDecoder$decode$1.f10444e = 1;
                if (vv8Var.m15598d(bitmapFactoryDecoder$decode$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vv8Var2 = (vv8) bitmapFactoryDecoder$decode$1.f10440a;
                try {
                    AbstractC3193b.m15359b(obj);
                    i32 i32Var = (i32) obj;
                    vv8Var2.m15600f();
                    return i32Var;
                } catch (Throwable th2) {
                    th = th2;
                    vv8Var2.m15600f();
                    throw th;
                }
            }
            vv8 vv8Var3 = bitmapFactoryDecoder$decode$1.f10441b;
            C0859a c0859a = (C0859a) bitmapFactoryDecoder$decode$1.f10440a;
            AbstractC3193b.m15359b(obj);
            vv8Var = vv8Var3;
            this = c0859a;
            C3757xf c3757xf = new C3757xf(this, 5);
            bitmapFactoryDecoder$decode$1.f10440a = vv8Var;
            bitmapFactoryDecoder$decode$1.f10441b = null;
            bitmapFactoryDecoder$decode$1.f10444e = 2;
            Object objM15444k = AbstractC3208a.m15444k(c3757xf, bitmapFactoryDecoder$decode$1);
            if (objM15444k != coroutineSingletons) {
                vv8 vv8Var4 = vv8Var;
                obj = objM15444k;
                vv8Var2 = vv8Var4;
                i32 i32Var2 = (i32) obj;
                vv8Var2.m15600f();
                return i32Var2;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            vv8 vv8Var5 = vv8Var;
            th = th3;
            vv8Var2 = vv8Var5;
            vv8Var2.m15600f();
            throw th;
        }
    }
}
