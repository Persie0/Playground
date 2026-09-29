package p000;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.contextmenu.internal.C0170a;
import androidx.media3.common.C0713b;
import androidx.room.util.AbstractC0758a;
import androidx.work.impl.C0773b;
import androidx.work.impl.C0778d;
import androidx.work.impl.WorkDatabase;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: wk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3725wk implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f66958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f66959d;

    public /* synthetic */ RunnableC3725wk(Object obj, Object obj2, Object obj3, int i) {
        this.f66956a = i;
        this.f66957b = obj;
        this.f66958c = obj2;
        this.f66959d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        final int i = 0;
        boolean zBooleanValue = true;
        char c = 1;
        switch (this.f66956a) {
            case 0:
                C0170a c0170a = (C0170a) this.f66957b;
                C3651uk c3651uk = (C3651uk) this.f66958c;
                C3688vk c3688vk = (C3688vk) this.f66959d;
                ActionMode actionModeStartActionMode = c0170a.f2860a.startActionMode(new a83(c3651uk), 1);
                fa4.m11650l(c0170a.f2867h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c3688vk.close();
                    return;
                }
                return;
            case 1:
                C3165jz c3165jz = (C3165jz) this.f66957b;
                final C0713b c0713b = (C0713b) this.f66958c;
                final o32 o32Var = (o32) this.f66959d;
                ew2 ew2Var = c3165jz.f46414b;
                String str = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                final C3496qf c3496qfM15807I = l52Var.m15807I();
                final char c2 = c == true ? 1 : 0;
                l52Var.m15808J(c3496qfM15807I, 1009, new sg5(c3496qfM15807I, c0713b, o32Var, c2) { // from class: g52

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f40224a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C3496qf f40225b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ C0713b f40226c;

                    {
                        this.f40224a = c2;
                    }

                    @Override // p000.sg5
                    public final void invoke(Object obj) {
                        int i2 = this.f40224a;
                        C0713b c0713b2 = this.f40226c;
                        C3496qf c3496qf = this.f40225b;
                        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
                        switch (i2) {
                            case 0:
                                interfaceC3534rf.mo20602A(c3496qf, c0713b2);
                                break;
                            default:
                                interfaceC3534rf.mo20613L(c3496qf, c0713b2);
                                break;
                        }
                    }
                });
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.f66957b;
                Handler handler = (Handler) this.f66958c;
                vg5 vg5Var = (vg5) this.f66959d;
                int i2 = 6;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC3781y2(vg5Var, i2));
                    }
                    synchronized (C3851zz.f72398q) {
                        try {
                            int i3 = C3851zz.f72400s - 1;
                            C3851zz.f72400s = i3;
                            if (i3 == 0) {
                                ScheduledExecutorService scheduledExecutorService = C3851zz.f72399r;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                C3851zz.f72399r = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC3781y2(vg5Var, i2));
                    }
                    synchronized (C3851zz.f72398q) {
                        try {
                            int i4 = C3851zz.f72400s - 1;
                            C3851zz.f72400s = i4;
                            if (i4 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = C3851zz.f72399r;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                C3851zz.f72399r = null;
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 3:
                ((kc0) ((pc0) this.f66957b).f55941e).mo13516d((cc4) this.f66958c, new C3440oy((fy4) this.f66959d, 4));
                return;
            case 4:
                WorkDatabase workDatabase = (WorkDatabase) this.f66957b;
                String str2 = (String) this.f66958c;
                C0773b c0773b = (C0773b) this.f66959d;
                u8b u8bVarMo2909z = workDatabase.mo2909z();
                u8bVarMo2909z.getClass();
                str2.getClass();
                Iterator it = ((List) AbstractC0758a.m2859b(u8bVarMo2909z.f63598a, true, false, new xca(str2, 10))).iterator();
                while (it.hasNext()) {
                    h5d.m13071d(c0773b, (String) it.next());
                }
                return;
            case 5:
                CustomTabLoginMethodHandler customTabLoginMethodHandler = (CustomTabLoginMethodHandler) this.f66957b;
                LoginClient.Request request = (LoginClient.Request) this.f66958c;
                Bundle bundle = (Bundle) this.f66959d;
                try {
                    customTabLoginMethodHandler.m5242i(bundle, request);
                    customTabLoginMethodHandler.m5248p(request, bundle, null);
                    return;
                } catch (FacebookException e) {
                    customTabLoginMethodHandler.m5248p(request, null, e);
                    return;
                }
            case 6:
                C3156jq c3156jq = (C3156jq) this.f66957b;
                am0 am0Var = (am0) this.f66958c;
                i88 i88Var = (i88) this.f66959d;
                w52 w52Var = (w52) c3156jq.f45991b;
                if (w52Var.f66403b.mo4146J()) {
                    am0Var.mo554p(w52Var, new IOException("Canceled"));
                    return;
                } else {
                    am0Var.mo553l(w52Var, i88Var);
                    return;
                }
            case 7:
                ((am0) this.f66958c).mo554p((w52) ((C3156jq) this.f66957b).f45991b, (Throwable) this.f66959d);
                return;
            case 8:
                ViewGroup viewGroup = (ViewGroup) this.f66957b;
                View view = (View) this.f66958c;
                h82 h82Var = (h82) this.f66959d;
                viewGroup.getClass();
                viewGroup.endViewTransition(view);
                ((ze9) h82Var.f41936c.f60774a).m25573c(h82Var);
                return;
            case 9:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f66957b;
                Intent intent = (Intent) this.f66958c;
                wr9 wr9Var = (wr9) this.f66959d;
                try {
                    firebaseMessagingService.m6714c(intent);
                    return;
                } finally {
                    wr9Var.m24138b(null);
                }
            case 10:
                ((GaugeManager) this.f66957b).lambda$startCollectingGauges$2((String) this.f66958c, (ApplicationProcessState) this.f66959d);
                return;
            case 11:
                s24 s24Var = (s24) this.f66957b;
                InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType = (InAppPurchaseUtils$IAPProductType) this.f66958c;
                Runnable runnable = (Runnable) this.f66959d;
                if (lp1.f49971a.contains(s24.class)) {
                    return;
                }
                try {
                    Class cls = s24Var.f60189f;
                    inAppPurchaseUtils$IAPProductType.getClass();
                    b34.m3252s(s24Var.f60185b, s24Var.m21008d(), s24Var.f60193j, inAppPurchaseUtils$IAPProductType.getType(), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new q24(s24Var, inAppPurchaseUtils$IAPProductType, runnable)));
                    return;
                } catch (Throwable th4) {
                    lp1.m16420a(s24.class, th4);
                    return;
                }
            case 12:
                u24 u24Var = (u24) this.f66957b;
                InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType2 = (InAppPurchaseUtils$IAPProductType) this.f66958c;
                Runnable runnable2 = (Runnable) this.f66959d;
                if (lp1.f49971a.contains(u24.class)) {
                    return;
                }
                try {
                    Class cls2 = u24Var.f63300o;
                    inAppPurchaseUtils$IAPProductType2.getClass();
                    b34.m3252s(u24Var.f63287b, u24Var.m22398d(), u24Var.f63302q, u24Var.m22401g(inAppPurchaseUtils$IAPProductType2), Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new mk1(u24Var, new Object[]{inAppPurchaseUtils$IAPProductType2, runnable2}, 2)));
                    return;
                } catch (Throwable th5) {
                    lp1.m16420a(u24.class, th5);
                    return;
                }
            case 13:
                av5 av5Var = (av5) this.f66957b;
                c14 c14Var = (c14) this.f66958c;
                jv5 jv5Var = (jv5) this.f66959d;
                l52 l52Var2 = av5Var.f7558c;
                ImmutableList immutableListM4280g = c14Var.m4280g();
                co7 co7Var = l52Var2.f49067d;
                da7 da7Var = l52Var2.f49070g;
                da7Var.getClass();
                co7Var.getClass();
                co7Var.f10360c = ImmutableList.m6287r(immutableListM4280g);
                if (!immutableListM4280g.isEmpty()) {
                    co7Var.f10363f = (jv5) immutableListM4280g.get(0);
                    jv5Var.getClass();
                    co7Var.f10364g = jv5Var;
                }
                if (((jv5) co7Var.f10362e) == null) {
                    co7Var.f10362e = co7.m4922n(da7Var, (ImmutableList) co7Var.f10360c, (jv5) co7Var.f10363f, (x0a) co7Var.f10359b);
                }
                co7Var.m4941w(((jw2) da7Var).m14716l());
                return;
            case 14:
                tv5 tv5Var = (tv5) this.f66957b;
                Pair pair = (Pair) this.f66958c;
                ((l52) tv5Var.f62948b.f67361i).mo11807c(((Integer) pair.first).intValue(), (jv5) pair.second, (ru5) this.f66959d);
                return;
            case 15:
                NativeAppLoginMethodHandler nativeAppLoginMethodHandler = (NativeAppLoginMethodHandler) this.f66957b;
                LoginClient.Request request2 = (LoginClient.Request) this.f66958c;
                Bundle bundle2 = (Bundle) this.f66959d;
                try {
                    nativeAppLoginMethodHandler.m5242i(bundle2, request2);
                    nativeAppLoginMethodHandler.m5245o(bundle2, request2);
                    return;
                } catch (FacebookServiceException e2) {
                    FacebookRequestError facebookRequestError = e2.f11366b;
                    nativeAppLoginMethodHandler.m5244n(request2, facebookRequestError.f11360d, facebookRequestError.m5184a(), String.valueOf(facebookRequestError.f11358b));
                    return;
                } catch (FacebookException e3) {
                    nativeAppLoginMethodHandler.m5244n(request2, null, e3.getMessage(), null);
                    return;
                }
            case 16:
                il7 il7Var = (il7) this.f66957b;
                gm0 gm0Var = (gm0) this.f66958c;
                C0778d c0778d = (C0778d) this.f66959d;
                il7Var.getClass();
                try {
                    zBooleanValue = ((Boolean) gm0Var.f40990b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (il7Var.f44277k) {
                    try {
                        a8b a8bVarM270b = acd.m270b(c0778d.f7240a);
                        String str3 = a8bVarM270b.f364a;
                        if (il7Var.m14014c(str3) == c0778d) {
                            il7Var.m14013b(str3);
                        }
                        oj5.m18040f().m18042a(il7.f44266l, il7.class.getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                        Iterator it2 = il7Var.f44276j.iterator();
                        while (it2.hasNext()) {
                            ((vu2) it2.next()).mo2918b(a8bVarM270b, zBooleanValue);
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                    break;
                }
                return;
            case 17:
                mba mbaVar = (mba) this.f66957b;
                jk3 jk3Var = (jk3) this.f66958c;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState) this.f66959d;
                w67 w67VarM24321y = x67.m24321y();
                w67VarM24321y.m22767h();
                x67.m24318t((x67) w67VarM24321y.f64019b, jk3Var);
                mbaVar.m16752d(w67VarM24321y, applicationProcessState);
                return;
            case 18:
                C3165jz c3165jz2 = (C3165jz) this.f66957b;
                final C0713b c0713b2 = (C0713b) this.f66958c;
                final o32 o32Var2 = (o32) this.f66959d;
                ew2 ew2Var2 = c3165jz2.f46414b;
                String str4 = uma.f64080a;
                l52 l52Var3 = ew2Var2.f37985a.f46300r;
                final C3496qf c3496qfM15807I2 = l52Var3.m15807I();
                l52Var3.m15808J(c3496qfM15807I2, 1017, new sg5(c3496qfM15807I2, c0713b2, o32Var2, i) { // from class: g52

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f40224a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C3496qf f40225b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ C0713b f40226c;

                    {
                        this.f40224a = i;
                    }

                    @Override // p000.sg5
                    public final void invoke(Object obj) {
                        int i5 = this.f40224a;
                        C0713b c0713b3 = this.f40226c;
                        C3496qf c3496qf = this.f40225b;
                        InterfaceC3534rf interfaceC3534rf = (InterfaceC3534rf) obj;
                        switch (i5) {
                            case 0:
                                interfaceC3534rf.mo20602A(c3496qf, c0713b3);
                                break;
                            default:
                                interfaceC3534rf.mo20613L(c3496qf, c0713b3);
                                break;
                        }
                    }
                });
                return;
            default:
                ((r3b) this.f66957b).loadUrl("javascript:" + ((String) this.f66958c) + '(' + u91.m22596N0((ArrayList) this.f66959d, ",", null, null, null, 62) + ')');
                return;
        }
    }
}
