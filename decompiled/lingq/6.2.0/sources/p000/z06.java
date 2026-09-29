package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.core.os.OperationCanceledException;
import com.google.android.gms.internal.mlkit_common.C0967b;
import com.google.android.gms.internal.mlkit_vision_common.C0968a;
import com.google.android.gms.internal.mlkit_vision_document_scanner.C0969a;
import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C0988b0;
import com.google.android.gms.internal.play_billing.C0992d0;
import com.google.android.gms.internal.play_billing.C1006q;
import com.google.android.gms.internal.play_billing.C1007r;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzbh;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class z06 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70726a;

    /* JADX INFO: renamed from: b */
    public final Object f70727b;

    public z06(View view) {
        this.f70726a = 1;
        this.f70727b = new WeakReference(view);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f5 A[Catch: Exception -> 0x0104, TryCatch #5 {Exception -> 0x0104, blocks: (B:52:0x00e2, B:54:0x00fa, B:59:0x0112, B:65:0x0132, B:67:0x0136, B:70:0x0143, B:72:0x015b, B:76:0x0172, B:77:0x018b, B:74:0x0166, B:78:0x018e, B:82:0x0199, B:86:0x01a2, B:90:0x01ab, B:94:0x01b4, B:98:0x01bd, B:102:0x01c6, B:106:0x01cf, B:110:0x01d8, B:114:0x01e1, B:118:0x01ea, B:122:0x01f1, B:124:0x01f5, B:125:0x01fe, B:60:0x0129, B:57:0x0107), top: B:209:0x00e2 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0203  */
    /* JADX WARN: Code duplicated, block: B:130:0x0213 A[Catch: all -> 0x023f, TryCatch #7 {all -> 0x023f, blocks: (B:128:0x020d, B:130:0x0213, B:132:0x0230, B:135:0x0241, B:136:0x0250, B:138:0x0271, B:139:0x0278), top: B:212:0x020d }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0230 A[Catch: all -> 0x023f, TryCatch #7 {all -> 0x023f, blocks: (B:128:0x020d, B:130:0x0213, B:132:0x0230, B:135:0x0241, B:136:0x0250, B:138:0x0271, B:139:0x0278), top: B:212:0x020d }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0250 A[Catch: all -> 0x023f, TryCatch #7 {all -> 0x023f, blocks: (B:128:0x020d, B:130:0x0213, B:132:0x0230, B:135:0x0241, B:136:0x0250, B:138:0x0271, B:139:0x0278), top: B:212:0x020d }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0271 A[Catch: all -> 0x023f, TryCatch #7 {all -> 0x023f, blocks: (B:128:0x020d, B:130:0x0213, B:132:0x0230, B:135:0x0241, B:136:0x0250, B:138:0x0271, B:139:0x0278), top: B:212:0x020d }] */
    /* JADX WARN: Code duplicated, block: B:212:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bc  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundleM12429f;
        pmb pmbVar;
        zzjd zzjdVar;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Long lM12031a;
        ptc ptcVarM5512p;
        nuc nucVarM5520p;
        boolean z11 = true;
        switch (this.f70726a) {
            case 0:
                RunnableC3700vw runnableC3700vw = (RunnableC3700vw) this.f70727b;
                AtomicBoolean atomicBoolean = runnableC3700vw.f65999c;
                runnableC3700vw.f66000d.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        runnableC3700vw.f66001e.m16155d();
                        break;
                    } catch (OperationCanceledException e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    runnableC3700vw.m23561a(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        atomicBoolean.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        runnableC3700vw.m23561a(null);
                        throw th2;
                    }
                }
            case 1:
                View view = (View) ((WeakReference) this.f70727b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                bitmapCreateBitmap.getClass();
                view.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                strEncodeToString.getClass();
                return strEncodeToString;
            case 2:
                frb frbVar = (frb) this.f70727b;
                kc0 kc0Var = frbVar.f39538d;
                synchronized (kc0Var.f46993a) {
                    try {
                        if (kc0Var.f46994b != 3) {
                            boolean z12 = kc0Var.f46994b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundleM12429f = null;
                            } else {
                                bundleM12429f = g9a.m12429f("accountName", null);
                                AbstractC0985a.m5501b(kc0Var.f46991A.longValue(), bundleM12429f, kc0Var.f46995c, kc0Var.f46996d);
                            }
                            zzjd zzjdVar2 = zzjd.REASON_UNSPECIFIED;
                            synchronized (kc0Var.f46993a) {
                                pmbVar = kc0Var.f47001i;
                                break;
                            }
                            kc0 kc0Var2 = frbVar.f39538d;
                            if (pmbVar == null) {
                                kc0Var2.m15101s(0);
                                zzjd zzjdVar3 = zzjd.SERVICE_RESET_TO_NULL;
                                qc0 qc0Var = wwb.f67445j;
                                kc0Var2.m15100r(qc0Var, zzjdVar3);
                                frbVar.m12033c(qc0Var);
                            } else {
                                String packageName = kc0Var2.f46999g.getPackageName();
                                int iM14022Q = 3;
                                int i2 = 27;
                                while (true) {
                                    if (i2 >= 3) {
                                        try {
                                            AbstractC0985a.m5507h("BillingClient", "trying subs apiVersion: " + i2);
                                            iM14022Q = bundleM12429f == null ? ((imb) pmbVar).m14022Q(packageName, i2, "subs") : ((imb) pmbVar).m14023R(i2, packageName, "subs", bundleM12429f);
                                            if (iM14022Q == 0) {
                                                AbstractC0985a.m5507h("BillingClient", "highestLevelSupportedForSubs: " + i2);
                                            } else {
                                                i2--;
                                            }
                                        } catch (Exception e2) {
                                            AbstractC0985a.m5509j("BillingClient", "Exception while checking if billing is supported; try to reconnect", e2);
                                            boolean z13 = e2 instanceof DeadObjectException;
                                            if (z13) {
                                                zzjdVar = zzjd.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                            } else if (e2 instanceof RemoteException) {
                                                zzjdVar = zzjd.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                            } else {
                                                zzjdVar = e2 instanceof SecurityException ? zzjd.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                            }
                                            String strM20181a = zzjdVar.equals(zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? qvb.m20181a(e2) : null;
                                            frbVar.f39538d.m15101s(0);
                                            frbVar.m12032b(z13 ? wwb.f67445j : wwb.f67443h, zzjdVar, strM20181a, z12);
                                            frbVar.m12033c(z13 ? wwb.f67445j : wwb.f67443h);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                }
                                kc0Var2.f47003k = i2 >= 3;
                                if (i2 < 3) {
                                    zzjdVar2 = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    AbstractC0985a.m5507h("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i3 = 27; i3 >= 3; i3--) {
                                    AbstractC0985a.m5507h("BillingClient", "trying inapp apiVersion: " + i3);
                                    iM14022Q = bundleM12429f == null ? ((imb) pmbVar).m14022Q(packageName, i3, "inapp") : ((imb) pmbVar).m14023R(i3, packageName, "inapp", bundleM12429f);
                                    if (iM14022Q == 0) {
                                        kc0Var2.f47004l = i3;
                                        AbstractC0985a.m5507h("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                        i = kc0Var2.f47004l;
                                        kc0Var2.f47004l = i;
                                        if (i >= 26) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        kc0Var2.f47015w = z;
                                        if (i >= 24) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        kc0Var2.f47014v = z2;
                                        if (i >= 21) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        kc0Var2.f47013u = z3;
                                        if (i >= 20) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        kc0Var2.f47012t = z4;
                                        if (i >= 19) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        kc0Var2.f47011s = z5;
                                        if (i >= 17) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        kc0Var2.f47010r = z6;
                                        if (i >= 16) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        kc0Var2.f47009q = z7;
                                        if (i >= 15) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        kc0Var2.f47008p = z8;
                                        if (i >= 14) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        kc0Var2.f47007o = z9;
                                        if (i >= 9) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        kc0Var2.f47006n = z10;
                                        if (i >= 6) {
                                            z11 = false;
                                        }
                                        kc0Var2.f47005m = z11;
                                        if (i < 3) {
                                            zzjdVar2 = zzjd.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                            AbstractC0985a.m5508i("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                        }
                                        kc0.m15084k(kc0Var2, iM14022Q);
                                        if (iM14022Q != 0) {
                                            qc0 qc0Var2 = wwb.f67437b;
                                            frbVar.m12032b(qc0Var2, zzjdVar2, null, z12);
                                            frbVar.m12033c(qc0Var2);
                                        } else {
                                            try {
                                                lM12031a = frbVar.m12031a(z12);
                                                if (z12) {
                                                    wmc wmcVarM5616q = C1006q.m5616q();
                                                    wmcVarM5616q.m24058f(6);
                                                    nucVarM5520p = C0992d0.m5520p();
                                                    nucVarM5520p.m17617c(false);
                                                    nucVarM5520p.m17618d();
                                                    nucVarM5520p.m18948b();
                                                    C0992d0.m5524t((C0992d0) nucVarM5520p.f55715b);
                                                    if (lM12031a != null) {
                                                        long jLongValue = lM12031a.longValue();
                                                        nucVarM5520p.m18948b();
                                                        C0992d0.m5523s((C0992d0) nucVarM5520p.f55715b, jLongValue);
                                                    }
                                                    kc0 kc0Var3 = frbVar.f39538d;
                                                    wmcVarM5616q.m24057e(nucVarM5520p);
                                                    kc0Var3.m15099q((C1006q) wmcVarM5616q.m18947a());
                                                } else {
                                                    ptcVarM5512p = C0988b0.m5512p();
                                                    vnc vncVarM5623q = C1007r.m5623q();
                                                    vncVarM5623q.m18948b();
                                                    C1007r.m5622p((C1007r) vncVarM5623q.f55715b, 0);
                                                    vncVarM5623q.m18948b();
                                                    C1007r.m5626t((C1007r) vncVarM5623q.f55715b);
                                                    ptcVarM5512p.m19479c(vncVarM5623q);
                                                    if (lM12031a != null) {
                                                        ptcVarM5512p.m19480d(lM12031a.longValue());
                                                    }
                                                    frbVar.f39538d.f47000h.m19924y((C0988b0) ptcVarM5512p.m18947a());
                                                }
                                            } catch (Throwable th3) {
                                                AbstractC0985a.m5509j("BillingClient", "Unable to log.", th3);
                                            }
                                            frbVar.m12033c(wwb.f67444i);
                                        }
                                    }
                                }
                                i = kc0Var2.f47004l;
                                kc0Var2.f47004l = i;
                                if (i >= 26) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                kc0Var2.f47015w = z;
                                if (i >= 24) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                kc0Var2.f47014v = z2;
                                if (i >= 21) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                kc0Var2.f47013u = z3;
                                if (i >= 20) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                kc0Var2.f47012t = z4;
                                if (i >= 19) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                kc0Var2.f47011s = z5;
                                if (i >= 17) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                kc0Var2.f47010r = z6;
                                if (i >= 16) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                kc0Var2.f47009q = z7;
                                if (i >= 15) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                kc0Var2.f47008p = z8;
                                if (i >= 14) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                kc0Var2.f47007o = z9;
                                if (i >= 9) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                kc0Var2.f47006n = z10;
                                if (i >= 6) {
                                    z11 = false;
                                }
                                kc0Var2.f47005m = z11;
                                if (i < 3) {
                                    zzjdVar2 = zzjd.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    AbstractC0985a.m5508i("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                kc0.m15084k(kc0Var2, iM14022Q);
                                if (iM14022Q != 0) {
                                    qc0 qc0Var3 = wwb.f67437b;
                                    frbVar.m12032b(qc0Var3, zzjdVar2, null, z12);
                                    frbVar.m12033c(qc0Var3);
                                } else {
                                    lM12031a = frbVar.m12031a(z12);
                                    if (z12) {
                                        wmc wmcVarM5616q2 = C1006q.m5616q();
                                        wmcVarM5616q2.m24058f(6);
                                        nucVarM5520p = C0992d0.m5520p();
                                        nucVarM5520p.m17617c(false);
                                        nucVarM5520p.m17618d();
                                        nucVarM5520p.m18948b();
                                        C0992d0.m5524t((C0992d0) nucVarM5520p.f55715b);
                                        if (lM12031a != null) {
                                            long jLongValue2 = lM12031a.longValue();
                                            nucVarM5520p.m18948b();
                                            C0992d0.m5523s((C0992d0) nucVarM5520p.f55715b, jLongValue2);
                                        }
                                        kc0 kc0Var4 = frbVar.f39538d;
                                        wmcVarM5616q2.m24057e(nucVarM5520p);
                                        kc0Var4.m15099q((C1006q) wmcVarM5616q2.m18947a());
                                    } else {
                                        ptcVarM5512p = C0988b0.m5512p();
                                        vnc vncVarM5623q2 = C1007r.m5623q();
                                        vncVarM5623q2.m18948b();
                                        C1007r.m5622p((C1007r) vncVarM5623q2.f55715b, 0);
                                        vncVarM5623q2.m18948b();
                                        C1007r.m5626t((C1007r) vncVarM5623q2.f55715b);
                                        ptcVarM5512p.m19479c(vncVarM5623q2);
                                        if (lM12031a != null) {
                                            ptcVarM5512p.m19480d(lM12031a.longValue());
                                        }
                                        frbVar.f39538d.f47000h.m19924y((C0988b0) ptcVarM5512p.m18947a());
                                    }
                                    frbVar.m12033c(wwb.f67444i);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return null;
            case 3:
                return new trc(((shc) this.f70727b).f60882l);
            case 4:
                eoc eocVar = (eoc) this.f70727b;
                eocVar.f37647f.m5902V();
                ydc ydcVar = eocVar.f37647f.f12368h;
                C1045d.m5885T(ydcVar);
                ydcVar.mo12359D();
                throw new IllegalStateException("Unexpected call on client side");
            case 5:
                return ((Context) this.f70727b).getSharedPreferences("google_sdk_flags", 0);
            case 6:
                return fb5.f38790c.m11703a(((C0968a) this.f70727b).f11959g);
            case 7:
                return fb5.f38790c.m11703a(((C0967b) this.f70727b).f11925a);
            case 8:
                return fb5.f38790c.m11703a(((C0969a) this.f70727b).f11992g);
            case 9:
                return fb5.f38790c.m11703a(((C0984o) this.f70727b).f12066g);
            default:
                cdb cdbVar = (cdb) this.f70727b;
                synchronized (((ckd) cdbVar.f9946c).f10206g) {
                    cdbVar.f9945b = null;
                    break;
                }
                return null;
        }
    }

    public z06(eoc eocVar, zzbh zzbhVar, String str) {
        this.f70726a = 4;
        this.f70727b = eocVar;
    }

    public /* synthetic */ z06(Object obj, int i) {
        this.f70726a = i;
        this.f70727b = obj;
    }
}
