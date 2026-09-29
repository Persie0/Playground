package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.TrackChangeEvent;
import android.os.Bundle;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p002ui.contentcapture.ViewOnAttachStateChangeListenerC0291c;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.core.view.AbstractC0479a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.C0634b;
import androidx.work.impl.C0773b;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import com.facebook.login.C0936j;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.C1114d;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bd */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0806bd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8355b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8356c;

    public /* synthetic */ RunnableC0806bd(C1114d c1114d, int i, ListenableFuture listenableFuture) {
        this.f8354a = 0;
        this.f8355b = c1114d;
        this.f8356c = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3738wx c3738wx;
        int i;
        long j;
        boolean z;
        boolean z2 = true;
        switch (this.f8354a) {
            case 0:
                ((C1114d) this.f8355b).m6393u((ListenableFuture) this.f8356c);
                return;
            case 1:
                ((C1114d) this.f8355b).m6390r((ImmutableCollection) this.f8356c);
                return;
            case 2:
                r2d.m20261a((ViewOnAttachStateChangeListenerC0291c) this.f8355b, (LongSparseArray) this.f8356c);
                return;
            case 3:
                by8 by8Var = (by8) this.f8355b;
                try {
                    ((Runnable) this.f8356c).run();
                    return;
                } finally {
                    by8Var.m4224a();
                }
            case 4:
                Integer num = (Integer) this.f8355b;
                List list = (List) this.f8356c;
                if (u91.m22633z0(AbstractC2975es.f37762a, num) || !u91.m22633z0(AbstractC2975es.f37763b, num)) {
                    return;
                }
                if (AbstractC2975es.f37766e >= 5) {
                    AbstractC2975es.m11325b().clear();
                    AbstractC2975es.f37766e = 0;
                    return;
                } else {
                    AbstractC2975es.m11325b().addAll(0, list);
                    AbstractC2975es.f37766e++;
                    return;
                }
            case 5:
                ((AppStartTrace) this.f8355b).f13758b.m16751c((e8a) ((b8a) this.f8356c).m22766g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                return;
            case 6:
                C2943dx c2943dx = (C2943dx) this.f8355b;
                RunnableC0806bd runnableC0806bd = (RunnableC0806bd) this.f8356c;
                ((ut5) c2943dx.f36348e).mo4798c();
                C3054gx c3054gx = (C3054gx) c2943dx.f36347d;
                synchronized (c3054gx.f41440a) {
                    c3054gx.m12950b();
                    runnableC0806bd.run();
                    break;
                }
                return;
            case 7:
                C3165jz c3165jz = (C3165jz) this.f8355b;
                String str = (String) this.f8356c;
                ew2 ew2Var = c3165jz.f46414b;
                String str2 = uma.f64080a;
                l52 l52Var = ew2Var.f37985a.f46300r;
                C3496qf c3496qfM15807I = l52Var.m15807I();
                l52Var.m15808J(c3496qfM15807I, 1012, new y42(c3496qfM15807I, str, 3));
                return;
            case 8:
                C3165jz c3165jz2 = (C3165jz) this.f8355b;
                l41 l41Var = (l41) this.f8356c;
                ew2 ew2Var2 = c3165jz2.f46414b;
                String str3 = uma.f64080a;
                bl2.m3818k(ew2Var2.f37985a.f46255B, l41Var);
                return;
            case 9:
                C3329mb c3329mb = (C3329mb) this.f8355b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f8356c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) c3329mb.f50862d).post(new RunnableC0806bd(10, c3329mb, routedDevice));
                    return;
                }
                return;
            case 10:
                C3329mb c3329mb2 = (C3329mb) this.f8355b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f8356c;
                if (((C3703vz) c3329mb2.f50863e) == null || (c3738wx = ((b00) ((qn3) c3329mb2.f50861c).f57974a).f7714i) == null) {
                    return;
                }
                c3738wx.m24189e(audioDeviceInfo);
                return;
            case 11:
                C3488q8 c3488q8 = (C3488q8) this.f8355b;
                Object objApply = ((dw2) this.f8356c).apply(c3488q8.f57373g);
                c3488q8.f57373g = objApply;
                RunnableC0806bd runnableC0806bd2 = new RunnableC0806bd(12, c3488q8, objApply);
                qp9 qp9Var = (qp9) c3488q8.f57370d;
                if (qp9Var.f58033a.getLooper().getThread().isAlive()) {
                    qp9Var.m20098c(runnableC0806bd2);
                    return;
                }
                return;
            case 12:
                C3488q8 c3488q9 = (C3488q8) this.f8355b;
                Object obj = this.f8356c;
                int i2 = c3488q9.f57368b - 1;
                c3488q9.f57368b = i2;
                if (i2 == 0) {
                    Object obj2 = c3488q9.f57372f;
                    c3488q9.f57372f = obj;
                    if (obj2.equals(obj)) {
                        return;
                    }
                    ((yv2) c3488q9.f57371e).m25357a(obj2, obj);
                    return;
                }
                return;
            case 13:
                C0773b c0773b = (C0773b) this.f8355b;
                String string = ((UUID) this.f8356c).toString();
                string.getClass();
                h5d.m13071d(c0773b, string);
                return;
            case 14:
                ((vi3) this.f8355b).invoke(AbstractC0479a.m1999a((ComposeView) this.f8356c));
                return;
            case 15:
                String str4 = (String) this.f8355b;
                Bundle bundle = (Bundle) this.f8356c;
                if (lp1.f49971a.contains(q41.class)) {
                    return;
                }
                try {
                    new C3012fs(sy2.m21766a(), (String) null).m12038d(str4, bundle);
                    return;
                } catch (Throwable th) {
                    lp1.m16420a(q41.class, th);
                    return;
                }
            case 16:
                List list2 = (List) this.f8355b;
                yb0 yb0Var = (yb0) this.f8356c;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((u80) it.next()).m22531a(yb0Var.f69591e);
                }
                return;
            case 17:
                ((tp1) this.f8355b).m22260a((C1150a) this.f8356c);
                return;
            case 18:
                C0634b c0634b = (C0634b) this.f8355b;
                ViewGroup viewGroup = (ViewGroup) this.f8356c;
                viewGroup.getClass();
                Iterator it2 = c0634b.f5655c.iterator();
                while (it2.hasNext()) {
                    ze9 ze9Var = (ze9) ((o82) it2.next()).f60774a;
                    View view = ze9Var.f71466c.f5692d0;
                    if (view != null) {
                        ze9Var.f71464a.applyState(view, viewGroup);
                    }
                }
                return;
            case 19:
                ((r92) ((C3156jq) this.f8355b).f45991b).f58937h.mo4178a((lsa) this.f8356c);
                return;
            case 20:
                Callable callable = (Callable) this.f8355b;
                vqb vqbVar = (vqb) this.f8356c;
                try {
                    vqbVar.m23480y(callable.call());
                    return;
                } catch (Exception e) {
                    vqbVar.m23481z(e);
                    return;
                }
            case 21:
                jw2 jw2Var = (jw2) this.f8355b;
                ow2 ow2Var = (ow2) this.f8356c;
                int i3 = jw2Var.f46258E - ow2Var.f55058b;
                jw2Var.f46258E = i3;
                if (ow2Var.f55061e) {
                    jw2Var.f46259F = ow2Var.f55059c;
                    jw2Var.f46260G = true;
                }
                if (i3 == 0) {
                    z0a z0aVar = ((k97) ow2Var.f55062f).f46893a;
                    int iM14712h = -1;
                    if (!jw2Var.f46281a0.f46893a.m25398p() && z0aVar.m25398p()) {
                        jw2Var.f46283b0 = -1;
                        jw2Var.f46285c0 = 0L;
                    }
                    if (!z0aVar.m25398p()) {
                        List listAsList = Arrays.asList(((ve7) z0aVar).f65281h);
                        bna.m3987z(listAsList.size() == jw2Var.f46298p.size());
                        for (int i4 = 0; i4 < listAsList.size(); i4++) {
                            ((gw2) jw2Var.f46298p.get(i4)).f41421b = (z0a) listAsList.get(i4);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (jw2Var.f46260G) {
                        boolean z3 = ((k97) ow2Var.f55062f).f46893a.m25398p() && jw2Var.f46281a0.f46893a.m25398p();
                        boolean zEquals = ((k97) ow2Var.f55062f).f46894b.equals(jw2Var.f46281a0.f46894b);
                        boolean z4 = ((k97) ow2Var.f55062f).f46896d == jw2Var.f46281a0.f46911s;
                        if (z3 || (zEquals && z4)) {
                            z2 = false;
                        }
                        if (z2) {
                            iM14712h = jw2Var.m14712h();
                            if (z0aVar.m25398p() || ((k97) ow2Var.f55062f).f46894b.m14690b()) {
                                j2 = ((k97) ow2Var.f55062f).f46896d;
                            } else {
                                k97 k97Var = (k97) ow2Var.f55062f;
                                jv5 jv5Var = k97Var.f46894b;
                                long j3 = k97Var.f46896d;
                                Object obj3 = jv5Var.f46226a;
                                x0a x0aVar = jw2Var.f46297o;
                                z0aVar.mo23250g(obj3, x0aVar);
                                j2 = j3 + x0aVar.f67603e;
                            }
                        }
                        i = iM14712h;
                        j = j2;
                        z = z2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = false;
                    }
                    jw2Var.f46260G = false;
                    jw2Var.m14703I((k97) ow2Var.f55062f, 1, z, jw2Var.f46259F, j, i);
                    return;
                }
                return;
            case 22:
                pz3 pz3Var = (pz3) this.f8355b;
                wr9 wr9Var = (wr9) this.f8356c;
                try {
                    wr9Var.m24138b(pz3Var.m19576a());
                    return;
                } catch (Exception e2) {
                    wr9Var.m24137a(e2);
                    return;
                }
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion = (InAppPurchaseUtils$BillingClientVersion) this.f8355b;
                Context context = (Context) this.f8356c;
                if (lp1.f49971a.contains(n24.class)) {
                    return;
                }
                try {
                    n24 n24Var = n24.f52216a;
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    n24Var.m17186a(inAppPurchaseUtils$BillingClientVersion, packageName);
                    return;
                } catch (Throwable th2) {
                    lp1.m16420a(n24.class, th2);
                    return;
                }
            case 24:
                id4.m13793q((id4) ((bl2) this.f8355b).f8656b, (ce4) this.f8356c, GoogleReferrerStatus.ServiceDisconnected);
                return;
            case 25:
                C0936j c0936j = (C0936j) this.f8355b;
                Bundle bundle2 = (Bundle) this.f8356c;
                if (lp1.f49971a.contains(C0936j.class)) {
                    return;
                }
                try {
                    c0936j.f11513b.m16645i("fb_mobile_login_heartbeat", bundle2);
                    return;
                } catch (Throwable th3) {
                    lp1.m16420a(C0936j.class, th3);
                    return;
                }
            case 26:
                MaterialButton materialButton = (MaterialButton) this.f8355b;
                Runnable runnable = (Runnable) this.f8356c;
                int[] iArr = MaterialButton.f12752l0;
                runnable.run();
                LinearLayout.LayoutParams layoutParams = materialButton.f12773a0;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.f12773a0 = null;
                    materialButton.f12770U = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                xt5 xt5Var = (xt5) this.f8355b;
                xt5Var.f68741Y.set(xt5Var.m24994y((p33) this.f8356c, xt5Var.f68729S, 0));
                return;
            case 28:
                ((vu5) this.f8355b).f65920d.reportTrackChangeEvent((TrackChangeEvent) this.f8356c);
                return;
            default:
                ((vu5) this.f8355b).f65920d.reportPlaybackMetrics((PlaybackMetrics) this.f8356c);
                return;
        }
    }

    public /* synthetic */ RunnableC0806bd(int i, Object obj, Object obj2) {
        this.f8354a = i;
        this.f8355b = obj;
        this.f8356c = obj2;
    }
}
