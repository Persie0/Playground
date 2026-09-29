package androidx.compose.p002ui.platform;

import p000.vh9;
import p000.zf1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0394f {

    /* JADX INFO: renamed from: a */
    public static final zf1 f4760a = new zf1(AndroidCompositionLocals_androidKt$LocalConfiguration$1.f4506b);

    /* JADX INFO: renamed from: b */
    public static final vh9 f4761b = new vh9(AndroidCompositionLocals_androidKt$LocalContext$1.f4507b);

    /* JADX INFO: renamed from: c */
    public static final zf1 f4762c = new zf1(AndroidCompositionLocals_androidKt$LocalResources$1.f4510b);

    /* JADX INFO: renamed from: d */
    public static final vh9 f4763d = new vh9(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.f4508b);

    /* JADX INFO: renamed from: e */
    public static final vh9 f4764e = new vh9(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.f4509b);

    /* JADX INFO: renamed from: f */
    public static final vh9 f4765f = new vh9(AndroidCompositionLocals_androidKt$LocalView$1.f4511b);

    /* JADX INFO: renamed from: a */
    public static final void m1796a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
