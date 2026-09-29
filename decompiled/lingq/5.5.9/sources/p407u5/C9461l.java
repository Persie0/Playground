package p407u5;

import android.graphics.Bitmap;
import android.support.v4.media.session.C0166e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p233l3.AbstractC7248c;
import p258m6.C7492l;

/* JADX INFO: renamed from: u5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9461l implements InterfaceC9459j {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f48472d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f48473e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f48474f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f48475g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f48476h;

    /* JADX INFO: renamed from: a */
    public final c f48477a = new c();

    /* JADX INFO: renamed from: b */
    public final C9455f<b, Bitmap> f48478b = new C9455f<>();

    /* JADX INFO: renamed from: c */
    public final HashMap f48479c = new HashMap();

    /* JADX INFO: renamed from: u5.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48480a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f48480a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48480a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48480a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48480a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: u5.l$b */
    public static final class b implements InterfaceC9460k {

        /* JADX INFO: renamed from: a */
        public final c f48481a;

        /* JADX INFO: renamed from: b */
        public int f48482b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f48483c;

        public b(c cVar) {
            this.f48481a = cVar;
        }

        @Override // p407u5.InterfaceC9460k
        /* JADX INFO: renamed from: a */
        public final void mo17866a() {
            this.f48481a.m14596e(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f48482b == bVar.f48482b && C7492l.m14881b(this.f48483c, bVar.f48483c);
        }

        public final int hashCode() {
            int i10 = this.f48482b * 31;
            Bitmap.Config config = this.f48483c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return C9461l.m17870c(this.f48482b, this.f48483c);
        }
    }

    /* JADX INFO: renamed from: u5.l$c */
    public static class c extends AbstractC7248c {
        public c() {
            super(1);
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: b */
        public final InterfaceC9460k mo14594b() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f48472d = configArr;
        f48473e = configArr;
        f48474f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f48475g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f48476h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m17870c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m17871a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapM17873d = m17873d(bitmap.getConfig());
        Integer num2 = navigableMapM17873d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM17873d.remove(num);
                return;
            } else {
                navigableMapM17873d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m17874e(bitmap) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m17872b(int i10, int i11, Bitmap.Config config) {
        int i12;
        Bitmap.Config[] configArr;
        char[] cArr = C7492l.f41383a;
        int i13 = i10 * i11;
        int i14 = C7492l.a.f41386a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
        if (i14 == 1) {
            i12 = 1;
        } else if (i14 == 2 || i14 == 3) {
            i12 = 2;
        } else {
            i12 = i14 != 4 ? 4 : 8;
        }
        int i15 = i12 * i13;
        c cVar = this.f48477a;
        b bVar = (b) cVar.m14595c();
        bVar.f48482b = i15;
        bVar.f48483c = config;
        int i16 = 0;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f48473e;
        } else {
            int i17 = a.f48480a[config.ordinal()];
            if (i17 == 1) {
                configArr = f48472d;
            } else if (i17 == 2) {
                configArr = f48474f;
            } else if (i17 != 3) {
                configArr = i17 != 4 ? new Bitmap.Config[]{config} : f48476h;
            } else {
                configArr = f48475g;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i16 < length) {
                Bitmap.Config config2 = configArr[i16];
                Integer numCeilingKey = m17873d(config2).ceilingKey(Integer.valueOf(i15));
                if (numCeilingKey != null && numCeilingKey.intValue() <= i15 * 8) {
                    if (numCeilingKey.intValue() == i15) {
                        if (config2 == null) {
                            if (config != null) {
                            }
                        } else if (!config2.equals(config)) {
                        }
                    }
                    cVar.m14596e(bVar);
                    int iIntValue = numCeilingKey.intValue();
                    bVar = (b) cVar.m14595c();
                    bVar.f48482b = iIntValue;
                    bVar.f48483c = config2;
                    break;
                }
                i16++;
            }
            break;
        }
        Bitmap bitmapM17858a = this.f48478b.m17858a(bVar);
        if (bitmapM17858a != null) {
            m17871a(Integer.valueOf(bVar.f48482b), bitmapM17858a);
            bitmapM17858a.reconfigure(i10, i11, config);
        }
        return bitmapM17858a;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap<Integer, Integer> m17873d(Bitmap.Config config) {
        HashMap map = this.f48479c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public final String m17874e(Bitmap bitmap) {
        return m17870c(C7492l.m14882c(bitmap), bitmap.getConfig());
    }

    /* JADX INFO: renamed from: f */
    public final void m17875f(Bitmap bitmap) {
        int iM14882c = C7492l.m14882c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.f48477a.m14595c();
        bVar.f48482b = iM14882c;
        bVar.f48483c = config;
        this.f48478b.m17859b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapM17873d = m17873d(bitmap.getConfig());
        Integer num = navigableMapM17873d.get(Integer.valueOf(bVar.f48482b));
        Integer numValueOf = Integer.valueOf(bVar.f48482b);
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        navigableMapM17873d.put(numValueOf, Integer.valueOf(iIntValue));
    }

    public final String toString() {
        StringBuilder sbM771r = C0166e.m771r("SizeConfigStrategy{groupedMap=");
        sbM771r.append(this.f48478b);
        sbM771r.append(", sortedSizes=(");
        HashMap map = this.f48479c;
        for (Map.Entry entry : map.entrySet()) {
            sbM771r.append(entry.getKey());
            sbM771r.append('[');
            sbM771r.append(entry.getValue());
            sbM771r.append("], ");
        }
        if (!map.isEmpty()) {
            sbM771r.replace(sbM771r.length() - 2, sbM771r.length(), "");
        }
        sbM771r.append(")}");
        return sbM771r.toString();
    }
}
