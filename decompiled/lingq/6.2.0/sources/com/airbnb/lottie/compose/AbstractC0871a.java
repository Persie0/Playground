package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import java.util.HashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3497qg;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bm5;
import p000.d32;
import p000.do7;
import p000.e16;
import p000.eh0;
import p000.fa4;
import p000.fna;
import p000.g9a;
import p000.gl5;
import p000.gm5;
import p000.gq5;
import p000.km8;
import p000.knb;
import p000.ll5;
import p000.nl5;
import p000.omd;
import p000.p84;
import p000.ph2;
import p000.pk9;
import p000.qh0;
import p000.sm0;
import p000.ss5;
import p000.t62;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.v72;
import p000.vi3;
import p000.w48;
import p000.we1;
import p000.wfb;
import p000.x18;
import p000.x89;
import p000.xfa;
import p000.ye1;
import p000.ym0;
import p000.zi3;

/* JADX INFO: renamed from: com.airbnb.lottie.compose.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0871a {
    /* JADX INFO: renamed from: a */
    public static final void m5021a(final gl5 gl5Var, final ui3 ui3Var, final e16 e16Var, ye1 ye1Var, final int i) {
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(382909894);
        final RenderMode renderMode = RenderMode.AUTOMATIC;
        final AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
        tj3Var.m22113c0(185152185);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = new C0868b();
            tj3Var.m22131l0(objM22097O);
        }
        final C0868b c0868b = (C0868b) objM22097O;
        tj3Var.m22139q(false);
        tj3Var.m22113c0(185152232);
        Object objM22097O2 = tj3Var.m22097O();
        if (objM22097O2 == p84Var) {
            objM22097O2 = new Matrix();
            tj3Var.m22131l0(objM22097O2);
        }
        final Matrix matrix = (Matrix) objM22097O2;
        tj3Var.m22139q(false);
        tj3Var.m22113c0(185152312);
        boolean zM22120g = tj3Var.m22120g(gl5Var);
        Object objM22097O3 = tj3Var.m22097O();
        if (zM22120g || objM22097O3 == p84Var) {
            objM22097O3 = AbstractC0278f.m1260j(null);
            tj3Var.m22131l0(objM22097O3);
        }
        final t66 t66Var = (t66) objM22097O3;
        tj3Var.m22139q(false);
        tj3Var.m22113c0(185152364);
        if (gl5Var == null || gl5Var.m12729c() == 0.0f) {
            qh0.m19963a(e16Var, tj3Var, (i >> 6) & 14);
            tj3Var.m22139q(false);
            x18 x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3(ui3Var, e16Var, renderMode, asyncUpdates, i) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ ui3 f10673c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ e16 f10674d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ int f10675e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                        this.f10675e = i;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        int iM19383z = pk9.m19383z(this.f10675e | 1);
                        AbstractC0871a.m5021a(this.f10672b, this.f10673c, this.f10674d, (ye1) obj, iM19383z);
                        return xfa.f68157a;
                    }
                };
                return;
            }
            return;
        }
        tj3Var.m22139q(false);
        final Rect rectM12728b = gl5Var.m12728b();
        final Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
        eh0.m11124d(knb.m15340a(rectM12728b.width(), rectM12728b.height(), e16Var), new vi3() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                ym0 ym0VarM16515r = interfaceC0310a.mo603o0().m16515r();
                Rect rect = rectM12728b;
                long jM10528d = do7.m10528d(rect.width(), rect.height());
                long jM18149g = omd.m18149g(ss5.m21693T(x89.m24407d(interfaceC0310a.mo1422h())), ss5.m21693T(x89.m24405b(interfaceC0310a.mo1422h())));
                float fM21636n = AbstractC3584sr.m21636n(jM10528d, interfaceC0310a.mo1422h());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM21636n)) << 32) | (((long) Float.floatToRawIntBits(fM21636n)) & 4294967295L);
                int i2 = km8.f47515a;
                float fM24407d = x89.m24407d(jM10528d);
                int i3 = km8.f47515a;
                int i4 = (int) (jFloatToRawIntBits >> 32);
                int i5 = (int) (jFloatToRawIntBits & 4294967295L);
                long jM18149g2 = omd.m18149g((int) (Float.intBitsToFloat(i4) * fM24407d), (int) (Float.intBitsToFloat(i5) * x89.m24405b(jM10528d)));
                long jRound = (((long) Math.round(((interfaceC0310a.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jM18149g >> 32)) - ((int) (jM18149g2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (jM18149g & 4294967295L)) - ((int) (jM18149g2 & 4294967295L))) / 2.0f))) & 4294967295L);
                Matrix matrix2 = matrix;
                matrix2.reset();
                matrix2.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
                matrix2.preScale(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5));
                LottieFeatureFlag lottieFeatureFlag = LottieFeatureFlag.MergePathsApi19;
                C0868b c0868b2 = c0868b;
                c0868b2.m5004i(lottieFeatureFlag, false);
                c0868b2.m4995I();
                c0868b2.m4994H(renderMode);
                c0868b2.m5014t(asyncUpdates);
                c0868b2.m5017w(gl5Var);
                c0868b2.m5018x(null);
                g9a.m12435l(t66Var.getValue());
                c0868b2.m4992F(false);
                c0868b2.m5012r();
                c0868b2.m5013s();
                c0868b2.m5020z();
                c0868b2.m5016v(true);
                c0868b2.m5015u(false);
                gq5 gq5VarM5007l = c0868b2.m5007l();
                if (c0868b2.m4998b(context) || gq5VarM5007l == null) {
                    c0868b2.m4993G(((Number) ui3Var.mo0a()).floatValue());
                } else {
                    c0868b2.m4993G(gq5VarM5007l.f41187b);
                }
                c0868b2.setBounds(0, 0, rect.width(), rect.height());
                c0868b2.m5002g(AbstractC3497qg.m19936a(ym0VarM16515r), matrix2);
                return xfa.f68157a;
            }
        }, tj3Var, 0);
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new zi3(ui3Var, e16Var, renderMode, asyncUpdates, i) { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ui3 f10686c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ e16 f10687d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f10688e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.f10688e = i;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iM19383z = pk9.m19383z(this.f10688e | 1);
                    AbstractC0871a.m5021a(this.f10685b, this.f10686c, this.f10687d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C0872b m5022b(gl5 gl5Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22113c0(683659508);
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.Immediately;
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is 1.0.").toString());
        }
        tj3Var.m22113c0(2024497114);
        tj3Var.m22113c0(-610207850);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = new C0872b();
            tj3Var.m22131l0(objM22097O);
        }
        C0872b c0872b = (C0872b) objM22097O;
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
        tj3Var.m22113c0(-180606964);
        Object objM22097O2 = tj3Var.m22097O();
        if (objM22097O2 == p84Var) {
            objM22097O2 = AbstractC0278f.m1260j(true);
            tj3Var.m22131l0(objM22097O2);
        }
        t66 t66Var = (t66) objM22097O2;
        tj3Var.m22139q(false);
        tj3Var.m22113c0(-180606834);
        float fM11958d = 1.0f / fna.m11958d((Context) tj3Var.m22128k(AbstractC0394f.f4761b));
        tj3Var.m22139q(false);
        d32.m10053n(new Object[]{gl5Var, true, null, Float.valueOf(fM11958d), Integer.MAX_VALUE}, new C0869x2383193e(c0872b, gl5Var, fM11958d, lottieCancellationBehavior, t66Var, null), tj3Var);
        tj3Var.m22139q(false);
        return c0872b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public static final Object m5023c(Context context, nl5 nl5Var, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        RememberLottieCompositionKt$lottieComposition$1 rememberLottieCompositionKt$lottieComposition$1;
        String str5;
        String str6;
        Context context2;
        String str7;
        Object objM23905G;
        String str8;
        gl5 gl5Var;
        Context context3;
        String str9;
        Object objM23905G2;
        if (continuationImpl instanceof RememberLottieCompositionKt$lottieComposition$1) {
            rememberLottieCompositionKt$lottieComposition$1 = (RememberLottieCompositionKt$lottieComposition$1) continuationImpl;
            int i = rememberLottieCompositionKt$lottieComposition$1.f10706f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rememberLottieCompositionKt$lottieComposition$1.f10706f = i - Integer.MIN_VALUE;
            } else {
                rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(continuationImpl);
            }
        } else {
            rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(continuationImpl);
        }
        Object objM21466r = rememberLottieCompositionKt$lottieComposition$1.f10705e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rememberLottieCompositionKt$lottieComposition$1.f10706f;
        Object obj = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21466r);
            bm5 bm5VarM5024d = m5024d(context, nl5Var, str4);
            rememberLottieCompositionKt$lottieComposition$1.f10701a = context;
            str5 = str;
            rememberLottieCompositionKt$lottieComposition$1.f10702b = str5;
            rememberLottieCompositionKt$lottieComposition$1.f10703c = str2;
            str6 = str3;
            rememberLottieCompositionKt$lottieComposition$1.f10704d = str6;
            rememberLottieCompositionKt$lottieComposition$1.f10706f = 1;
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(rememberLottieCompositionKt$lottieComposition$1));
            sm0Var.m21468u();
            bm5VarM5024d.m3874b(new w48(sm0Var, 0));
            bm5VarM5024d.m3873a(new w48(sm0Var, 1));
            objM21466r = sm0Var.m21466r();
            if (objM21466r != coroutineSingletons) {
                context2 = context;
                str7 = str2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str10 = (String) rememberLottieCompositionKt$lottieComposition$1.f10704d;
            String str11 = rememberLottieCompositionKt$lottieComposition$1.f10703c;
            String str12 = rememberLottieCompositionKt$lottieComposition$1.f10702b;
            context2 = (Context) rememberLottieCompositionKt$lottieComposition$1.f10701a;
            AbstractC3193b.m15359b(objM21466r);
            str6 = str10;
            str7 = str11;
            str5 = str12;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gl5 gl5Var2 = (gl5) rememberLottieCompositionKt$lottieComposition$1.f10701a;
                AbstractC3193b.m15359b(objM21466r);
                return gl5Var2;
            }
            gl5Var = (gl5) rememberLottieCompositionKt$lottieComposition$1.f10704d;
            str9 = rememberLottieCompositionKt$lottieComposition$1.f10703c;
            str8 = rememberLottieCompositionKt$lottieComposition$1.f10702b;
            context3 = (Context) rememberLottieCompositionKt$lottieComposition$1.f10701a;
            AbstractC3193b.m15359b(objM21466r);
        }
        rememberLottieCompositionKt$lottieComposition$1.f10701a = gl5Var;
        rememberLottieCompositionKt$lottieComposition$1.f10702b = null;
        rememberLottieCompositionKt$lottieComposition$1.f10703c = null;
        rememberLottieCompositionKt$lottieComposition$1.f10704d = null;
        rememberLottieCompositionKt$lottieComposition$1.f10706f = 3;
        if (!((HashMap) gl5Var.m12730d()).isEmpty()) {
            v72 v72Var = ph2.f56212a;
            Context context4 = context3;
            objM23905G2 = wfb.m23905G(new RememberLottieCompositionKt$loadFontsFromAssets$2(gl5Var, context4, str8, str9, null), t62.f61909c, rememberLottieCompositionKt$lottieComposition$1);
            if (objM23905G2 == coroutineSingletons) {
                obj = objM23905G2;
            }
        }
        if (obj != coroutineSingletons) {
            return coroutineSingletons;
        }
        return gl5Var;
        gl5 gl5Var3 = (gl5) objM21466r;
        rememberLottieCompositionKt$lottieComposition$1.f10701a = context2;
        rememberLottieCompositionKt$lottieComposition$1.f10702b = str7;
        rememberLottieCompositionKt$lottieComposition$1.f10703c = str6;
        rememberLottieCompositionKt$lottieComposition$1.f10704d = gl5Var3;
        rememberLottieCompositionKt$lottieComposition$1.f10706f = 2;
        if (gl5Var3.m12734h()) {
            v72 v72Var2 = ph2.f56212a;
            objM23905G = wfb.m23905G(new RememberLottieCompositionKt$loadImagesFromAssets$2(gl5Var3, context2, str5, null), t62.f61909c, rememberLottieCompositionKt$lottieComposition$1);
            if (objM23905G != coroutineSingletons) {
                objM23905G = obj;
            }
        } else {
            objM23905G = obj;
        }
        if (objM23905G != coroutineSingletons) {
            str8 = str7;
            gl5Var = gl5Var3;
            context3 = context2;
            str9 = str6;
            rememberLottieCompositionKt$lottieComposition$1.f10701a = gl5Var;
            rememberLottieCompositionKt$lottieComposition$1.f10702b = null;
            rememberLottieCompositionKt$lottieComposition$1.f10703c = null;
            rememberLottieCompositionKt$lottieComposition$1.f10704d = null;
            rememberLottieCompositionKt$lottieComposition$1.f10706f = 3;
            if (!((HashMap) gl5Var.m12730d()).isEmpty()) {
                v72 v72Var3 = ph2.f56212a;
                Context context5 = context3;
                objM23905G2 = wfb.m23905G(new RememberLottieCompositionKt$loadFontsFromAssets$2(gl5Var, context5, str8, str9, null), t62.f61909c, rememberLottieCompositionKt$lottieComposition$1);
                if (objM23905G2 == coroutineSingletons) {
                    obj = objM23905G2;
                }
            }
            if (obj != coroutineSingletons) {
                return gl5Var;
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: d */
    public static final bm5 m5024d(Context context, nl5 nl5Var, String str) {
        if (nl5Var instanceof nl5) {
            return fa4.m11650l(str, "__LottieInternalDefaultCacheKey__") ? ll5.m16354g(context, nl5Var.f52913a) : ll5.m16353f(nl5Var.f52913a, context, str);
        }
        gm5.m12750e();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final C0874d m5025e(nl5 nl5Var, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22113c0(-1248473602);
        RememberLottieCompositionKt$rememberLottieComposition$1 rememberLottieCompositionKt$rememberLottieComposition$1 = new RememberLottieCompositionKt$rememberLottieComposition$1(3, null);
        Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
        tj3Var.m22113c0(1388713953);
        boolean zM22120g = tj3Var.m22120g(nl5Var);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (zM22120g || objM22097O == p84Var) {
            objM22097O = AbstractC0278f.m1260j(new C0874d());
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        tj3Var.m22139q(false);
        tj3Var.m22113c0(1388714244);
        boolean zM22120g2 = tj3Var.m22120g(nl5Var) | tj3Var.m22120g("__LottieInternalDefaultCacheKey__");
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g2 || objM22097O2 == p84Var) {
            objM22097O2 = m5024d(context, nl5Var, "__LottieInternalDefaultCacheKey__");
            tj3Var.m22131l0(objM22097O2);
        }
        tj3Var.m22139q(false);
        d32.m10049l(nl5Var, "__LottieInternalDefaultCacheKey__", new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, nl5Var, t66Var, null), tj3Var);
        C0874d c0874d = (C0874d) t66Var.getValue();
        tj3Var.m22139q(false);
        return c0874d;
    }
}
