package p000;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import androidx.compose.foundation.text.contextmenu.internal.C0170a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.C0634b;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.airbnb.lottie.C0868b;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.slider.AbstractC1071b;
import com.iterable.iterableapi.C1209e;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3781y2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69114b;

    public /* synthetic */ RunnableC3781y2(rw2 rw2Var, zb7 zb7Var) {
        this.f69113a = 18;
        this.f69114b = zb7Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m24848a() {
        ib3 ib3Var = (ib3) this.f69114b;
        synchronized (ib3Var.f43890d) {
            try {
                if (ib3Var.f43894h == null) {
                    return;
                }
                try {
                    dc3 dc3VarM13753c = ib3Var.m13753c();
                    int i = dc3VarM13753c.f35384f;
                    if (i == 2) {
                        synchronized (ib3Var.f43890d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        mkd mkdVar = ib3Var.f43889c;
                        Context context = ib3Var.f43887a;
                        mkdVar.getClass();
                        Typeface typefaceM17935a = oda.m17935a(context, new dc3[]{dc3VarM13753c}, 0);
                        MappedByteBuffer mappedByteBufferM11621b = f9d.m11621b(ib3Var.f43887a, dc3VarM13753c.f35379a);
                        if (mappedByteBufferM11621b == null || typefaceM17935a == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            C3329mb c3329mb = new C3329mb(typefaceM17935a, jpb.m14583a(mappedByteBufferM11621b));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (ib3Var.f43890d) {
                                try {
                                    d32 d32Var = ib3Var.f43894h;
                                    if (d32Var != null) {
                                        d32Var.mo10070b0(c3329mb);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            ib3Var.m13752b();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    synchronized (ib3Var.f43890d) {
                        try {
                            d32 d32Var2 = ib3Var.f43894h;
                            if (d32Var2 != null) {
                                d32Var2.mo10069a0(th4);
                            }
                            ib3Var.m13752b();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[Catch: all -> 0x002f, TryCatch #6 {, blocks: (B:8:0x0024, B:10:0x0028, B:17:0x0035, B:21:0x003c, B:27:0x0047, B:29:0x004b, B:31:0x0051, B:33:0x005b, B:35:0x0065, B:37:0x0076, B:36:0x006a, B:38:0x0078, B:40:0x008b, B:42:0x0093), top: B:205:0x0024 }] */
    @Override // java.lang.Runnable
    public final void run() {
        yi5 yi5Var;
        Context context;
        String strM21627g0;
        TelephonyManager telephonyManager;
        int i = 3;
        int i2 = 2;
        Object systemService = null;
        switch (this.f69113a) {
            case 0:
                ((w41) this.f69114b).m23708B();
                return;
            case 1:
                ActionMode actionMode = ((C0170a) this.f69114b).f2867h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 2:
                Context context2 = (Context) this.f69114b;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i3 >= 33) {
                            C3437ov c3437ov = AbstractC3343mp.f51679g;
                            c3437ov.getClass();
                            C3052gv c3052gv = new C3052gv(c3437ov);
                            while (c3052gv.hasNext()) {
                                AbstractC3343mp abstractC3343mp = (AbstractC3343mp) ((WeakReference) c3052gv.next()).get();
                                if (abstractC3343mp != null && (context = ((LayoutInflaterFactory2C3804yp) abstractC3343mp).f70215k) != null) {
                                    systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        yi5Var = new yi5(new zi5(AbstractC3306lp.m16418a(systemService)));
                                    } else {
                                        yi5Var = yi5.f69867b;
                                    }
                                }
                            }
                            if (systemService != null) {
                                yi5Var = new yi5(new zi5(AbstractC3306lp.m16418a(systemService)));
                            } else {
                                yi5Var = yi5.f69867b;
                            }
                        } else {
                            yi5Var = AbstractC3343mp.f51675c;
                            if (yi5Var == null) {
                                yi5Var = yi5.f69867b;
                            }
                        }
                        if (yi5Var.f69868a.f71609a.isEmpty()) {
                            String strM24648e = xq6.m24648e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC3306lp.m16419b(systemService2, AbstractC3269kp.m15630a(strM24648e));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC3343mp.f51678f = true;
                return;
            case 3:
                C3054gx c3054gx = (C3054gx) this.f69114b;
                synchronized (c3054gx.f41440a) {
                    try {
                        if (c3054gx.f41452m) {
                            return;
                        }
                        long j = c3054gx.f41451l - 1;
                        c3054gx.f41451l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            c3054gx.m12949a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (c3054gx.f41440a) {
                            c3054gx.f41453n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 4:
                C3514qx c3514qx = (C3514qx) this.f69114b;
                if (c3514qx.f58324c.f59986a) {
                    c3514qx.f58322a.f37985a.m14702H(3, false);
                    return;
                }
                return;
            case 5:
                ((C3738wx) this.f69114b).m24191g();
                return;
            case 6:
                vg5 vg5Var = (vg5) this.f69114b;
                vg5Var.getClass();
                if (Thread.currentThread() == vg5Var.f65345a) {
                    vg5Var.m23271d(-1, new hm2(i2));
                    return;
                }
                return;
            case 7:
                AbstractC1071b abstractC1071b = (AbstractC1071b) this.f69114b;
                abstractC1071b.setActiveThumbIndex(-1);
                abstractC1071b.invalidate();
                return;
            case 8:
                pc0 pc0Var = (pc0) this.f69114b;
                kc0 kc0Var = (kc0) pc0Var.f55941e;
                C3440oy c3440oy = new C3440oy(pc0Var, i);
                kc0Var.getClass();
                if (kc0.m15082g(new ffb(kc0Var, c3440oy), 30000L, new gvb(15, kc0Var, c3440oy), kc0Var.m15094l(), kc0Var.m15091f()) == null) {
                    qc0 qc0VarM15097o = kc0Var.m15097o();
                    kc0Var.m15107z(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, qc0VarM15097o);
                    c3440oy.m18572k(qc0VarM15097o, zzbw.m5669n());
                    return;
                }
                return;
            case 9:
                ((CarouselLayoutManager) this.f69114b).m24905u0();
                return;
            case 10:
                ((l31) this.f69114b).m15769s(true);
                return;
            case 11:
                qc1 qc1Var = (qc1) this.f69114b;
                Runnable runnable = qc1Var.f57557b;
                if (runnable != null) {
                    runnable.run();
                    qc1Var.f57557b = null;
                    return;
                }
                return;
            case 12:
                xc1.m24444b((xc1) this.f69114b);
                return;
            case 13:
                s52 s52Var = (s52) this.f69114b;
                if (s52Var.f60342a0 >= 300000) {
                    ((tt5) s52Var.f60356n.f9881a).f62856n1 = true;
                    s52Var.f60342a0 = 0L;
                    return;
                }
                return;
            case 14:
                C0634b c0634b = (C0634b) this.f69114b;
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = c0634b.f5655c.iterator();
                while (it.hasNext()) {
                    ((ze9) ((o82) it.next()).f60774a).m25573c(c0634b);
                }
                return;
            case 15:
                ((r92) this.f69114b).f58937h.mo4181d();
                return;
            case 16:
                ((DeviceAuthDialog) this.f69114b).m5210q0();
                return;
            case 17:
                ym2 ym2Var = (ym2) this.f69114b;
                boolean zIsPopupShowing = ym2Var.f70053h.isPopupShowing();
                ym2Var.m25197s(zIsPopupShowing);
                ym2Var.f70058m = zIsPopupShowing;
                return;
            case 18:
                zb7 zb7Var = (zb7) this.f69114b;
                try {
                    synchronized (zb7Var) {
                    }
                    try {
                        zb7Var.f71303a.mo4256d(zb7Var.f71305c, zb7Var.f71306d);
                        return;
                    } finally {
                        zb7Var.m25539a(true);
                    }
                } catch (ExoPlaybackException e) {
                    ss5.m21724v("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    v63.m23141s(e);
                    return;
                }
            case 19:
                ((gd3) this.f69114b).accept(new q6b(EmptyList.f47638a));
                return;
            case 20:
                uy2.m23009g((uy2) this.f69114b);
                return;
            case 21:
                m24848a();
                return;
            case 22:
                Iterator it2 = ((AbstractC0638f) this.f69114b).f5754o.iterator();
                while (it2.hasNext()) {
                    ((se3) it2.next()).getClass();
                }
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((C1209e) this.f69114b).m6910s0();
                return;
            case 24:
                cd4 cd4Var = (cd4) this.f69114b;
                if (cd4Var != null) {
                    cd4Var.mo4537a(null);
                    return;
                }
                return;
            case 25:
                fna.m11956b((ByteArrayInputStream) this.f69114b);
                return;
            case 26:
                C0868b c0868b = (C0868b) this.f69114b;
                Semaphore semaphore = c0868b.f10637i0;
                rf1 rf1Var = c0868b.f10604K;
                if (rf1Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    rf1Var.mo17869q(c0868b.f10622b.m10473a());
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((bm5) this.f69114b).m3875c();
                return;
            case 28:
                MaterialCalendarGridView.m6114a((MaterialCalendarGridView) this.f69114b);
                return;
            default:
                sk6 sk6Var = (sk6) this.f69114b;
                t52 t52Var = (t52) sk6Var.f60954a.get();
                if (t52Var != null) {
                    int iM22185b = sk6Var.f60956c.m22185b();
                    u52 u52Var = t52Var.f61873a;
                    synchronized (u52Var) {
                        int i4 = u52Var.f63432n;
                        if (i4 == 0 || u52Var.f63423e) {
                            if (i4 != iM22185b || u52Var.f63433o == null) {
                                u52Var.f63432n = iM22185b;
                                if (iM22185b != 1 && iM22185b != 0 && iM22185b != 8) {
                                    if (u52Var.f63433o == null) {
                                        Context context3 = u52Var.f63419a;
                                        String str = uma.f64080a;
                                        if (context3 == null || (telephonyManager = (TelephonyManager) context3.getSystemService("phone")) == null) {
                                            strM21627g0 = AbstractC3584sr.m21627g0(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strM21627g0 = AbstractC3584sr.m21627g0(Locale.getDefault().getCountry());
                                            } else {
                                                strM21627g0 = AbstractC3584sr.m21627g0(networkCountryIso);
                                            }
                                        }
                                        u52Var.f63433o = strM21627g0;
                                    }
                                    u52Var.f63430l = u52Var.m22472b(iM22185b);
                                    u52Var.f63422d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    u52Var.m22473c(u52Var.f63425g > 0 ? (int) (jElapsedRealtime - u52Var.f63426h) : 0, u52Var.f63427i, u52Var.f63430l);
                                    u52Var.f63426h = jElapsedRealtime;
                                    u52Var.f63427i = 0L;
                                    u52Var.f63429k = 0L;
                                    u52Var.f63428j = 0L;
                                    ab9 ab9Var = u52Var.f63424f;
                                    ((ArrayList) ab9Var.f473f).clear();
                                    ab9Var.f469b = -1;
                                    ab9Var.f470c = 0;
                                    ab9Var.f471d = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC3781y2(Object obj, int i) {
        this.f69113a = i;
        this.f69114b = obj;
    }
}
