package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import coil.C0855a;
import com.facebook.appevents.internal.C0926a;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$EventType;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult;
import com.lingq.AbstractApplicationC1226a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class p58 implements zc1, wk0, jl1, jn1, j59, dqb, zn2 {

    /* JADX INFO: renamed from: c */
    public static Boolean f55609c;

    /* JADX INFO: renamed from: e */
    public static C0855a f55611e;

    /* JADX INFO: renamed from: i */
    public static l18 f55615i;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55619a;

    /* JADX INFO: renamed from: b */
    public static final p58 f55608b = new p58(0);

    /* JADX INFO: renamed from: d */
    public static final p58 f55610d = new p58(1);

    /* JADX INFO: renamed from: f */
    public static final p58 f55612f = new p58(2);

    /* JADX INFO: renamed from: g */
    public static final p58 f55613g = new p58(4);

    /* JADX INFO: renamed from: h */
    public static final p58 f55614h = new p58(5);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ p58 f55616j = new p58(6);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ p58 f55617k = new p58(20);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ p58 f55618l = new p58(21);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ p58 f55601H = new p58(22);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ p58 f55602I = new p58(23);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ p58 f55603J = new p58(24);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ p58 f55604K = new p58(25);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ p58 f55605L = new p58(26);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ p58 f55606M = new p58(27);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ p58 f55607N = new p58(28);

    public /* synthetic */ p58(int i) {
        this.f55619a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final void m18899c(p58 p58Var, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new b7b(iIntValue, ((Number) it2.next()).intValue()));
            }
            u91.m22630w0(arrayList2, arrayList);
        }
        u91.m22627s1(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static pa1 m18900f(ye1 ye1Var) {
        return ((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a;
    }

    /* JADX INFO: renamed from: i */
    public static v49 m18901i(ye1 ye1Var) {
        return ((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51801c;
    }

    /* JADX INFO: renamed from: j */
    public static zda m18902j(ye1 ye1Var) {
        return ((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51800b;
    }

    /* JADX INFO: renamed from: m */
    public static final C0855a m18903m(Context context) {
        C0855a c0855a = f55611e;
        if (c0855a != null) {
            return c0855a;
        }
        synchronized (f55610d) {
            try {
                C0855a c0855a2 = f55611e;
                if (c0855a2 != null) {
                    return c0855a2;
                }
                Context applicationContext = context.getApplicationContext();
                AbstractApplicationC1226a abstractApplicationC1226a = applicationContext instanceof AbstractApplicationC1226a ? (AbstractApplicationC1226a) applicationContext : null;
                C0855a c0855aM6994c = abstractApplicationC1226a != null ? abstractApplicationC1226a.m6994c() : lfd.m16177a(context);
                f55611e = c0855aM6994c;
                return c0855aM6994c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.j59
    /* JADX INFO: renamed from: a */
    public c83 mo14203a(vm9 vm9Var) {
        return new yz0(vm9Var, 5);
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public long mo10837b(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        int i = km8.f47515a;
        return jFloatToRawIntBits;
    }

    @Override // p000.wk0
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public String mo18904d(int i, Method method) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m18905e() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {, blocks: (B:11:0x0018, B:15:0x0022, B:23:0x0036, B:29:0x004a, B:21:0x0031, B:18:0x002d, B:26:0x0046), top: B:44:0x0018, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public C0926a m18906g() {
        C0926a c0926a;
        C0926a c0926a2 = null;
        if (lp1.f49971a.contains(C0926a.class)) {
            c0926a = null;
        } else {
            try {
                c0926a = C0926a.f11410c;
            } catch (Throwable th) {
                lp1.m16420a(C0926a.class, th);
                c0926a = null;
            }
        }
        if (c0926a != null) {
            return c0926a;
        }
        synchronized (this) {
            if (!sy2.f61601q.get()) {
                return null;
            }
            if (lp1.f49971a.contains(C0926a.class)) {
                if (c0926a2 == null) {
                    c0926a2 = new C0926a();
                    if (!lp1.f49971a.contains(C0926a.class)) {
                        try {
                            C0926a.f11410c = c0926a2;
                        } catch (Throwable th2) {
                            lp1.m16420a(C0926a.class, th2);
                        }
                    }
                }
                return c0926a2;
            }
            try {
                c0926a2 = C0926a.f11410c;
            } catch (Throwable th3) {
                lp1.m16420a(C0926a.class, th3);
            }
            if (c0926a2 == null) {
                c0926a2 = new C0926a();
                if (!lp1.f49971a.contains(C0926a.class)) {
                    C0926a.f11410c = c0926a2;
                }
            }
            return c0926a2;
            throw th;
        }
    }

    @Override // p000.zn2
    /* JADX INFO: renamed from: h */
    public yn2 mo12443h(Context context, String str, xn2 xn2Var) {
        yn2 yn2Var = new yn2();
        int iMo9834e = xn2Var.mo9834e(context, str);
        yn2Var.f70101a = iMo9834e;
        if (iMo9834e != 0) {
            yn2Var.f70103c = -1;
            return yn2Var;
        }
        int iMo9833c = xn2Var.mo9833c(context, str, true);
        yn2Var.f70102b = iMo9833c;
        if (iMo9833c != 0) {
            yn2Var.f70103c = 1;
        }
        return yn2Var;
    }

    /* JADX INFO: renamed from: k */
    public Intent m18907k(Context context) {
        if (!lp1.f49971a.contains(this)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent intent = new Intent("ReceiverService");
                    intent.setPackage("com.facebook.katana");
                    if (packageManager.resolveService(intent, 0) != null && ty2.m22350a(context, "com.facebook.katana")) {
                        return intent;
                    }
                    Intent intent2 = new Intent("ReceiverService");
                    intent2.setPackage("com.facebook.wakizashi");
                    if (packageManager.resolveService(intent2, 0) != null && ty2.m22350a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        switch (this.f55619a) {
            case 2:
                Object objMo4932g = co7Var.mo4932g(new rp7(h70.class, Executor.class));
                objMo4932g.getClass();
                return bna.m3926O((Executor) objMo4932g);
            case 6:
                return new s46(co7Var.mo4927b(rp7.m20740a(r46.class)));
            default:
                return new h06();
        }
    }

    /* JADX INFO: renamed from: n */
    public Object mo18908n(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: o */
    public boolean mo18909o(Method method) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public synchronized boolean m18910p(Context context) {
        return context.getPackageManager().isInstantApp();
    }

    /* JADX INFO: renamed from: q */
    public RemoteServiceWrapper$ServiceResult m18911q(RemoteServiceWrapper$EventType remoteServiceWrapper$EventType, String str, List list) {
        RemoteServiceWrapper$ServiceResult remoteServiceWrapper$ServiceResult;
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            RemoteServiceWrapper$ServiceResult remoteServiceWrapper$ServiceResult2 = RemoteServiceWrapper$ServiceResult.SERVICE_NOT_AVAILABLE;
            Context contextM21766a = sy2.m21766a();
            Intent intentM18907k = m18907k(contextM21766a);
            if (intentM18907k == null) {
                return remoteServiceWrapper$ServiceResult2;
            }
            o58 o58Var = new o58();
            try {
                if (!contextM21766a.bindService(intentM18907k, o58Var, 1)) {
                    return RemoteServiceWrapper$ServiceResult.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderM17807a = o58Var.m17807a();
                    if (iBinderM17807a != null) {
                        ey3 ey3VarM10745F = dy3.m10745F(iBinderM17807a);
                        Bundle bundleM17231e = n58.m17231e(remoteServiceWrapper$EventType, str, list);
                        if (bundleM17231e != null) {
                            ((cy3) ey3VarM10745F).m9934F(bundleM17231e);
                            bundleM17231e.toString();
                        }
                        remoteServiceWrapper$ServiceResult2 = RemoteServiceWrapper$ServiceResult.OPERATION_SUCCESS;
                    }
                    contextM21766a.unbindService(o58Var);
                    return remoteServiceWrapper$ServiceResult2;
                } catch (RemoteException unused) {
                    remoteServiceWrapper$ServiceResult = RemoteServiceWrapper$ServiceResult.SERVICE_ERROR;
                    sy2 sy2Var = sy2.f61585a;
                    contextM21766a.unbindService(o58Var);
                    return remoteServiceWrapper$ServiceResult;
                } catch (InterruptedException unused2) {
                    remoteServiceWrapper$ServiceResult = RemoteServiceWrapper$ServiceResult.SERVICE_ERROR;
                    sy2 sy2Var2 = sy2.f61585a;
                    contextM21766a.unbindService(o58Var);
                    return remoteServiceWrapper$ServiceResult;
                }
            } catch (Throwable th) {
                contextM21766a.unbindService(o58Var);
                sy2 sy2Var3 = sy2.f61585a;
                throw th;
            }
        } catch (Throwable th2) {
            lp1.m16420a(this, th2);
            return null;
        }
    }

    public String toString() {
        switch (this.f55619a) {
            case 16:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f55619a) {
            case 20:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_public_events_per_day", 72, 50000L).get()).longValue());
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.batch.retry_max_wait", 43, 21600000L).get();
            case 22:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.upload.debug_upload_interval", 9, 1000L).get();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.audience.filter_result_max_count", 22, 200L).get()).longValue());
            case 24:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_event_parameter_value_length", 19, 500L).get()).longValue());
            case 25:
                List list6 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.rb.attribution.user_properties", 80, "_npa,npa|_fot,fot").get();
            case 26:
                List list7 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("45769094", 11, 3600000L).get();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list8 = z8c.f71153a;
                ((klb) jlb.f45681b.f45682a.get()).getClass();
                return (Boolean) klb.f47498a.get();
            default:
                List list9 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.upload.max_events_per_day", 71, 100000L).get()).longValue());
        }
    }
}
