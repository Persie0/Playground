package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.StatFs;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0639g;
import coil.C0855a;
import com.google.common.collect.ImmutableList;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.core.task.internal.TaskState;
import java.io.File;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.AbstractC3192a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C3244l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ny8 implements id9, yoa {

    /* JADX INFO: renamed from: f */
    public static ny8 f53412f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53413a;

    /* JADX INFO: renamed from: b */
    public Object f53414b;

    /* JADX INFO: renamed from: c */
    public Object f53415c;

    /* JADX INFO: renamed from: d */
    public Object f53416d;

    /* JADX INFO: renamed from: e */
    public Object f53417e;

    public ny8(int i) {
        this.f53413a = i;
        String str = null;
        switch (i) {
            case 2:
                this.f53417e = new ArrayDeque();
                this.f53415c = new ArrayDeque();
                this.f53416d = new ArrayDeque();
                return;
            case 4:
                this.f53414b = new ArrayList();
                this.f53415c = new HashMap();
                this.f53416d = new HashMap();
                return;
            case 5:
                this.f53414b = new ReentrantReadWriteLock(true);
                this.f53415c = new hz3(str, 7, str);
                this.f53416d = new Object();
                this.f53417e = new LinkedHashSet();
                return;
            case 10:
                return;
            case 12:
                this.f53414b = new HashMap();
                this.f53415c = new HashMap();
                this.f53416d = new HashMap();
                this.f53417e = new HashMap();
                return;
            case 13:
                Object obj = new Object();
                this.f53414b = obj;
                this.f53416d = new HashMap();
                this.f53417e = Collections.synchronizedList(new ArrayList());
                this.f53415c = new b64(2);
                synchronized (obj) {
                    try {
                        for (TaskQueue taskQueue : TaskQueue.values()) {
                            ((HashMap) this.f53416d).put(taskQueue, new ArrayList());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 15:
                this.f53414b = new C3275kv(0);
                this.f53415c = new SparseArray();
                this.f53416d = new tk5(str);
                this.f53417e = new C3275kv(0);
                return;
            default:
                this.f53414b = null;
                this.f53415c = null;
                this.f53416d = null;
                this.f53417e = new ArrayDeque();
                return;
        }
    }

    /* JADX INFO: renamed from: A */
    public static synchronized ny8 m17672A() {
        try {
            if (f53412f == null) {
                f53412f = new ny8(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f53412f;
    }

    /* JADX INFO: renamed from: J */
    public static void m17673J(ny8 ny8Var, f18 f18Var, i18 i18Var, f18 f18Var2, int i) {
        mh2 mh2Var;
        if ((i & 1) != 0) {
            f18Var = null;
        }
        if ((i & 2) != 0) {
            i18Var = null;
        }
        if ((i & 4) != 0) {
            f18Var2 = null;
        }
        ny8Var.getClass();
        TimeZone timeZone = kcb.f47051a;
        boolean zIsShutdown = ((ThreadPoolExecutor) ny8Var.m17700t()).isShutdown();
        synchronized (ny8Var) {
            if (i18Var != null) {
                try {
                    if (!((ArrayDeque) ny8Var.f53416d).remove(i18Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (f18Var2 != null) {
                f18Var2.f38251b.decrementAndGet();
                if (!((ArrayDeque) ny8Var.f53415c).remove(f18Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (f18Var != null) {
                ((ArrayDeque) ny8Var.f53417e).add(f18Var);
                f18Var.f38252c.getClass();
                f18 f18VarM17702v = ny8Var.m17702v(((ex3) f18Var.f38252c.f43343b.f10360c).f38027d);
                if (f18VarM17702v != null) {
                    f18Var.f38251b = f18VarM17702v.f38251b;
                }
            }
            if ((i18Var != null || f18Var2 != null) && (zIsShutdown || ((ArrayDeque) ny8Var.f53415c).isEmpty())) {
                ((ArrayDeque) ny8Var.f53416d).isEmpty();
            }
            if (zIsShutdown) {
                List listM22622n1 = u91.m22622n1((ArrayDeque) ny8Var.f53417e);
                ((ArrayDeque) ny8Var.f53417e).clear();
                mh2Var = new mh2(0, listM22622n1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) ny8Var.f53417e).iterator();
                it.getClass();
                while (it.hasNext()) {
                    f18 f18Var3 = (f18) it.next();
                    if (((ArrayDeque) ny8Var.f53415c).size() >= 64) {
                        break;
                    }
                    if (f18Var3.f38251b.get() < 5) {
                        it.remove();
                        f18Var3.f38251b.incrementAndGet();
                        arrayList.add(f18Var3);
                        ((ArrayDeque) ny8Var.f53415c).add(f18Var3);
                    }
                }
                mh2Var = new mh2(0, arrayList);
            }
        }
        int size = mh2Var.f51321a.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            f18 f18Var4 = (f18) mh2Var.f51321a.get(i2);
            if (f18Var4 == f18Var) {
                z = false;
            } else {
                f18Var4.f38252c.getClass();
            }
            if (zIsShutdown) {
                f18Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                i18 i18Var2 = f18Var4.f38252c;
                i18Var2.m13625h(interruptedIOException);
                f18Var4.f38250a.mo3854j(i18Var2, interruptedIOException);
            } else {
                ExecutorService executorServiceM17700t = ny8Var.m17700t();
                f18Var4.getClass();
                i18 i18Var3 = f18Var4.f38252c;
                i18Var3.f43342a.f36085a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM17700t).execute(f18Var4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        i18 i18Var4 = f18Var4.f38252c;
                        i18Var4.m13625h(interruptedIOException2);
                        f18Var4.f38250a.mo3854j(i18Var4, interruptedIOException2);
                        ny8 ny8Var2 = i18Var3.f43342a.f36085a;
                        ny8Var2.getClass();
                        m17673J(ny8Var2, null, null, f18Var4, 3);
                    }
                } catch (Throwable th2) {
                    ny8 ny8Var3 = i18Var3.f43342a.f36085a;
                    ny8Var3.getClass();
                    m17673J(ny8Var3, null, null, f18Var4, 3);
                    throw th2;
                }
            }
        }
        if (!z || f18Var == null) {
            return;
        }
        f18Var.f38252c.getClass();
    }

    /* JADX INFO: renamed from: f */
    public static void m17674f(ny8 ny8Var, bj6 bj6Var) {
        ny8Var.getClass();
        bj6Var.getClass();
        if (((LinkedHashSet) ny8Var.f53416d).add(bj6Var)) {
            ej6 ej6Var = (ej6) ny8Var.f53415c;
            ej6Var.getClass();
            if (bj6Var.f8611c != null) {
                v63.m23135m("Handler '", bj6Var, "' is already registered with a dispatcher");
                return;
            }
            ej6Var.f37331e.addFirst(bj6Var);
            bj6Var.f8611c = ny8Var;
            ej6Var.m11174b();
        }
    }

    /* JADX INFO: renamed from: B */
    public wta m17675B(z21 z21Var, String str) {
        wta wtaVar;
        wta wtaVarMo3069a;
        synchronized (((tr3) this.f53417e)) {
            try {
                cua cuaVar = (cua) this.f53414b;
                cuaVar.getClass();
                wtaVar = (wta) cuaVar.f34560a.get(str);
                if (z21Var.m25415d(wtaVar)) {
                    zta ztaVar = (zta) this.f53415c;
                    if (ztaVar instanceof wl8) {
                        wl8 wl8Var = (wl8) ztaVar;
                        wtaVar.getClass();
                        AbstractC3572sf abstractC3572sf = wl8Var.f67018d;
                        if (abstractC3572sf != null) {
                            fs6 fs6Var = wl8Var.f67019e;
                            fs6Var.getClass();
                            lid.m16235a(wtaVar, fs6Var, abstractC3572sf);
                        }
                    }
                    wtaVar.getClass();
                } else {
                    p56 p56Var = new p56((qr1) this.f53416d);
                    p56Var.f58099a.put(m58.f50615d, str);
                    zta ztaVar2 = (zta) this.f53415c;
                    ztaVar2.getClass();
                    try {
                        try {
                            wtaVarMo3069a = ztaVar2.mo3071c(z21Var, p56Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = z21Var.f70781a;
                            cls.getClass();
                            wtaVarMo3069a = ztaVar2.mo3070b(cls, p56Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = z21Var.f70781a;
                        cls2.getClass();
                        wtaVarMo3069a = ztaVar2.mo3069a(cls2);
                    }
                    wtaVar = wtaVarMo3069a;
                    cua cuaVar2 = (cua) this.f53414b;
                    cuaVar2.getClass();
                    wtaVar.getClass();
                    wta wtaVar2 = (wta) cuaVar2.f34560a.put(str, wtaVar);
                    if (wtaVar2 != null) {
                        wtaVar2.m24155S2();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wtaVar;
    }

    /* JADX INFO: renamed from: C */
    public boolean m17676C(Context context) {
        if (((Boolean) this.f53416d) == null) {
            this.f53416d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f53415c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f53416d).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    public boolean m17677D(Context context) {
        if (((Boolean) this.f53415c) == null) {
            this.f53415c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f53415c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f53415c).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    public void m17678E(C0639g c0639g) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
        String str = abstractComponentCallbacksC0635c.f5693e;
        HashMap map = (HashMap) this.f53415c;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0635c.f5693e, c0639g);
        if (abstractComponentCallbacksC0635c.f5684Z) {
            boolean z = abstractComponentCallbacksC0635c.f5683Y;
            ne3 ne3Var = (ne3) this.f53417e;
            if (z) {
                ne3Var.m17398V2(abstractComponentCallbacksC0635c);
            } else {
                ne3Var.m17402Z2(abstractComponentCallbacksC0635c);
            }
            abstractComponentCallbacksC0635c.f5684Z = false;
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0635c);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m17679F(C0639g c0639g) {
        HashMap map = (HashMap) this.f53415c;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
        if (abstractComponentCallbacksC0635c.f5683Y) {
            ((ne3) this.f53417e).m17402Z2(abstractComponentCallbacksC0635c);
        }
        if (map.get(abstractComponentCallbacksC0635c.f5693e) == c0639g && ((C0639g) map.put(abstractComponentCallbacksC0635c.f5693e, null)) != null && AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0635c);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m17680G(tr9 tr9Var) {
        synchronized (this.f53414b) {
            try {
                List list = (List) ((HashMap) this.f53416d).get(tr9Var.f62779f);
                if (list != null) {
                    list.remove(tr9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m17691a();
    }

    /* JADX INFO: renamed from: H */
    public void m17681H(tr9 tr9Var) {
        synchronized (this.f53414b) {
            try {
                List list = (List) ((HashMap) this.f53416d).get(tr9Var.f62779f);
                if (list != null) {
                    list.add(tr9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m17691a();
    }

    /* JADX INFO: renamed from: I */
    public void m17682I(Thread thread, Throwable th) {
        ArrayList arrayListM3224U = b34.m3224U((List) this.f53417e);
        if (arrayListM3224U.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayListM3224U.iterator();
            while (it.hasNext()) {
                ((dm1) it.next()).getClass();
                sq5 sq5Var = dm1.f35809h;
                sq5Var.m21565f("UncaughtException, " + thread.getName());
                sq5Var.m21565f(th);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: K */
    public void m17683K(Runnable runnable) {
        ((b64) this.f53415c).getClass();
        ExecutorService executorService = b64.f8005f;
        if (executorService != null) {
            executorService.execute(new ks6(3, this, runnable));
        } else {
            ho2.m13385e("Failed to start threadpool");
        }
    }

    /* JADX INFO: renamed from: L */
    public void m17684L(Runnable runnable) {
        ((Handler) ((b64) this.f53415c).f8007b).post(new ks6(3, this, runnable));
    }

    /* JADX INFO: renamed from: M */
    public void m17685M(hz3 hz3Var) {
        Set setM22627s1;
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f53414b).readLock();
        lock.lock();
        try {
            hz3 hz3Var2 = (hz3) this.f53415c;
            lock.unlock();
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f53414b;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f53415c = hz3Var;
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                if (hz3Var.equals(hz3Var2)) {
                    return;
                }
                synchronized (this.f53416d) {
                    setM22627s1 = u91.m22627s1((LinkedHashSet) this.f53417e);
                }
                Iterator it = setM22627s1.iterator();
                while (it.hasNext()) {
                    ((vi3) it.next()).invoke(hz3Var);
                }
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: N */
    public Bundle m17686N(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f53416d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: O */
    public void m17687O(zg9 zg9Var) {
        zg9Var.getClass();
        mv5 mv5Var = new mv5(11, this, zg9Var);
        synchronized (this.f53416d) {
        }
        ((Handler) ((qn3) this.f53414b).f57974a).postDelayed(mv5Var, 5400000L);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    /* JADX INFO: renamed from: P */
    public Bundle m17688P() {
        qfc qfcVar = (qfc) this.f53417e;
        if (((Bundle) this.f53416d) == null) {
            String str = (String) this.f53414b;
            SharedPreferences sharedPreferencesM19930H = qfcVar.m19930H();
            kjc kjcVar = (kjc) qfcVar.f60774a;
            String string = sharedPreferencesM19930H.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                blb.m3870a();
                                                if (kjcVar.f47436d.m4869O(null, z8c.f71132P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                xcc xccVar = kjcVar.f47438f;
                                                kjc.m15280l(xccVar);
                                                xccVar.f68080f.m17924b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            blb.m3870a();
                                            if (kjcVar.f47436d.m4869O(null, z8c.f71132P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            xcc xccVar2 = kjcVar.f47438f;
                                            kjc.m15280l(xccVar2);
                                            xccVar2.f68080f.m17924b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        xcc xccVar3 = kjcVar.f47438f;
                                        kjc.m15280l(xccVar3);
                                        xccVar3.f68080f.m17924b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    xcc xccVar4 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar4);
                                    xccVar4.f68080f.m17924b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                xcc xccVar5 = kjcVar.f47438f;
                                kjc.m15280l(xccVar5);
                                xccVar5.f68080f.m17924b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            xcc xccVar6 = kjcVar.f47438f;
                            kjc.m15280l(xccVar6);
                            xccVar6.f68080f.m17923a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f53416d = bundle;
                } catch (JSONException unused2) {
                    xcc xccVar7 = kjcVar.f47438f;
                    kjc.m15280l(xccVar7);
                    xccVar7.f68080f.m17923a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f53416d) == null) {
                this.f53416d = (Bundle) this.f53415c;
            }
        }
        Bundle bundle2 = (Bundle) this.f53416d;
        lda.m16130p(bundle2);
        return new Bundle(bundle2);
    }

    /* JADX INFO: renamed from: Q */
    public void m17689Q(Bundle bundle) {
        qfc qfcVar = (qfc) this.f53417e;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesM19930H = qfcVar.m19930H();
        kjc kjcVar = (kjc) qfcVar.f60774a;
        SharedPreferences.Editor editorEdit = sharedPreferencesM19930H.edit();
        int size = bundle2.size();
        String str = (String) this.f53414b;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        blb.m3870a();
                        if (kjcVar.f47436d.m4869O(null, z8c.f71132P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                xcc xccVar = kjcVar.f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68080f.m17924b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                xcc xccVar2 = kjcVar.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68080f.m17924b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        xcc xccVar3 = kjcVar.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68080f.m17924b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f53416d = bundle2;
    }

    /* JADX INFO: renamed from: R */
    public ArrayList m17690R(OutputStream outputStream) {
        tfd tfdVarM22027a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = (ArrayList) this.f53416d;
        if (!arrayList2.isEmpty() && (tfdVarM22027a = tfd.m22027a(outputStream, arrayList2)) != null) {
            arrayList.add(tfdVarM22027a);
        }
        Iterator<E> it = ((ImmutableList) this.f53415c).iterator();
        if (!it.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        g9a.m12435l(it.next());
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m17691a() {
        ArrayList<tr9> arrayList = new ArrayList();
        synchronized (this.f53414b) {
            try {
                for (Map.Entry entry : ((HashMap) this.f53416d).entrySet()) {
                    TaskQueue taskQueue = (TaskQueue) entry.getKey();
                    for (tr9 tr9Var : (List) entry.getValue()) {
                        if (tr9Var.m22278c()) {
                            arrayList.add(tr9Var);
                        }
                        if (taskQueue.ordered) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (tr9 tr9Var2 : arrayList) {
            synchronized (tr9Var2.f62774a) {
                try {
                    if (tr9Var2.m22278c()) {
                        tr9Var2.f62786m = TaskState.Started;
                        TaskQueue taskQueue2 = tr9Var2.f62779f;
                        if (taskQueue2 == TaskQueue.UI) {
                            tr9Var2.f62777d.post(tr9Var2.f62783j);
                        } else if (taskQueue2 == TaskQueue.Primary) {
                            tr9Var2.f62776c.post(tr9Var2.f62783j);
                        } else {
                            tr9Var2.f62787n = tr9Var2.f62778e.submit(tr9Var2.f62783j);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: c */
    public yd9 mo13795c() {
        return (e82) this.f53416d;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: d */
    public long mo9842d(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        int iMo10484b = abstractC3081hn.mo10484b();
        long jMax = 0;
        for (int i = 0; i < iMo10484b; i++) {
            jMax = Math.max(jMax, ((InterfaceC3117in) this.f53414b).get(i).mo3396c(abstractC3081hn.mo10483a(i), abstractC3081hn2.mo10483a(i), abstractC3081hn3.mo10483a(i)));
        }
        return jMax;
    }

    /* JADX INFO: renamed from: e */
    public void m17692e(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        if (((ArrayList) this.f53414b).contains(abstractComponentCallbacksC0635c)) {
            ij6.m13966x(abstractComponentCallbacksC0635c, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f53414b)) {
            ((ArrayList) this.f53414b).add(abstractComponentCallbacksC0635c);
        }
        abstractComponentCallbacksC0635c.f5705k = true;
    }

    /* JADX INFO: renamed from: g */
    public void m17693g(dj6 dj6Var) {
        if (((LinkedHashSet) this.f53417e).add(dj6Var)) {
            ((ej6) this.f53415c).m11173a(this, dj6Var, -1);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m17694h(hr6 hr6Var, int i) {
        if (i != 1 && i != 0) {
            C3386nv.m17624j(ux5.m22988k(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.f53417e).add(hr6Var)) {
            ((ej6) this.f53415c).m11173a(this, hr6Var, i);
        }
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        if (((AbstractC3081hn) this.f53416d) == null) {
            this.f53416d = abstractC3081hn3.mo10485c();
        }
        AbstractC3081hn abstractC3081hn4 = (AbstractC3081hn) this.f53416d;
        if (abstractC3081hn4 == null) {
            fa4.m11636J("velocityVector");
            throw null;
        }
        int iMo10484b = abstractC3081hn4.mo10484b();
        int i = 0;
        while (true) {
            AbstractC3081hn abstractC3081hn5 = (AbstractC3081hn) this.f53416d;
            if (i >= iMo10484b) {
                if (abstractC3081hn5 != null) {
                    return abstractC3081hn5;
                }
                fa4.m11636J("velocityVector");
                throw null;
            }
            if (abstractC3081hn5 == null) {
                fa4.m11636J("velocityVector");
                throw null;
            }
            abstractC3081hn5.mo10487e(i, ((InterfaceC3117in) this.f53414b).get(i).mo3395b(j, abstractC3081hn.mo10483a(i), abstractC3081hn2.mo10483a(i), abstractC3081hn3.mo10483a(i)));
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m17695j(Object obj, Object obj2, wj4 wj4Var, boolean z) {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.f53415c) == null) {
            C3386nv.m17633t("addPrimitive cannot be called after build");
            return;
        }
        if (obj == null && obj2 == null) {
            v63.m23147y("at least one of the `fullPrimitive` or `primitive` must be set");
            return;
        }
        if (wj4Var.m24017C() != KeyStatusType.ENABLED) {
            v63.m23147y("only ENABLED key is allowed");
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f53415c;
        Integer numValueOf = Integer.valueOf(wj4Var.m24015A());
        if (wj4Var.m24016B() == OutputPrefixType.RAW) {
            numValueOf = null;
        }
        lda ldaVarM18922a = p66.f55658b.m18922a(co7.m4920k(wj4Var.m24019z().m439A(), wj4Var.m24019z().m440B(), wj4Var.m24019z().m442z(), wj4Var.m24016B(), numValueOf));
        int i = wr1.f67198a[wj4Var.m24016B().ordinal()];
        if (i == 1 || i == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(wj4Var.m24015A()).array();
        } else if (i == 3) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(wj4Var.m24015A()).array();
        } else {
            if (i != 4) {
                v63.m23147y("unknown output prefix type");
                return;
            }
            bArrArray = AbstractC3695vr.f65810e;
        }
        hk7 hk7Var = new hk7(obj, obj2, bArrArray, wj4Var.m24017C(), wj4Var.m24016B(), wj4Var.m24015A(), wj4Var.m24019z().m439A(), ldaVarM18922a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hk7Var);
        byte[] bArr = hk7Var.f42536c;
        ik7 ik7Var = new ik7(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(ik7Var, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(hk7Var);
            concurrentHashMap.put(ik7Var, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (((hk7) this.f53416d) == null) {
                this.f53416d = hk7Var;
            } else {
                C3386nv.m17633t("you cannot set two primary primitives");
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public C0855a m17696k() {
        Context context = (Context) this.f53414b;
        s72 s72Var = (s72) this.f53415c;
        final int i = 0;
        cs4 cs4VarM15356a = AbstractC3192a.m15356a(new ui3(this) { // from class: wz3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ny8 f67547b;

            {
                this.f67547b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2;
                int largeMemoryClass;
                l18 l18Var;
                int i3 = i;
                ny8 ny8Var = this.f67547b;
                switch (i3) {
                    case 0:
                        Context context2 = (Context) ny8Var.f53414b;
                        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                        double d = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            systemService.getClass();
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        C3126ix c3126ix = new C3126ix();
                        if (d > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC3057h.f41581a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            i2 = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
                            break;
                        } else {
                            i2 = 0;
                        }
                        return new m18(i2 > 0 ? new fs6(i2, c3126ix) : new vqb(c3126ix, 11), c3126ix);
                    default:
                        p58 p58Var = p58.f55614h;
                        Context context3 = (Context) ny8Var.f53414b;
                        synchronized (p58Var) {
                            try {
                                l18Var = p58.f55615i;
                                if (l18Var == null) {
                                    rg4 rg4Var = u33.f63345a;
                                    v72 v72Var = ph2.f56212a;
                                    t62 t62Var = t62.f61909c;
                                    Bitmap.Config[] configArr3 = AbstractC3057h.f41581a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM23080V = v33.m23080V(cacheDir);
                                    String str = d57.f35013b;
                                    d57 d57VarM12977i = gz8.m12977i(fileM23080V);
                                    long jM15947j = 10485760;
                                    try {
                                        File file = d57VarM12977i.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jM15947j = l70.m15947j((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    l18 l18Var2 = new l18(jM15947j, t62Var, rg4Var, d57VarM12977i);
                                    p58.f55615i = l18Var2;
                                    l18Var = l18Var2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return l18Var;
                }
            }
        });
        final int i2 = 1;
        cs4 cs4VarM15356a2 = AbstractC3192a.m15356a(new ui3(this) { // from class: wz3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ny8 f67547b;

            {
                this.f67547b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3;
                int largeMemoryClass;
                l18 l18Var;
                int i4 = i2;
                ny8 ny8Var = this.f67547b;
                switch (i4) {
                    case 0:
                        Context context2 = (Context) ny8Var.f53414b;
                        Bitmap.Config[] configArr = AbstractC3057h.f41581a;
                        double d = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            systemService.getClass();
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        C3126ix c3126ix = new C3126ix();
                        if (d > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC3057h.f41581a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                largeMemoryClass = 256;
                            }
                            i3 = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
                            break;
                        } else {
                            i3 = 0;
                        }
                        return new m18(i3 > 0 ? new fs6(i3, c3126ix) : new vqb(c3126ix, 11), c3126ix);
                    default:
                        p58 p58Var = p58.f55614h;
                        Context context3 = (Context) ny8Var.f53414b;
                        synchronized (p58Var) {
                            try {
                                l18Var = p58.f55615i;
                                if (l18Var == null) {
                                    rg4 rg4Var = u33.f63345a;
                                    v72 v72Var = ph2.f56212a;
                                    t62 t62Var = t62.f61909c;
                                    Bitmap.Config[] configArr3 = AbstractC3057h.f41581a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File fileM23080V = v33.m23080V(cacheDir);
                                    String str = d57.f35013b;
                                    d57 d57VarM12977i = gz8.m12977i(fileM23080V);
                                    long jM15947j = 10485760;
                                    try {
                                        File file = d57VarM12977i.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jM15947j = l70.m15947j((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    l18 l18Var2 = new l18(jM15947j, t62Var, rg4Var, d57VarM12977i);
                                    p58.f55615i = l18Var2;
                                    l18Var = l18Var2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return l18Var;
                }
            }
        });
        cs4 cs4VarM15356a3 = AbstractC3192a.m15356a(new C3288l7(21));
        bd1 bd1Var = (bd1) this.f53416d;
        if (bd1Var == null) {
            EmptyList emptyList = EmptyList.f47638a;
            bd1Var = new bd1(emptyList, emptyList, emptyList, emptyList, emptyList);
        }
        return new C0855a(context, s72Var, cs4VarM15356a, cs4VarM15356a2, cs4VarM15356a3, bd1Var, (xz3) this.f53417e);
    }

    /* JADX INFO: renamed from: l */
    public tr9 m17697l(TaskQueue taskQueue, sq5 sq5Var) {
        b64 b64Var = (b64) this.f53415c;
        Handler handler = (Handler) b64Var.f8007b;
        Handler handler2 = (Handler) b64Var.f8006a;
        ExecutorService executorService = b64.f8005f;
        if (executorService != null) {
            return new tr9(handler, handler2, executorService, taskQueue, this, sq5Var, null);
        }
        ho2.m13385e("Failed to start threadpool");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m17698m(zg9 zg9Var) {
        Runnable runnable;
        zg9Var.getClass();
        synchronized (this.f53416d) {
            runnable = (Runnable) ((LinkedHashMap) this.f53417e).remove(zg9Var);
        }
        if (runnable != null) {
            ((Handler) ((qn3) this.f53414b).f57974a).removeCallbacks(runnable);
        }
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: n */
    public t89 mo13796n() {
        return (d82) this.f53417e;
    }

    /* JADX INFO: renamed from: p */
    public void m17699p(dj6 dj6Var, zi6 zi6Var) {
        ej6 ej6Var = (ej6) this.f53415c;
        ej6Var.getClass();
        if (ej6Var.f37333g != 0) {
            return;
        }
        bj6 bj6VarM11175c = ej6Var.m11175c(-1);
        ej6Var.f37332f = bj6VarM11175c;
        ej6Var.f37333g = -1;
        ej6Var.f37334h = dj6Var;
        if (zi6Var != null) {
            if (bj6VarM11175c != null) {
                bj6VarM11175c.mo3783d(zi6Var);
            }
            C3244l c3244l = ej6Var.f37327a;
            gj6 gj6Var = new gj6(zi6Var);
            c3244l.getClass();
            c3244l.m15572j(null, gj6Var);
        }
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        if (((AbstractC3081hn) this.f53415c) == null) {
            this.f53415c = abstractC3081hn.mo10485c();
        }
        AbstractC3081hn abstractC3081hn4 = (AbstractC3081hn) this.f53415c;
        if (abstractC3081hn4 == null) {
            fa4.m11636J("valueVector");
            throw null;
        }
        int iMo10484b = abstractC3081hn4.mo10484b();
        int i = 0;
        while (true) {
            AbstractC3081hn abstractC3081hn5 = (AbstractC3081hn) this.f53415c;
            if (i >= iMo10484b) {
                if (abstractC3081hn5 != null) {
                    return abstractC3081hn5;
                }
                fa4.m11636J("valueVector");
                throw null;
            }
            if (abstractC3081hn5 == null) {
                fa4.m11636J("valueVector");
                throw null;
            }
            abstractC3081hn5.mo10487e(i, ((InterfaceC3117in) this.f53414b).get(i).mo3398e(j, abstractC3081hn.mo10483a(i), abstractC3081hn2.mo10483a(i), abstractC3081hn3.mo10483a(i)));
            i++;
        }
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: s */
    public AbstractC3081hn mo17609s(AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        if (((AbstractC3081hn) this.f53417e) == null) {
            this.f53417e = abstractC3081hn3.mo10485c();
        }
        AbstractC3081hn abstractC3081hn4 = (AbstractC3081hn) this.f53417e;
        if (abstractC3081hn4 == null) {
            fa4.m11636J("endVelocityVector");
            throw null;
        }
        int iMo10484b = abstractC3081hn4.mo10484b();
        int i = 0;
        while (true) {
            AbstractC3081hn abstractC3081hn5 = (AbstractC3081hn) this.f53417e;
            if (i >= iMo10484b) {
                if (abstractC3081hn5 != null) {
                    return abstractC3081hn5;
                }
                fa4.m11636J("endVelocityVector");
                throw null;
            }
            if (abstractC3081hn5 == null) {
                fa4.m11636J("endVelocityVector");
                throw null;
            }
            abstractC3081hn5.mo10487e(i, ((InterfaceC3117in) this.f53414b).get(i).mo3397d(abstractC3081hn.mo10483a(i), abstractC3081hn2.mo10483a(i), abstractC3081hn3.mo10483a(i)));
            i++;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized ExecutorService m17700t() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f53414b) == null) {
                this.f53414b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new jcb(kcb.f47052b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f53414b;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public String toString() {
        switch (this.f53413a) {
            case 1:
                String string = ((Socket) this.f53414b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public AbstractComponentCallbacksC0635c m17701u(String str) {
        C0639g c0639g = (C0639g) ((HashMap) this.f53415c).get(str);
        if (c0639g != null) {
            return c0639g.f5768c;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public f18 m17702v(String str) {
        Iterator it = ((ArrayDeque) this.f53415c).iterator();
        it.getClass();
        while (it.hasNext()) {
            f18 f18Var = (f18) it.next();
            if (fa4.m11650l(((ex3) f18Var.f38252c.f43343b.f10360c).f38027d, str)) {
                return f18Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f53417e).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            f18 f18Var2 = (f18) it2.next();
            if (fa4.m11650l(((ex3) f18Var2.f38252c.f43343b.f10360c).f38027d, str)) {
                return f18Var2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC0635c m17703w(String str) {
        for (C0639g c0639g : ((HashMap) this.f53415c).values()) {
            if (c0639g != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17703w = c0639g.f5768c;
                if (!str.equals(abstractComponentCallbacksC0635cM17703w.f5693e)) {
                    abstractComponentCallbacksC0635cM17703w = abstractComponentCallbacksC0635cM17703w.f5676R.f5742c.m17703w(str);
                }
                if (abstractComponentCallbacksC0635cM17703w != null) {
                    return abstractComponentCallbacksC0635cM17703w;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public ArrayList m17704x() {
        ArrayList arrayList = new ArrayList();
        for (C0639g c0639g : ((HashMap) this.f53415c).values()) {
            if (c0639g != null) {
                arrayList.add(c0639g);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public ArrayList m17705y() {
        ArrayList arrayList = new ArrayList();
        for (C0639g c0639g : ((HashMap) this.f53415c).values()) {
            if (c0639g != null) {
                arrayList.add(c0639g.f5768c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public List m17706z() {
        ArrayList arrayList;
        if (((ArrayList) this.f53414b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f53414b)) {
            arrayList = new ArrayList((ArrayList) this.f53414b);
        }
        return arrayList;
    }

    public ny8(qn3 qn3Var, qfa qfaVar) {
        this.f53413a = 14;
        qn3Var.getClass();
        this.f53414b = qn3Var;
        this.f53415c = qfaVar;
        this.f53416d = new Object();
        this.f53417e = new LinkedHashMap();
    }

    public /* synthetic */ ny8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f53413a = i;
        this.f53414b = obj;
        this.f53415c = obj2;
        this.f53416d = obj3;
        this.f53417e = obj4;
    }

    public ny8(qfc qfcVar, String str) {
        this.f53413a = 20;
        this.f53417e = qfcVar;
        lda.m16127m(str);
        this.f53414b = str;
        this.f53415c = new Bundle();
    }

    public ny8(cua cuaVar, zta ztaVar, qr1 qr1Var) {
        this.f53413a = 18;
        cuaVar.getClass();
        ztaVar.getClass();
        qr1Var.getClass();
        this.f53414b = cuaVar;
        this.f53415c = ztaVar;
        this.f53416d = qr1Var;
        this.f53417e = new tr3(16);
    }

    public ny8(Socket socket) {
        this.f53413a = 1;
        this.f53414b = socket;
        this.f53415c = new AtomicInteger();
        this.f53416d = new e82(this);
        this.f53417e = new d82(this);
    }

    public ny8(hy8 hy8Var) {
        this.f53413a = 12;
        this.f53414b = new HashMap(hy8Var.f43216a);
        this.f53415c = new HashMap(hy8Var.f43217b);
        this.f53416d = new HashMap(hy8Var.f43218c);
        this.f53417e = new HashMap(hy8Var.f43219d);
    }

    public ny8(C3487q7 c3487q7) {
        this.f53413a = 7;
        this.f53414b = c3487q7;
        this.f53415c = new ej6();
        new LinkedHashSet();
        this.f53416d = new LinkedHashSet();
        this.f53417e = new LinkedHashSet();
    }

    public ny8(w41 w41Var) {
        this.f53413a = 21;
        this.f53414b = (uid) w41Var.f66365a;
        this.f53415c = (ImmutableList) w41Var.f66366b;
        this.f53416d = (ArrayList) w41Var.f66367c;
        this.f53417e = (Uri) w41Var.f66369e;
    }

    public ny8(Context context) {
        this.f53413a = 6;
        this.f53414b = context.getApplicationContext();
        this.f53415c = AbstractC2983f.f38126a;
        this.f53416d = null;
        this.f53417e = new xz3();
    }

    public ny8(Class cls) {
        this.f53413a = 9;
        this.f53415c = new ConcurrentHashMap();
        this.f53414b = cls;
        this.f53417e = o16.f53589b;
    }

    public ny8(InterfaceC3117in interfaceC3117in) {
        this.f53413a = 17;
        this.f53414b = interfaceC3117in;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ny8(b73 b73Var) {
        this(new gw9(b73Var, 4));
        this.f53413a = 17;
    }
}
