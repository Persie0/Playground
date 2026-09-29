package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.C0035b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.SortedSet;
import androidx.compose.p002ui.unit.LayoutDirection;
import coil.compose.C0858a;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import com.google.protobuf.AbstractC1180a;
import com.google.protobuf.ByteString;
import com.google.protobuf.C1181b;
import com.lingq.core.data.repository.C1291g;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.IntConsumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class m58 implements dx5, lr9, ph7, ma1 {

    /* JADX INFO: renamed from: c */
    public static final qk3 f50614c = new qk3(1);

    /* JADX INFO: renamed from: d */
    public static final gr7 f50615d = new gr7(17);

    /* JADX INFO: renamed from: e */
    public static final ghd f50616e = new ghd();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50617a;

    /* JADX INFO: renamed from: b */
    public Object f50618b;

    public m58(int i) {
        px5 px5Var;
        this.f50617a = i;
        switch (i) {
            case 3:
                int i2 = w1c.f66234a;
                gw9 gw9Var = new gw9(new xdc[]{gz8.f41568i, f50616e}, 11);
                Charset charset = m9c.f50823a;
                this.f50618b = gw9Var;
                break;
            case 11:
                this.f50618b = new gw9(9);
                break;
            case 18:
                this.f50618b = new SortedSet(AbstractC3352my.f52016c);
                break;
            case 24:
                this.f50618b = null;
                break;
            default:
                try {
                    px5Var = (px5) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    px5Var = f50614c;
                }
                px5[] px5VarArr = {qk3.f57866b, px5Var};
                lp5 lp5Var = new lp5();
                lp5Var.f49978a = px5VarArr;
                Charset charset2 = o94.f54077a;
                this.f50618b = lp5Var;
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public static m58 m16638l(boolean z, int i, int i2, int i3, int i4) {
        return new m58(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z), 4);
    }

    /* JADX INFO: renamed from: a */
    public void m16639a(C0357g c0357g) {
        if (!c0357g.m1569L()) {
            i54.m13663b("DepthSortedSet.add called on an unattached node");
        }
        ((SortedSet) this.f50618b).add(c0357g);
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: b */
    public void mo10740b(hw5 hw5Var, boolean z) {
        if (hw5Var instanceof om9) {
            hw5Var.mo13528k().m13520c(false);
        }
        dx5 dx5Var = ((C0035b) this.f50618b).f1218e;
        if (dx5Var != null) {
            dx5Var.mo10740b(hw5Var, z);
        }
    }

    @Override // p000.ma1
    /* JADX INFO: renamed from: c */
    public long mo16640c() {
        ta2 ta2Var = (ta2) this.f50618b;
        return ((ms5) thb.m22050i(ta2Var, ps5.f56764b)).f51799a.f55854g;
    }

    /* JADX INFO: renamed from: d */
    public void m16641d() {
        ((tld) ((gw9) this.f50618b).f41432b).m22202q(null);
    }

    /* JADX INFO: renamed from: e */
    public void m16642e() {
        ((kf1) this.f50618b).getClass();
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        long j3 = ((f84) ((ui3) this.f50618b).mo0a()).f38612a;
        int iM19775e = AbstractC3489q9.m19775e(j84Var.f45185a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr);
        return (((long) AbstractC3489q9.m19775e(j84Var.f45186b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM19775e) << 32);
    }

    /* JADX INFO: renamed from: g */
    public wta m16643g(z21 z21Var) {
        ny8 ny8Var = (ny8) this.f50618b;
        String strM25413b = z21Var.m25413b();
        if (strM25413b != null) {
            return ny8Var.m17675B(z21Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b));
        }
        C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Object m16644h(SuspendLambda suspendLambda) {
        Object objM7190c = ((C1291g) ((mu1) this.f50618b)).m7190c(suspendLambda);
        return objM7190c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7190c : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i */
    public void m16645i(String str, Bundle bundle) {
        sy2 sy2Var = sy2.f61585a;
        if (ema.m11256c()) {
            ((C3012fs) this.f50618b).m12040g(str, bundle);
        }
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: j */
    public boolean mo10741j(hw5 hw5Var) {
        C0035b c0035b = (C0035b) this.f50618b;
        if (hw5Var == c0035b.f1216c) {
            return false;
        }
        c0035b.f1213T = ((mw5) ((om9) hw5Var).getItem()).f51942a;
        dx5 dx5Var = c0035b.f1218e;
        if (dx5Var != null) {
            return dx5Var.mo10741j(hw5Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m16646k() {
        ((hd3) this.f50618b).f42212N.m2146S();
    }

    /* JADX INFO: renamed from: m */
    public void m16647m(C1150a c1150a, Thread thread, Throwable th) {
        C1148a c1148a = (C1148a) this.f50618b;
        synchronized (c1148a) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            n9d.m17300b();
            try {
                hna.m13378a(c1148a.f13654e.f13668a.m9856b(new op1(c1148a, System.currentTimeMillis(), th, thread, c1150a)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m16648n(C0357g c0357g) {
        if (!c0357g.m1569L()) {
            i54.m13663b("DepthSortedSet.remove called on an unattached node");
        }
        return ((SortedSet) this.f50618b).remove(c0357g);
    }

    /* JADX INFO: renamed from: o */
    public void m16649o(int i, ByteString byteString) {
        C1181b c1181b = (C1181b) this.f50618b;
        c1181b.m6806o(i, 2);
        c1181b.m6799h(byteString);
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: p */
    public void mo11812p(Drawable drawable) {
    }

    /* JADX INFO: renamed from: q */
    public void m16650q(int i, Object obj, xm8 xm8Var) {
        C1181b c1181b = (C1181b) this.f50618b;
        c1181b.m6806o(i, 3);
        xm8Var.mo6834d((AbstractC1180a) obj, c1181b.f13931a);
        c1181b.m6806o(i, 4);
    }

    /* JADX INFO: renamed from: r */
    public void m16651r(int i, Object obj, xm8 xm8Var) {
        C1181b c1181b = (C1181b) this.f50618b;
        AbstractC1180a abstractC1180a = (AbstractC1180a) obj;
        c1181b.m6806o(i, 2);
        c1181b.m6807p(abstractC1180a.mo6790h(xm8Var));
        xm8Var.mo6834d(abstractC1180a, c1181b.f13931a);
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: s */
    public void mo11813s(Drawable drawable) {
    }

    public String toString() {
        switch (this.f50617a) {
            case 18:
                return ((SortedSet) this.f50618b).toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.lr9
    /* JADX INFO: renamed from: u */
    public void mo11814u(Drawable drawable) {
        C0858a c0858a = (C0858a) this.f50618b;
        c0858a.m4954l(new C3313lw(drawable != null ? c0858a.m4953k(drawable) : null));
    }

    public m58(Set set) {
        this.f50617a = 0;
        this.f50618b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            l58 l58Var = (l58) it.next();
            HashMap map = (HashMap) this.f50618b;
            l58Var.getClass();
            map.put(jx1.class, l58Var.f49092a);
        }
    }

    public m58(mu1 mu1Var) {
        this.f50617a = 22;
        mu1Var.getClass();
        this.f50618b = mu1Var;
    }

    public m58(mm6 mm6Var) {
        this.f50617a = 27;
        mm6Var.getClass();
        this.f50618b = mm6Var;
    }

    public m58(vma vmaVar) {
        this.f50617a = 19;
        vmaVar.getClass();
        this.f50618b = vmaVar;
    }

    public m58(s2b s2bVar) {
        this.f50617a = 26;
        s2bVar.getClass();
        this.f50618b = s2bVar;
    }

    public m58(zw0 zw0Var) {
        this.f50617a = 21;
        zw0Var.getClass();
        this.f50618b = zw0Var;
    }

    public m58(lj2 lj2Var) {
        this.f50617a = 25;
        lj2Var.getClass();
        this.f50618b = lj2Var;
    }

    public m58(Context context) {
        this.f50617a = 28;
        this.f50618b = new C3012fs(context, (String) null);
    }

    public m58(Context context, String str) {
        this.f50617a = 28;
        this.f50618b = new C3012fs(context, str);
    }

    public m58(C1181b c1181b) {
        this.f50617a = 12;
        Charset charset = p94.f55800a;
        if (c1181b != null) {
            this.f50618b = c1181b;
            c1181b.f13931a = this;
        } else {
            C3386nv.m17635v("output");
            throw null;
        }
    }

    public m58(cua cuaVar, zta ztaVar, qr1 qr1Var) {
        this.f50617a = 2;
        cuaVar.getClass();
        ztaVar.getClass();
        qr1Var.getClass();
        this.f50618b = new ny8(cuaVar, ztaVar, qr1Var);
    }

    public m58(int i, long j, TimeUnit timeUnit) {
        this.f50617a = 14;
        timeUnit.getClass();
        as9 as9Var = as9.f7432l;
        as9Var.getClass();
        this.f50618b = new kl2(as9Var, i, j, timeUnit);
    }

    public /* synthetic */ m58(Object obj, int i) {
        this.f50617a = i;
        this.f50618b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hw2] */
    public m58(jw2 jw2Var, Context context) {
        this.f50617a = 20;
        this.f50618b = jw2Var;
        new WeakReference(context);
        context.registerDeviceIdChangeListener(new iw2(jw2Var.f46303u.m16990a(jw2Var.f46301s, null), 0), new IntConsumer() { // from class: hw2
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                ((jw2) this.f43031a.f50618b).m14728z(1, Integer.valueOf(i), 19);
            }
        });
    }
}
