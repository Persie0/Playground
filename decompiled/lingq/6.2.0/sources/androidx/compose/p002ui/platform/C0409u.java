package androidx.compose.p002ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.compose.runtime.AbstractC0278f;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import p000.C3386nv;
import p000.a7b;
import p000.do7;
import p000.dp5;
import p000.eh0;
import p000.eh9;
import p000.in1;
import p000.jn1;
import p000.kk8;
import p000.kn1;
import p000.n66;
import p000.nn9;
import p000.pg9;
import p000.ph2;
import p000.qc9;
import p000.r46;
import p000.v72;
import p000.vl1;
import p000.wfb;
import p000.z26;
import p000.z6b;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0409u implements z26 {

    /* JADX INFO: renamed from: a */
    public final Context f4863a;

    /* JADX INFO: renamed from: b */
    public vl1 f4864b;

    /* JADX INFO: renamed from: c */
    public final qc9 f4865c = AbstractC0278f.m1256f(1.0f);

    /* JADX INFO: renamed from: d */
    public pg9 f4866d;

    public C0409u(Context context) {
        this.f4863a = context;
    }

    @Override // p000.z26
    /* JADX INFO: renamed from: A */
    public final float mo1819A() {
        eh9 eh9Var;
        if (this.f4866d == null) {
            Context context = this.f4863a;
            n66 n66Var = a7b.f332a;
            synchronized (n66Var) {
                try {
                    Object objM17255g = n66Var.m17255g(context);
                    if (objM17255g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
                        kk8 kk8Var = new kk8(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new z6b(c3211aM10525a, Handler.createAsync(Looper.getMainLooper())), c3211aM10525a, context, null));
                        nn9 nn9VarM20384i = r46.m20384i();
                        v72 v72Var = ph2.f56212a;
                        objM17255g = AbstractC3224d.m15520B(kk8Var, new vl1(eh0.m11113J(nn9VarM20384i, dp5.f36000a)), new C3243k(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        n66Var.m17261m(context, objM17255g);
                    }
                    eh9Var = (eh9) objM17255g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4865c.m19862i(((Number) eh9Var.getValue()).floatValue());
            vl1 vl1Var = this.f4864b;
            if (vl1Var == null) {
                C3386nv.m17633t("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f4866d = wfb.m23926u(vl1Var, null, null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(eh9Var, this, null), 3);
        }
        return this.f4865c.m19861h();
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
