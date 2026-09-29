package p000;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.C0713b;
import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.C1119i;
import com.google.common.util.concurrent.ExecutorC1122l;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a34 {

    /* JADX INFO: renamed from: g */
    public static final nid f171g = new nid();

    /* JADX INFO: renamed from: h */
    public static a34 f172h;

    /* JADX INFO: renamed from: a */
    public Object f173a;

    /* JADX INFO: renamed from: b */
    public Object f174b;

    /* JADX INFO: renamed from: c */
    public Object f175c;

    /* JADX INFO: renamed from: d */
    public Object f176d;

    /* JADX INFO: renamed from: e */
    public Object f177e;

    /* JADX INFO: renamed from: f */
    public Object f178f;

    public a34(InterfaceC3016fw interfaceC3016fw, Executor executor) {
        this.f174b = new AtomicLong(-9223372034707292160L);
        this.f175c = new AtomicReference(null);
        this.f176d = new AtomicReference(null);
        this.f177e = new ExecutorC1122l(AbstractC1120j.m6404a());
        f09 f09Var = new f09();
        this.f178f = f09Var;
        kj3 kj3Var = new kj3();
        kj3Var.f47375b = interfaceC3016fw;
        executor.getClass();
        kj3Var.f47376c = executor;
        this.f173a = kj3Var;
        f09Var.mo52a(kj3Var, AbstractC1120j.m6404a());
    }

    /* JADX INFO: renamed from: a */
    public static a34 m58a(vt5 vt5Var, MediaFormat mediaFormat, C0713b c0713b, MediaCrypto mediaCrypto, C3309ls c3309ls) {
        return new a34(vt5Var, mediaFormat, c0713b, null, mediaCrypto, c3309ls);
    }

    /* JADX INFO: renamed from: b */
    public static a34 m59b(vt5 vt5Var, MediaFormat mediaFormat, C0713b c0713b, Surface surface, MediaCrypto mediaCrypto) {
        return new a34(vt5Var, mediaFormat, c0713b, surface, mediaCrypto, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m60d(uva uvaVar) {
        h59 sharedValues = ConstraintLayout.getSharedValues();
        int i = uvaVar.f64435u;
        a3d a3dVar = new a3d();
        HashMap map = sharedValues.f41815a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference(a3dVar));
    }

    /* JADX INFO: renamed from: c */
    public Object m61c(InAppPurchaseUtils$IAPProductType inAppPurchaseUtils$IAPProductType, ArrayList arrayList) {
        Object objM3252s;
        Object objM3252s2;
        Class cls = (Class) this.f174b;
        if (!lp1.f49971a.contains(this)) {
            try {
                inAppPurchaseUtils$IAPProductType.getClass();
                Object objM3252s3 = b34.m3252s((Class) this.f173a, null, (Method) this.f175c, new Object[0]);
                if (objM3252s3 != null && (objM3252s = b34.m3252s(cls, objM3252s3, (Method) this.f176d, inAppPurchaseUtils$IAPProductType.getType())) != null && (objM3252s2 = b34.m3252s(cls, objM3252s, (Method) this.f177e, arrayList)) != null) {
                    return b34.m3252s(cls, objM3252s2, (Method) this.f178f, new Object[0]);
                }
            } catch (Throwable th) {
                lp1.m16420a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC1112b m62e() {
        AtomicLong atomicLong;
        long j;
        final int i;
        ListenableFuture listenableFutureM6397a;
        f09 f09Var = (f09) this.f178f;
        if (f09Var.isDone()) {
            return f09Var;
        }
        do {
            atomicLong = (AtomicLong) this.f174b;
            j = atomicLong.get();
            i = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, (((long) (((int) j) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f176d;
        f09 f09Var2 = new f09();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(f09Var2);
        if (listenableFuture == null) {
            listenableFutureM6397a = AbstractC1118h.m6401e(jmd.m14556a(new ztb(this, i, 13)), AbstractC1120j.m6404a());
        } else {
            InterfaceC3053gw interfaceC3053gw = new InterfaceC3053gw() { // from class: jld
                @Override // p000.InterfaceC3053gw
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f45812a.m63f(i);
                }
            };
            int i2 = jmd.f45851a;
            listenableFutureM6397a = AbstractC1118h.m6397a(listenableFuture, Throwable.class, new ubd(3, qld.m20020a(), interfaceC3053gw), (ExecutorC1122l) this.f177e);
        }
        f09Var2.m6387o(listenableFutureM6397a);
        kld kldVar = new kld(this, i);
        f09Var2.mo52a(new kr3(11, this, f09Var2, kldVar, false), AbstractC1120j.m6404a());
        return kldVar;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1112b m63f(int i) {
        Executor executor;
        AtomicLong atomicLong = (AtomicLong) this.f174b;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            C1119i c1119i = C1119i.f13545h;
            return c1119i != null ? c1119i : new C1119i();
        }
        lld lldVar = new lld(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f175c;
            lld lldVar2 = (lld) atomicReference.get();
            if (lldVar2 != null && lldVar2.f49810h > i) {
                C1119i c1119i2 = C1119i.f13545h;
                return c1119i2 != null ? c1119i2 : new C1119i();
            }
            do {
                if (atomicReference.compareAndSet(lldVar2, lldVar)) {
                    if (((int) (atomicLong.get() >>> 32)) > i) {
                        lldVar.cancel(true);
                        while (!atomicReference.compareAndSet(lldVar, null) && atomicReference.get() == lldVar) {
                        }
                        return lldVar;
                    }
                    kj3 kj3Var = (kj3) this.f173a;
                    InterfaceC3016fw interfaceC3016fw = (InterfaceC3016fw) kj3Var.f47375b;
                    if (interfaceC3016fw == null || (executor = (Executor) kj3Var.f47376c) == null) {
                        lldVar.m6387o((f09) this.f178f);
                        return lldVar;
                    }
                    lldVar.m6387o(AbstractC1118h.m6401e(jmd.m14556a(interfaceC3016fw), executor));
                    return lldVar;
                }
            } while (atomicReference.get() == lldVar2);
        }
    }

    public /* synthetic */ a34(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f173a = obj;
        this.f174b = obj2;
        this.f175c = obj3;
        this.f176d = obj4;
        this.f177e = obj5;
        this.f178f = obj6;
    }
}
