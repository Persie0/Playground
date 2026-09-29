package kotlin.reflect.jvm.internal.pcollections;

import android.support.v4.media.session.C0166e;
import java.util.NoSuchElementException;
import p227ko.C6737a;
import p227ko.C6738b;
import p227ko.C6739c;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.pcollections.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7071a<K, V> {

    /* JADX INFO: renamed from: c */
    public static final C7071a<Object, Object> f39956c = new C7071a<>(C6739c.f38009b, 0);

    /* JADX INFO: renamed from: a */
    public final C6739c<C6737a<MapEntry<K, V>>> f39957a;

    /* JADX INFO: renamed from: b */
    public final int f39958b;

    public C7071a(C6739c<C6737a<MapEntry<K, V>>> c6739c, int i10) {
        this.f39957a = c6739c;
        this.f39958b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Object m14246a(String str) {
        C6737a<Object> c6737aM13359a = this.f39957a.f38010a.m13359a(str.hashCode());
        if (c6737aM13359a == null) {
            c6737aM13359a = C6737a.f37998d;
        }
        while (c6737aM13359a != null && c6737aM13359a.f38001c > 0) {
            MapEntry mapEntry = (MapEntry) c6737aM13359a.f37999a;
            if (mapEntry.f39954a.equals(str)) {
                return mapEntry.f39955b;
            }
            c6737aM13359a = c6737aM13359a.f38000b;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C7071a m14247b(String str, Object obj) {
        int iHashCode = str.hashCode();
        C6739c<C6737a<MapEntry<K, V>>> c6739c = this.f39957a;
        C6737a<Object> c6737aM13359a = c6739c.f38010a.m13359a(iHashCode);
        if (c6737aM13359a == null) {
            c6737aM13359a = C6737a.f37998d;
        }
        int i10 = c6737aM13359a.f38001c;
        int i11 = 0;
        C6737a<Object> c6737a = c6737aM13359a;
        while (true) {
            if (c6737a == null || c6737a.f38001c <= 0) {
                i11 = -1;
                break;
            }
            if (((MapEntry) c6737a.f37999a).f39954a.equals(str)) {
                break;
            }
            i11++;
            c6737a = c6737a.f38000b;
        }
        if (i11 != -1) {
            if (i11 < 0 || i11 > c6737aM13359a.f38001c) {
                throw new IndexOutOfBoundsException();
            }
            try {
                c6737aM13359a = c6737aM13359a.m13357a(c6737aM13359a.m13358f(i11).f37999a);
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException(C0166e.m761g("Index: ", i11));
            }
        }
        MapEntry mapEntry = new MapEntry(str, obj);
        c6737aM13359a.getClass();
        C6737a c6737a2 = new C6737a(mapEntry, c6737aM13359a);
        long jHashCode = str.hashCode();
        C6738b<C6737a<MapEntry<K, V>>> c6738b = c6739c.f38010a;
        C6738b<C6737a<MapEntry<K, V>>> c6738bM13360b = c6738b.m13360b(jHashCode, c6737a2);
        if (c6738bM13360b != c6738b) {
            c6739c = new C6739c<>(c6738bM13360b);
        }
        return new C7071a(c6739c, (this.f39958b - i10) + c6737a2.f38001c);
    }
}
