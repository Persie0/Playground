package p118fe;

import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import java.util.Set;

/* JADX INFO: renamed from: fe.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5512d {
    /* JADX INFO: renamed from: a */
    default <T> T mo11748a(Class<T> cls) {
        return (T) mo11749b(C5527s.m11765a(cls));
    }

    /* JADX INFO: renamed from: b */
    default <T> T mo11749b(C5527s<T> c5527s) {
        InterfaceC2005b<T> interfaceC2005bMo11752e = mo11752e(c5527s);
        if (interfaceC2005bMo11752e == null) {
            return null;
        }
        return interfaceC2005bMo11752e.get();
    }

    /* JADX INFO: renamed from: c */
    default <T> InterfaceC2005b<T> mo11750c(Class<T> cls) {
        return mo11752e(C5527s.m11765a(cls));
    }

    /* JADX INFO: renamed from: d */
    <T> InterfaceC2004a<T> mo11751d(C5527s<T> c5527s);

    /* JADX INFO: renamed from: e */
    <T> InterfaceC2005b<T> mo11752e(C5527s<T> c5527s);

    /* JADX INFO: renamed from: f */
    <T> InterfaceC2005b<Set<T>> mo11753f(C5527s<T> c5527s);

    /* JADX INFO: renamed from: g */
    default <T> Set<T> mo11754g(C5527s<T> c5527s) {
        return mo11753f(c5527s).get();
    }
}
