package p000;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.LocaleList;
import android.os.SystemClock;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.AbstractC0949b;
import com.google.android.gms.internal.clearcut.C0955h;
import com.google.android.gms.internal.clearcut.C0956i;
import com.google.android.gms.internal.clearcut.zzew;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;
import com.google.android.gms.internal.clearcut.zzr;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: dx */
/* JADX INFO: loaded from: classes2.dex */
public final class C2943dx implements st5 {

    /* JADX INFO: renamed from: a */
    public int f36344a;

    /* JADX INFO: renamed from: b */
    public boolean f36345b;

    /* JADX INFO: renamed from: c */
    public final Object f36346c;

    /* JADX INFO: renamed from: d */
    public final Object f36347d;

    /* JADX INFO: renamed from: e */
    public Object f36348e;

    /* JADX INFO: renamed from: f */
    public Object f36349f;

    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    public C2943dx(m31 m31Var, byte[] bArr) {
        this.f36349f = m31Var;
        this.f36344a = m31Var.f50493e;
        this.f36346c = m31Var.f50492d;
        this.f36347d = m31Var.f50494f;
        mec mecVar = new mec();
        mecVar.f51226a = 0L;
        mecVar.f51227b = 0L;
        mecVar.f51228c = 0;
        if (qec.f57664a == null) {
            synchronized (a9c.f391a) {
                try {
                    if (qec.f57664a == null) {
                        qec.f57664a = new qec[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mecVar.f51229d = qec.f57664a;
        byte[] bArr2 = myc.f52054b;
        mecVar.f51230e = bArr2;
        mecVar.f51231f = bArr2;
        mecVar.f51232g = "";
        mecVar.f51233h = "";
        mecVar.f51234i = "";
        mecVar.f51235j = 180000L;
        mecVar.f51236k = bArr2;
        mecVar.f51237l = "";
        mecVar.f51224H = myc.f52053a;
        mecVar.f51225I = false;
        this.f36348e = mecVar;
        this.f36345b = false;
        Context context = m31Var.f50489a;
        boolean zIsUserUnlocked = nfb.f52687b;
        if (!zIsUserUnlocked) {
            UserManager userManager = nfb.f52686a;
            if (userManager == null) {
                synchronized (nfb.class) {
                    try {
                        userManager = nfb.f52686a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            nfb.f52686a = userManager2;
                            if (userManager2 == null) {
                                nfb.f52687b = true;
                                zIsUserUnlocked = true;
                            } else {
                                userManager = userManager2;
                            }
                        }
                        zIsUserUnlocked = userManager.isUserUnlocked();
                        nfb.f52687b = zIsUserUnlocked;
                        if (zIsUserUnlocked) {
                            nfb.f52686a = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                zIsUserUnlocked = userManager.isUserUnlocked();
                nfb.f52687b = zIsUserUnlocked;
                if (zIsUserUnlocked) {
                    nfb.f52686a = null;
                }
            }
        }
        mecVar.f51225I = !zIsUserUnlocked;
        m31Var.f50496h.getClass();
        mecVar.f51226a = System.currentTimeMillis();
        m31Var.f50496h.getClass();
        mecVar.f51227b = SystemClock.elapsedRealtime();
        mecVar.f51235j = TimeZone.getDefault().getOffset(mecVar.f51226a) / DescriptorProtos.Edition.EDITION_2023_VALUE;
        mecVar.f51231f = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m10709b(C2943dx c2943dx, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C3309ls c3309ls;
        LoudnessCodecController loudnessCodecController;
        C3054gx c3054gx = (C3054gx) c2943dx.f36347d;
        MediaCodec mediaCodec = (MediaCodec) c2943dx.f36346c;
        HandlerThread handlerThread = c3054gx.f41441b;
        bna.m3987z(c3054gx.f41442c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(c3054gx, handler);
        c3054gx.f41442c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((ut5) c2943dx.f36348e).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c3309ls = (C3309ls) c2943dx.f36349f) != null && ((loudnessCodecController = (LoudnessCodecController) c3309ls.f50066d) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            bna.m3987z(((HashSet) c3309ls.f50065c).add(mediaCodec));
        }
        c2943dx.f36344a = 1;
    }

    /* JADX INFO: renamed from: g */
    public static String m10710g(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: A */
    public ByteBuffer mo10711A(int i) {
        return ((MediaCodec) this.f36346c).getOutputBuffer(i);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: B */
    public void mo10712B(ArrayList arrayList) {
        ((MediaCodec) this.f36346c).subscribeToVendorParameters(arrayList);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: D */
    public void mo10713D(eu5 eu5Var, Handler handler) {
        ((MediaCodec) this.f36346c).setOnFrameRenderedListener(new C0827bx(this, eu5Var, 0), handler);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: F */
    public void mo10714F(ArrayList arrayList) {
        ((MediaCodec) this.f36346c).unsubscribeFromVendorParameters(arrayList);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: a */
    public void mo10715a() {
        C3309ls c3309ls;
        C3309ls c3309ls2;
        try {
            if (this.f36344a == 1) {
                ((ut5) this.f36348e).shutdown();
                C3054gx c3054gx = (C3054gx) this.f36347d;
                synchronized (c3054gx.f41440a) {
                    c3054gx.f41452m = true;
                    c3054gx.f41441b.quit();
                    c3054gx.m12949a();
                }
            }
            this.f36344a = 2;
            if (this.f36345b) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.f36346c).stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (c3309ls2 = (C3309ls) this.f36349f) != null) {
                    c3309ls2.m16489I((MediaCodec) this.f36346c);
                }
                ((MediaCodec) this.f36346c).release();
                this.f36345b = true;
            }
        } catch (Throwable th) {
            if (!this.f36345b) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.f36346c).stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (c3309ls = (C3309ls) this.f36349f) != null) {
                        c3309ls.m16489I((MediaCodec) this.f36346c);
                    }
                    ((MediaCodec) this.f36346c).release();
                    this.f36345b = true;
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public C3156jq m10716c() {
        Intent intent = (Intent) this.f36346c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f36345b);
        ((wkd) this.f36347d).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.f36349f;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f36344a);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.f36348e) == null) {
                this.f36348e = ActivityOptions.makeBasic();
            }
            AbstractC3170k3.m14781e((ActivityOptions) this.f36348e);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.f36348e) == null) {
                this.f36348e = ActivityOptions.makeBasic();
            }
            AbstractC3782y3.m24922e((ActivityOptions) this.f36348e, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f36348e;
        return new C3156jq(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: d */
    public void mo10717d(Bundle bundle) {
        ((ut5) this.f36348e).mo4799d(bundle);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: e */
    public void mo10718e(int i, xr1 xr1Var, long j, int i2) {
        ((ut5) this.f36348e).mo4800e(i, xr1Var, j, i2);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: f */
    public void mo10719f(int i, int i2, int i3, long j) {
        ((ut5) this.f36348e).mo4801f(i, i2, i3, j);
    }

    @Override // p000.st5
    public void flush() {
        ((ut5) this.f36348e).flush();
        ((MediaCodec) this.f36346c).flush();
        C3054gx c3054gx = (C3054gx) this.f36347d;
        synchronized (c3054gx.f41440a) {
            c3054gx.f41451l++;
            Handler handler = c3054gx.f41442c;
            String str = uma.f64080a;
            handler.post(new RunnableC3781y2(c3054gx, 3));
        }
        ((MediaCodec) this.f36346c).start();
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: h */
    public void mo10720h(int i) {
        ((MediaCodec) this.f36346c).releaseOutputBuffer(i, false);
    }

    /* JADX INFO: renamed from: i */
    public void m10721i() {
        List<C0955h> listM5341e;
        String str;
        String strSubstring;
        int i;
        C0955h c0955h;
        m31 m31Var = (m31) this.f36349f;
        if (this.f36345b) {
            C3386nv.m17633t("do not reuse LogEventBuilder");
            return;
        }
        boolean zM193b = true;
        this.f36345b = true;
        zzr zzrVar = new zzr(m31Var.f50490b, m31Var.f50491c, this.f36344a, (String) this.f36346c, (zzge$zzv$zzb) this.f36347d);
        mec mecVar = (mec) this.f36348e;
        zze zzeVar = new zze(zzrVar, mecVar);
        Context context = m31Var.f50497i.f400a;
        boolean zMo5311f = false;
        int i2 = mecVar != null ? mecVar.f51228c : 0;
        boolean zBooleanValue = ((Boolean) a9d.f399i.m446a()).booleanValue();
        String strValueOf = zzrVar.f11814g;
        int i3 = zzrVar.f11810c;
        if (zBooleanValue) {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (strValueOf != null) {
                if (context == null) {
                    listM5341e = Collections.EMPTY_LIST;
                } else {
                    ConcurrentHashMap concurrentHashMap = a9d.f395e;
                    aib aibVar = (aib) concurrentHashMap.get(strValueOf);
                    if (aibVar == null) {
                        k58 k58Var = a9d.f393c;
                        C0956i c0956iM5339f = C0956i.m5339f();
                        k58Var.getClass();
                        dmb dmbVar = new dmb(k58Var, strValueOf, c0956iM5339f);
                        aibVar = (aib) concurrentHashMap.putIfAbsent(strValueOf, dmbVar);
                        if (aibVar == null) {
                            aibVar = dmbVar;
                        }
                    }
                    listM5341e = ((C0956i) aibVar.m446a()).m5341e();
                }
                for (C0955h c0955h2 : listM5341e) {
                    if (!c0955h2.m5335i() || c0955h2.m5334e() == 0 || c0955h2.m5334e() == i2) {
                        if (!a9d.m193b(a9d.m192a(c0955h2.m5336j(), a9d.m195d(context)), c0955h2.m5337k(), c0955h2.m5338l())) {
                            zM193b = false;
                            break;
                        }
                    }
                }
            }
        } else {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i3 >= 0 ? String.valueOf(i3) : null;
            }
            if (strValueOf != null) {
                if (context == null || !a9d.m194c(context)) {
                    str = null;
                } else {
                    HashMap map = a9d.f396f;
                    aib aibVar2 = (aib) map.get(strValueOf);
                    if (aibVar2 == null) {
                        k58 k58Var2 = a9d.f394d;
                        k58Var2.getClass();
                        plb plbVar = new plb(k58Var2, strValueOf, null, 1);
                        map.put(strValueOf, plbVar);
                        aibVar2 = plbVar;
                    }
                    str = (String) aibVar2.m446a();
                }
                if (str != null) {
                    int iIndexOf = str.indexOf(44);
                    if (iIndexOf >= 0) {
                        strSubstring = str.substring(0, iIndexOf);
                        i = iIndexOf + 1;
                    } else {
                        strSubstring = "";
                        i = 0;
                    }
                    int iIndexOf2 = str.indexOf(47, i);
                    if (iIndexOf2 <= 0) {
                        Log.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
                    } else {
                        try {
                            long j = Long.parseLong(str.substring(i, iIndexOf2));
                            long j2 = Long.parseLong(str.substring(iIndexOf2 + 1));
                            if (j < 0 || j2 < 0) {
                                StringBuilder sb = new StringBuilder(72);
                                sb.append("negative values not supported: ");
                                sb.append(j);
                                sb.append("/");
                                sb.append(j2);
                                Log.e("LogSamplerImpl", sb.toString());
                            } else {
                                edc edcVarM5333m = C0955h.m5333m();
                                edcVarM5333m.m22295b();
                                C0955h.m5331g((C0955h) edcVarM5333m.f62833b, strSubstring);
                                edcVarM5333m.m22295b();
                                C0955h.m5330f((C0955h) edcVarM5333m.f62833b, j);
                                edcVarM5333m.m22295b();
                                C0955h.m5332h((C0955h) edcVarM5333m.f62833b, j2);
                                AbstractC0949b abstractC0949bM22296c = edcVarM5333m.m22296c();
                                byte bByteValue = ((Byte) abstractC0949bM22296c.mo5293a(1)).byteValue();
                                if (bByteValue == 1) {
                                    zMo5311f = true;
                                } else if (bByteValue != 0) {
                                    r0c r0cVar = r0c.f58470c;
                                    r0cVar.getClass();
                                    zMo5311f = r0cVar.m20230a(abstractC0949bM22296c.getClass()).mo5311f(abstractC0949bM22296c);
                                    abstractC0949bM22296c.mo5293a(2);
                                }
                                if (!zMo5311f) {
                                    throw new zzew();
                                }
                                c0955h = (C0955h) abstractC0949bM22296c;
                            }
                        } catch (NumberFormatException e) {
                            Log.e("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e);
                        }
                    }
                    c0955h = null;
                } else {
                    c0955h = null;
                }
                if (c0955h != null) {
                    zM193b = a9d.m193b(a9d.m192a(c0955h.m5336j(), a9d.m195d(context)), c0955h.m5337k(), c0955h.m5338l());
                }
            }
        }
        if (!zM193b) {
            new pi9(null).m5286e(Status.f11657e);
            return;
        }
        xdb xdbVar = m31Var.f50495g;
        xdbVar.getClass();
        xdbVar.m17568b(2, new cec(zzeVar, xdbVar.f53053i));
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: j */
    public MediaFormat mo10722j() {
        MediaFormat mediaFormat;
        C3054gx c3054gx = (C3054gx) this.f36347d;
        synchronized (c3054gx.f41440a) {
            try {
                mediaFormat = c3054gx.f41447h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: k */
    public boolean mo10723k(hi8 hi8Var) {
        C3054gx c3054gx = (C3054gx) this.f36347d;
        synchronized (c3054gx.f41440a) {
            c3054gx.f41454o = hi8Var;
        }
        return true;
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: l */
    public void mo10724l() {
        ((MediaCodec) this.f36346c).detachOutputSurface();
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: m */
    public void mo10725m(RunnableC0806bd runnableC0806bd) {
        C3054gx c3054gx = (C3054gx) this.f36347d;
        RunnableC0806bd runnableC0806bd2 = new RunnableC0806bd(6, this, runnableC0806bd);
        synchronized (c3054gx.f41440a) {
            c3054gx.m12950b();
            runnableC0806bd2.run();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m10726n() {
        Intent intent = (Intent) this.f36346c;
        this.f36344a = 1;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: o */
    public void mo10727o(int i, long j) {
        ((MediaCodec) this.f36346c).releaseOutputBuffer(i, j);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: q */
    public int mo10728q() {
        ((ut5) this.f36348e).mo4798c();
        C3054gx c3054gx = (C3054gx) this.f36347d;
        synchronized (c3054gx.f41440a) {
            try {
                c3054gx.m12950b();
                int i = -1;
                if (c3054gx.f41451l > 0 || c3054gx.f41452m) {
                    return -1;
                }
                k80 k80Var = c3054gx.f41443d;
                int i2 = k80Var.f46843a;
                int i3 = k80Var.f46844b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) k80Var.f46846d)[i2];
                    k80Var.f46843a = (i2 + 1) & k80Var.f46845c;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: t */
    public int mo10729t(MediaCodec.BufferInfo bufferInfo) {
        ((ut5) this.f36348e).mo4798c();
        C3054gx c3054gx = (C3054gx) this.f36347d;
        synchronized (c3054gx.f41440a) {
            try {
                c3054gx.m12950b();
                if (c3054gx.f41451l > 0 || c3054gx.f41452m) {
                    return -1;
                }
                k80 k80Var = c3054gx.f41444e;
                int i = k80Var.f46843a;
                int i2 = k80Var.f46844b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = ((int[]) k80Var.f46846d)[i];
                k80Var.f46843a = k80Var.f46845c & (i + 1);
                if (i3 >= 0) {
                    c3054gx.f41447h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c3054gx.f41445f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    c3054gx.f41447h = (MediaFormat) c3054gx.f41446g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: v */
    public void mo10730v(int i) {
        ((MediaCodec) this.f36346c).setVideoScalingMode(i);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: w */
    public ByteBuffer mo10731w(int i) {
        return ((MediaCodec) this.f36346c).getInputBuffer(i);
    }

    @Override // p000.st5
    /* JADX INFO: renamed from: y */
    public void mo10732y(Surface surface) {
        ((MediaCodec) this.f36346c).setOutputSurface(surface);
    }

    public C2943dx(MediaCodec mediaCodec, HandlerThread handlerThread, ut5 ut5Var, C3309ls c3309ls) {
        this.f36346c = mediaCodec;
        this.f36347d = new C3054gx(handlerThread);
        this.f36348e = ut5Var;
        this.f36349f = c3309ls;
        this.f36344a = 0;
    }

    public C2943dx() {
        this.f36346c = new Intent("android.intent.action.VIEW");
        this.f36347d = new wkd();
        this.f36344a = 0;
        this.f36345b = true;
    }

    public C2943dx(gv5 gv5Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f36346c = intent;
        this.f36347d = new wkd();
        this.f36344a = 0;
        this.f36345b = true;
        if (gv5Var != null) {
            intent.setPackage(((ComponentName) gv5Var.f41394d).getPackageName());
            qx1 qx1Var = (qx1) gv5Var.f41393c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", qx1Var);
            intent.putExtras(bundle);
        }
    }
}
