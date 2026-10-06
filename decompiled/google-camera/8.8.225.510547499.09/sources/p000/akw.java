package p000;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.DefaultLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akw {

    /* JADX INFO: renamed from: a */
    public Object f605a;

    /* JADX INFO: renamed from: b */
    public Object f606b;

    public akw() {
    }

    public akw(aku akuVar, akr akrVar) {
        Object reflectiveGenericLifecycleObserver;
        akrVar.getClass();
        akz akzVar = akz.f608a;
        boolean z = akuVar instanceof akt;
        boolean z2 = akuVar instanceof akl;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((akl) akuVar, (akt) akuVar);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((akl) akuVar, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (akt) akuVar;
        } else {
            Class<?> cls = akuVar.getClass();
            if (akz.f608a.m890a(cls) == 2) {
                Object obj = akz.f609b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(akz.m888b((Constructor) list.get(0), akuVar));
                } else {
                    int size = list.size();
                    akm[] akmVarArr = new akm[size];
                    for (int i = 0; i < size; i++) {
                        akmVarArr[i] = akz.m888b((Constructor) list.get(i), akuVar);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(akmVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(akuVar);
            }
        }
        this.f606b = reflectiveGenericLifecycleObserver;
        this.f605a = akrVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [akt, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m884a(akv akvVar, akq akqVar) {
        akr akrVarM871a = akqVar.m871a();
        this.f605a = abw.m169b((akr) this.f605a, akrVarM871a);
        this.f606b.mo883a(akvVar, akqVar);
        this.f605a = akrVarM871a;
    }

    /* JADX INFO: renamed from: b */
    public final void m885b() {
        Object obj = this.f606b;
        if (obj != null) {
            Arrays.fill((int[]) obj, -1);
        }
        this.f605a = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m886c(int i) {
        Object obj = this.f606b;
        if (obj == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.f606b = iArr;
            Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.f606b = iArr3;
            int length2 = iArr2.length;
            System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.f606b;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }
}
