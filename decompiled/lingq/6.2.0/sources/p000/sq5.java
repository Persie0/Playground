package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.security.crypto.MasterKey$KeyScheme;
import coil.C0855a;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.common.base.Optional;
import com.google.firebase.encoders.EncodingException;
import com.kochava.core.job.job.internal.JobAction;
import com.lingq.core.data.repository.C1290f;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1302r;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.regex.Pattern;
import javax.crypto.KeyGenerator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class sq5 implements cs4, fk6, hl8, idc {

    /* JADX INFO: renamed from: e */
    public static sq5 f61245e;

    /* JADX INFO: renamed from: f */
    public static Boolean f61246f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61247a;

    /* JADX INFO: renamed from: b */
    public Object f61248b;

    /* JADX INFO: renamed from: c */
    public Object f61249c;

    /* JADX INFO: renamed from: d */
    public Object f61250d;

    public sq5(int i) {
        this.f61247a = i;
        switch (i) {
            case 13:
                this.f61248b = new AtomicReference(AbstractC3489q9.f57425t);
                this.f61249c = new Object();
                break;
            case 14:
                this.f61250d = new ArrayList();
                break;
            case 16:
                this.f61248b = new ab9(8);
                break;
            case 19:
                this.f61248b = new WeakHashMap();
                this.f61249c = new WeakHashMap();
                this.f61250d = new WeakHashMap();
                break;
            case 25:
                this.f61248b = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f61249c = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f61250d = new ConcurrentHashMap();
                break;
            default:
                long[] jArr = om8.f54590a;
                this.f61248b = new n66();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21550b(sq5 sq5Var, Network network, boolean z) {
        boolean z2;
        boolean z3 = false;
        for (Network network2 : ((ConnectivityManager) sq5Var.f61248b).getAllNetworks()) {
            if (fa4.m11650l(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) sq5Var.f61248b).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        lp9 lp9Var = (lp9) sq5Var.f61249c;
        synchronized (lp9Var) {
            try {
                if (((C0855a) lp9Var.f49985a.get()) != null) {
                    lp9Var.f49989e = z3;
                } else {
                    lp9Var.m16428b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static sq5 m21551w(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new sq5(17, context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: A */
    public void m21552A(Object obj) {
        long jM20393t = r46.m20393t();
        if (jM20393t == wz9.f67573a) {
            this.f61250d = obj;
            return;
        }
        synchronized (this.f61249c) {
            sz9 sz9Var = (sz9) ((AtomicReference) this.f61248b).get();
            int iM21800a = sz9Var.m21800a(jM20393t);
            if (iM21800a < 0) {
                ((AtomicReference) this.f61248b).set(sz9Var.m21801b(obj, jM20393t));
            } else {
                sz9Var.f61681c[iM21800a] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m21553B(String str) {
        this.f61249c = str;
        Iterator it = ((ArrayList) this.f61250d).iterator();
        while (it.hasNext()) {
            C3073hf c3073hf = ((C3145jf) it.next()).f45497b;
            if (c3073hf == null) {
                fa4.m11636J("connector");
                throw null;
            }
            ny8 ny8Var = c3073hf.f42289a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) ny8Var.f53414b).readLock();
            lock.lock();
            try {
                hz3 hz3Var = (hz3) ny8Var.f53415c;
                lock.unlock();
                ny8Var.m17685M(new hz3(hz3Var.f43237a, str, hz3Var.f43239c));
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m21554C(String str) {
        this.f61248b = str;
        Iterator it = ((ArrayList) this.f61250d).iterator();
        while (it.hasNext()) {
            C3073hf c3073hf = ((C3145jf) it.next()).f45497b;
            if (c3073hf == null) {
                fa4.m11636J("connector");
                throw null;
            }
            ny8 ny8Var = c3073hf.f42289a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) ny8Var.f53414b).readLock();
            lock.lock();
            try {
                hz3 hz3Var = (hz3) ny8Var.f53415c;
                lock.unlock();
                String str2 = hz3Var.f43237a;
                ny8Var.m17685M(new hz3(str, hz3Var.f43238b, hz3Var.f43239c));
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m21555D(Object obj) {
        ((sj5) this.f61249c).m21420a(2, obj, (String) this.f61248b, (String) this.f61250d);
    }

    /* JADX INFO: renamed from: E */
    public void m21556E() {
        n66 n66Var = (n66) this.f61249c;
        String str = (String) this.f61248b;
        List list = (List) n66Var.m17259k(str);
        if (list != null) {
            list.remove((ui3) this.f61250d);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        n66Var.m17261m(str, list);
    }

    /* JADX INFO: renamed from: F */
    public void m21557F(Serializable serializable) {
        ((sj5) this.f61249c).m21420a(5, serializable, (String) this.f61248b, (String) this.f61250d);
    }

    /* JADX INFO: renamed from: G */
    public pc0 m21558G() {
        String strSubstring;
        int i;
        x5d x5dVar;
        x5d x5dVar2;
        String str = (String) this.f61248b;
        C0962f c0962f = (C0962f) this.f61249c;
        on9 on9Var = c0962f.f11849f;
        if (!pvc.m19504L(c0962f.f11845b)) {
            return new pc0(udd.m22703z(), new xp7(3, 17, 4));
        }
        if (f61246f == null) {
            f61246f = Boolean.valueOf(Process.isIsolated());
        }
        if (f61246f.booleanValue()) {
            return new pc0(udd.m22703z(), new xp7(3, 18, 4));
        }
        cdd cddVarM23257b = c0962f.f11850g.m23257b();
        zzacr zzacrVar = cddVarM23257b.f9949c;
        zzabz zzabzVar = zzabz.FILE;
        C3275kv c3275kv = bxc.f9152a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                C3386nv.m17626m("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        zzabzVar.getClass();
        if (!cddVarM23257b.f9954h) {
            i = 14;
        } else if (!cddVarM23257b.f9947a || !cddVarM23257b.f9948b.contains(zzabzVar)) {
            i = 3;
        } else if (zzacrVar.mo5422f() != 0) {
            List list = cddVarM23257b.f9952f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = cddVarM23257b.f9953g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            x5dVar2 = new x5d(null, new xp7(i));
        } else {
            try {
                String str2 = cddVarM23257b.f9951e;
                if (str2.isEmpty()) {
                    Optional optional = (Optional) c0962f.f11851h.get();
                    if (optional.mo6259c()) {
                        str2 = ((ApplicationInfo) optional.mo6258b()).dataDir;
                    } else {
                        t9a.m21916f(Level.WARNING, c0962f.m5409a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        x5dVar = new x5d(z3d.f70849c, new xp7(3, 7, 4));
                        x5dVar2 = x5dVar;
                    }
                }
                String str3 = File.separator;
                String str4 = cddVarM23257b.f9950d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                mq7 mq7Var = new mq7(zzacrVar, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = mq7Var.m17002m().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        x5d x5dVar3 = new x5d((z3d) ((dgd) on9Var.get()).m10371a(uriBuild, new l34(2, cddVarM23257b.f9957k.m11533s())), new xp7(5, 2, 4));
                        StrictMode.setThreadPolicy(threadPolicy);
                        x5dVar2 = x5dVar3;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } catch (zzaeh e) {
                    t9a.m21916f(Level.SEVERE, c0962f.m5409a(), e, "Failed to parse snapshot from shared storage for %s", str);
                    x5dVar2 = new x5d(null, new xp7(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                } catch (FileNotFoundException unused) {
                    t9a.m21916f(Level.INFO, c0962f.m5409a(), null, "Shared storage file not found for %s", str);
                    x5dVar2 = new x5d(null, new xp7(8));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e2) {
                t9a.m21916f(Level.WARNING, c0962f.m5409a(), e2, "Failed to read shared file for %s", str);
                x5dVar = new x5d(z3d.f70849c, new xp7(3, 10, 4));
            }
        }
        xp7 xp7Var = x5dVar2.f67806b;
        z3d z3dVar = x5dVar2.f67805a;
        if (z3dVar != null) {
            return new pc0(z3dVar, xp7Var);
        }
        int i2 = xp7Var.f68499c;
        try {
            dgd dgdVar = (dgd) on9Var.get();
            Uri uri = (Uri) this.f61250d;
            ajb ajbVar = (ajb) udd.m22703z().mo329r(7);
            phb phbVar = phb.f56224a;
            int i3 = dhb.f35664a;
            phb phbVar2 = phb.f56225b;
            InputStream inputStreamM11077j = eda.m11077j(dgdVar.m10372b(uri));
            try {
                whb whbVarM23288a = ((vhb) ajbVar).m23288a(inputStreamM11077j, phbVar2);
                if (inputStreamM11077j != null) {
                    inputStreamM11077j.close();
                }
                return new pc0((udd) whbVarM23288a, new xp7(4, i2, 4));
            } catch (Throwable th2) {
                if (inputStreamM11077j != null) {
                    try {
                        inputStreamM11077j.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException unused2) {
            t9a.m21916f(Level.INFO, c0962f.m5409a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return m21561J() ? new pc0(z3d.f70849c, new xp7(3, 16, 4)) : new pc0(udd.m22703z(), new xp7(3, 11, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x0033 A[EDGE_INSN: B:42:0x0033->B:40:0x0033 BREAK  A[LOOP:1: B:12:0x0055->B:45:?], SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public void m21559H(zzacr zzacrVar, Set set, String str) {
        l7d[] l7dVarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f61248b).getAndSet(true)) {
            vqb.m23467E().m23472F(new q41(15));
        }
        final byte[] bArrM5434n = zzacrVar.m5434n();
        ((ConcurrentHashMap) this.f61249c).compute(str, new BiFunction() { // from class: g7d
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrM5434n;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.f61250d).putIfAbsent((String) it.next(), new AtomicReference(new l7d(str, bArrM5434n)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof l7d) {
                        l7d l7dVar = (l7d) obj;
                        if (str.equals(l7dVar.m15985a())) {
                            l7dVar.m15986b(bArrM5434n);
                            break;
                        }
                        l7d l7dVar2 = new l7d(str, bArrM5434n);
                        l7dVarArr = str.compareTo(l7dVar.m15985a()) < 0 ? new l7d[]{l7dVar2, l7dVar} : new l7d[]{l7dVar, l7dVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, l7dVarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        l7d[] l7dVarArr2 = (l7d[]) obj;
                        int iBinarySearch = Arrays.binarySearch(l7dVarArr2, str);
                        if (iBinarySearch >= 0) {
                            l7dVarArr2[iBinarySearch].m15986b(bArrM5434n);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = l7dVarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            l7dVarArr = (l7d[]) Arrays.copyOf(l7dVarArr2, i2);
                        } else {
                            l7d[] l7dVarArr3 = new l7d[i2];
                            System.arraycopy(l7dVarArr2, 0, l7dVarArr3, 0, i);
                            System.arraycopy(l7dVarArr2, i, l7dVarArr3, i + 1, i3);
                            l7dVarArr = l7dVarArr3;
                        }
                        l7dVarArr[i] = new l7d(str, bArrM5434n);
                        do {
                            if (atomicReference.compareAndSet(obj, l7dVarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public synchronized void m21560I(int i, int i2, long j, long j2) {
        ((kjc) this.f61248b).f47443k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f61250d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((aeb) this.f61249c).m317d(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).mo5961c(new s01(this, jElapsedRealtime, 3));
    }

    /* JADX INFO: renamed from: J */
    public boolean m21561J() {
        ved vedVar = ((C0962f) this.f61249c).f11850g;
        zzabz zzabzVar = zzabz.FILE;
        n4d n4dVarM23258c = vedVar.m23258c();
        return n4dVarM23258c.m17222u() && ((AbstractCollection) n4dVarM23258c.m17227z()).contains(zzabzVar);
    }

    @Override // p000.fk6
    /* JADX INFO: renamed from: a */
    public boolean mo11926a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f61248b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public si4 m21562c() {
        MasterKey$KeyScheme masterKey$KeyScheme = (MasterKey$KeyScheme) this.f61250d;
        if (masterKey$KeyScheme == null && ((KeyGenParameterSpec) this.f61249c) == null) {
            C3386nv.m17626m("build() called before setKeyGenParameterSpec or setKeyScheme.");
            return null;
        }
        if (masterKey$KeyScheme == MasterKey$KeyScheme.AES256_GCM) {
            this.f61249c = new KeyGenParameterSpec.Builder((String) this.f61248b, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.f61249c;
        if (keyGenParameterSpec == null) {
            C3386nv.m17635v("KeyGenParameterSpec was null after build() check");
            return null;
        }
        Object obj = tq5.f62728a;
        if (keyGenParameterSpec.getKeySize() != 256) {
            C3386nv.m17627n("invalid key size, want 256 bits got ", keyGenParameterSpec.getKeySize(), " bits");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            C3386nv.m17625k(Arrays.toString(keyGenParameterSpec.getBlockModes()), "invalid block mode, want GCM got ");
            return null;
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            v63.m23130h(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            C3386nv.m17625k(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
            return null;
        }
        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
            C3386nv.m17626m("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        synchronized (tq5.f62728a) {
            String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpec);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        return new si4((KeyGenParameterSpec) this.f61249c, keyGenParameterSpec.getKeystoreAlias());
    }

    /* JADX INFO: renamed from: d */
    public void m21563d() {
        ur9 ur9Var = (ur9) this.f61248b;
        ie4 ie4VarMo296g = null;
        if (ur9Var != null) {
            ur9Var.mo4379d();
        } else {
            ar1 ar1Var = (ar1) this.f61249c;
            if (ar1Var != null) {
                bd4 bd4Var = (bd4) ar1Var.f7379b;
                C3309ls c3309ls = (C3309ls) ar1Var.f7380c;
                JobAction jobAction = (JobAction) ar1Var.f7381d;
                if (bd4Var.m3644o()) {
                    synchronized (bd4.f8367p) {
                        bd4Var.f8382o = null;
                    }
                    ie4VarMo296g = bd4Var.mo296g((ce4) c3309ls.f50065c, jobAction);
                }
            }
        }
        if (ie4VarMo296g != null) {
            synchronized (this) {
                this.f61250d = ie4VarMo296g;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m21564e(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f61248b;
        mo7 mo7Var = new mo7(byteArrayOutputStream, map, (HashMap) this.f61249c, (fp6) this.f61250d);
        if (obj == null) {
            return;
        }
        fp6 fp6Var = (fp6) map.get(obj.getClass());
        if (fp6Var != null) {
            fp6Var.mo24a(obj, mo7Var);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    /* JADX INFO: renamed from: f */
    public void m21565f(Serializable serializable) {
        ((sj5) this.f61249c).m21420a(6, serializable, (String) this.f61248b, (String) this.f61250d);
    }

    /* JADX INFO: renamed from: g */
    public Object m21566g() {
        long jM20393t = r46.m20393t();
        if (jM20393t == wz9.f67573a) {
            return this.f61250d;
        }
        sz9 sz9Var = (sz9) ((AtomicReference) this.f61248b).get();
        int iM21800a = sz9Var.m21800a(jM20393t);
        if (iM21800a >= 0) {
            return sz9Var.f61681c[iM21800a];
        }
        return null;
    }

    @Override // p000.cs4
    public Object getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        z21 z21Var = (z21) this.f61248b;
        v76 v76Var = (v76) this.f61250d;
        if (v76Var != null) {
            return v76Var;
        }
        Bundle bundle = (Bundle) ((ui3) this.f61249c).mo0a();
        C3275kv c3275kv = w76.f66482b;
        Method method = (Method) c3275kv.get(z21Var);
        if (method == null) {
            Class clsMo16595a = z21Var.mo16595a();
            clsMo16595a.getClass();
            method = clsMo16595a.getMethod("fromBundle", (Class[]) Arrays.copyOf(w76.f66481a, 1));
            c3275kv.put(z21Var, method);
            method.getClass();
        }
        Object objInvoke = method.invoke(null, bundle);
        objInvoke.getClass();
        v76 v76Var2 = (v76) objInvoke;
        this.f61250d = v76Var2;
        return v76Var2;
    }

    @Override // p000.idc
    /* JADX INFO: renamed from: h */
    public void mo12445h(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((C1045d) this.f61250d).m5949z(true, i, th, bArr, (String) this.f61248b, (ArrayList) this.f61249c, map);
    }

    /* JADX INFO: renamed from: i */
    public ColorStateList m21567i(int i) {
        int resourceId;
        ColorStateList colorStateListM10540p;
        TypedArray typedArray = (TypedArray) this.f61249c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM10540p = do7.m10540p((Context) this.f61248b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM10540p;
    }

    @Override // p000.cs4
    public boolean isInitialized() {
        return ((v76) this.f61250d) != null;
    }

    /* JADX INFO: renamed from: j */
    public Drawable m21568j(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f61249c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : bna.m3932U((Context) this.f61248b, resourceId);
    }

    /* JADX INFO: renamed from: k */
    public Drawable m21569k(int i) {
        int resourceId;
        Drawable drawableM177e;
        if (!((TypedArray) this.f61249c).hasValue(i) || (resourceId = ((TypedArray) this.f61249c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C2893cq c2893cqM9843a = C2893cq.m9843a();
        Context context = (Context) this.f61248b;
        synchronized (c2893cqM9843a) {
            drawableM177e = c2893cqM9843a.f34366a.m177e(context, resourceId, true);
        }
        return drawableM177e;
    }

    /* JADX INFO: renamed from: l */
    public int m21570l() {
        if (m21574p().f52219a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((lt5) u91.m22589G0(m21574p().f52219a)).f50100a) - ((long) m21574p().f52227i);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: m */
    public Typeface m21571m(int i, int i2, C3805yq c3805yq) {
        int resourceId = ((TypedArray) this.f61249c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f61250d) == null) {
            this.f61250d = new TypedValue();
        }
        Context context = (Context) this.f61248b;
        TypedValue typedValue = (TypedValue) this.f61250d;
        ThreadLocal threadLocal = f88.f38630a;
        if (context.isRestricted()) {
            return null;
        }
        return f88.m11598b(context, resourceId, typedValue, i2, c3805yq, true, false);
    }

    /* JADX INFO: renamed from: n */
    public boolean m21572n() {
        return !m21574p().f52219a.isEmpty();
    }

    /* JADX INFO: renamed from: o */
    public int m21573o() {
        if (m21574p().f52219a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((lt5) u91.m22597O0(m21574p().f52219a)).f50100a) + ((long) m21574p().f52227i);
        long jM21578t = ((long) m21578t()) - 1;
        if (j > jM21578t) {
            j = jM21578t;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: p */
    public n27 m21574p() {
        n27 n27Var = (n27) this.f61249c;
        if (n27Var != null) {
            return n27Var;
        }
        fa4.m11636J("layoutInfo");
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public int m21575q() {
        if (m21574p().f52219a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((lt5) u91.m22597O0(m21574p().f52219a)).f50111l + m21574p().f52220b) + m21574p().f52221c) - m21574p().f52225g);
    }

    /* JADX INFO: renamed from: r */
    public int m21576r() {
        if (m21574p().f52219a.isEmpty()) {
            return 0;
        }
        int i = ((lt5) u91.m22589G0(m21574p().f52219a)).f50111l + (-m21574p().f52224f);
        return Math.abs(i <= 0 ? i : 0);
    }

    /* JADX INFO: renamed from: s */
    public List m21577s(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f61248b).get(new ik7(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Override // p000.fk6
    public void shutdown() {
        ((ConnectivityManager) this.f61248b).unregisterNetworkCallback((n18) this.f61250d);
    }

    /* JADX INFO: renamed from: t */
    public int m21578t() {
        return ((Number) ((fu4) this.f61248b).mo0a()).intValue();
    }

    public String toString() {
        switch (this.f61247a) {
            case 4:
                String str = (String) this.f61250d;
                String str2 = (String) this.f61248b;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f61249c;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public Object m21579u(String str, InterfaceC3274ku interfaceC3274ku, boolean z, SuspendLambda suspendLambda) {
        if (interfaceC3274ku instanceof C3123iu) {
            return ((C1295k) ((d65) this.f61248b)).m7261S(str, ((C3123iu) interfaceC3274ku).m14145a(), z, suspendLambda);
        }
        if (interfaceC3274ku instanceof C3088hu) {
            return ((C1290f) ((xo1) this.f61249c)).m7185i(str, ((C3088hu) interfaceC3274ku).m13462a(), z, suspendLambda);
        }
        if (!(interfaceC3274ku instanceof C3160ju)) {
            gm5.m12750e();
            return null;
        }
        return ((C1302r) ((xd7) this.f61250d)).m7365y(str, ((C3160ju) interfaceC3274ku).m14647a(), z, suspendLambda);
    }

    /* JADX INFO: renamed from: v */
    public boolean m21580v() {
        if (((dh9) this.f61248b).getValue() != this.f61250d) {
            return true;
        }
        sq5 sq5Var = (sq5) this.f61249c;
        return sq5Var != null && sq5Var.m21580v();
    }

    /* JADX INFO: renamed from: x */
    public void m21581x(String str, String str2) {
        str2.getClass();
        ((Properties) this.f61249c).setProperty(str, str2);
        m21583z();
    }

    /* JADX INFO: renamed from: y */
    public void m21582y() {
        ((TypedArray) this.f61249c).recycle();
    }

    /* JADX INFO: renamed from: z */
    public void m21583z() {
        File file = (File) this.f61250d;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((Properties) this.f61249c).store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            pj5 pj5Var = (pj5) this.f61248b;
            if (pj5Var != null) {
                pj5Var.mo16255a("Failed to save property file with path " + file.getAbsolutePath() + ", error stacktrace: " + lda.m16112L(th3));
            }
        }
    }

    public /* synthetic */ sq5(int i, Object obj, Object obj2, String str) {
        this.f61247a = i;
        this.f61249c = obj;
        this.f61248b = str;
        this.f61250d = obj2;
    }

    public /* synthetic */ sq5(Object obj, Object obj2, Object obj3, int i) {
        this.f61247a = i;
        this.f61248b = obj;
        this.f61249c = obj2;
        this.f61250d = obj3;
    }

    public sq5(ur9 ur9Var) {
        this.f61247a = 15;
        this.f61250d = null;
        this.f61248b = ur9Var;
        this.f61249c = null;
    }

    public sq5(Context context, kjc kjcVar) {
        this.f61247a = 24;
        this.f61250d = new AtomicLong(-1L);
        this.f61249c = new aeb(context, aeb.f560l, new cs9("measurement:api"), mo3.f51630c);
        this.f61248b = kjcVar;
    }

    public sq5(C0962f c0962f, String str) {
        this.f61247a = 27;
        this.f61249c = c0962f;
        this.f61248b = str;
        Context context = c0962f.f11845b;
        Pattern pattern = rgd.f59246a;
        co7 co7Var = new co7(context);
        co7Var.m4942x("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        co7Var.m4943y(sb.toString());
        this.f61250d = co7Var.m4944z();
    }

    public sq5(C1045d c1045d, String str, ArrayList arrayList) {
        this.f61247a = 26;
        this.f61248b = str;
        this.f61249c = arrayList;
        this.f61250d = c1045d;
    }

    public sq5(File file, String str, pj5 pj5Var) {
        this.f61247a = 9;
        this.f61248b = pj5Var;
        this.f61249c = new Properties();
        this.f61250d = new File(file, str.concat(".properties"));
    }

    public sq5(d65 d65Var, xo1 xo1Var, xd7 xd7Var) {
        this.f61247a = 20;
        d65Var.getClass();
        xo1Var.getClass();
        xd7Var.getClass();
        this.f61248b = d65Var;
        this.f61249c = xo1Var;
        this.f61250d = xd7Var;
    }

    public sq5(y18 y18Var) {
        this.f61247a = 5;
        this.f61248b = new AtomicInt(0);
        this.f61249c = new w41(3);
        this.f61250d = new a45(8, this, y18Var);
    }

    public sq5(ar1 ar1Var) {
        this.f61247a = 15;
        this.f61250d = null;
        this.f61248b = null;
        this.f61249c = ar1Var;
    }

    public sq5(fu4 fu4Var) {
        this.f61247a = 6;
        this.f61248b = fu4Var;
    }

    public sq5(Runnable runnable) {
        this.f61247a = 1;
        this.f61249c = new CopyOnWriteArrayList();
        this.f61250d = new HashMap();
        this.f61248b = runnable;
    }

    public sq5(ConnectivityManager connectivityManager, lp9 lp9Var) {
        this.f61247a = 11;
        this.f61248b = connectivityManager;
        this.f61249c = lp9Var;
        n18 n18Var = new n18(this);
        this.f61250d = n18Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), n18Var);
    }

    public sq5(wda wdaVar, sq5 sq5Var) {
        this.f61247a = 18;
        this.f61248b = wdaVar;
        this.f61249c = sq5Var;
        this.f61250d = wdaVar.getValue();
    }

    public sq5(Context context) {
        this.f61247a = 0;
        context.getApplicationContext();
        this.f61248b = "_androidx_security_master_key_";
    }

    public sq5(ConcurrentMap concurrentMap, hk7 hk7Var, o16 o16Var, Class cls) {
        this.f61247a = 8;
        this.f61248b = concurrentMap;
        this.f61249c = hk7Var;
        this.f61250d = o16Var;
    }

    public /* synthetic */ sq5(int i, Object obj, Object obj2) {
        this.f61247a = i;
        this.f61248b = obj;
        this.f61249c = obj2;
    }
}
