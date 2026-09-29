package p000;

import kotlin.collections.builders.MapBuilder;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class kk7 {

    /* JADX INFO: renamed from: a */
    public static final MapBuilder f47455a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(y38.m24933a(String.class), sk9.f60959a);
        mapBuilder.put(y38.m24933a(Character.TYPE), xu0.f68782a);
        mapBuilder.put(y38.m24933a(char[].class), pu0.f56793c);
        mapBuilder.put(y38.m24933a(Double.TYPE), dj2.f35711a);
        mapBuilder.put(y38.m24933a(double[].class), wi2.f66848c);
        mapBuilder.put(y38.m24933a(Float.TYPE), l73.f49244a);
        mapBuilder.put(y38.m24933a(float[].class), g73.f40313c);
        mapBuilder.put(y38.m24933a(Long.TYPE), rk5.f59434a);
        mapBuilder.put(y38.m24933a(long[].class), ik5.f44222c);
        mapBuilder.put(y38.m24933a(oea.class), sea.f60769a);
        mapBuilder.put(y38.m24933a(Integer.TYPE), l84.f49294a);
        mapBuilder.put(y38.m24933a(int[].class), w74.f66477c);
        mapBuilder.put(y38.m24933a(jea.class), nea.f52657a);
        mapBuilder.put(y38.m24933a(Short.TYPE), i69.f43606a);
        mapBuilder.put(y38.m24933a(short[].class), h69.f41847c);
        mapBuilder.put(y38.m24933a(vea.class), zea.f71476a);
        mapBuilder.put(y38.m24933a(Byte.TYPE), rk0.f59420a);
        mapBuilder.put(y38.m24933a(byte[].class), qk0.f57864c);
        mapBuilder.put(y38.m24933a(eea.class), iea.f44031a);
        mapBuilder.put(y38.m24933a(Boolean.TYPE), lf0.f49579a);
        mapBuilder.put(y38.m24933a(boolean[].class), kf0.f47119c);
        mapBuilder.put(y38.m24933a(xfa.class), yfa.f69798b);
        mapBuilder.put(y38.m24933a(Void.class), im6.f44290a);
        try {
            z21 z21VarM24933a = y38.m24933a(cn2.class);
            iy5 iy5Var = cn2.f10315b;
            mapBuilder.put(z21VarM24933a, hn2.f42649a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(y38.m24933a(pea.class), rea.f59166c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(y38.m24933a(kea.class), mea.f51222c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(y38.m24933a(wea.class), yea.f69753c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(y38.m24933a(fea.class), hea.f42280c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapBuilder.put(y38.m24933a(Uuid.class), nna.f53005a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            z21 z21VarM24933a2 = y38.m24933a(Instant.class);
            Instant instant = Instant.f47731c;
            mapBuilder.put(z21VarM24933a2, i74.f43619a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        f47455a = mapBuilder.m15392b();
    }
}
