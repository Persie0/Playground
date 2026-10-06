package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awc {

    /* JADX INFO: renamed from: a */
    private final ClassLoader f2575a;

    public awc(ClassLoader classLoader) {
        this.f2575a = classLoader;
    }

    /* JADX INFO: renamed from: a */
    public final Class m2069a() {
        Class<?> clsLoadClass = this.f2575a.loadClass(hIAHJKEnGsNbz.DaOOlcqWze);
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    /* JADX INFO: renamed from: b */
    public final Object m2070b(oov oovVar, oni oniVar) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f2575a, new Class[]{m2069a()}, new avz(oovVar, oniVar));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }
}
