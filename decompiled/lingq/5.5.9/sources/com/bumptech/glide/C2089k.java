package com.bumptech.glide;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.C2164a;
import com.bumptech.glide.request.C2165b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import p007a6.C0032k;
import p007a6.C0033l;
import p007a6.C0038q;
import p060d1.C5019f;
import p171i6.AbstractC6196a;
import p171i6.C6200e;
import p171i6.C6202g;
import p171i6.InterfaceC6199d;
import p171i6.InterfaceC6201f;
import p192j6.C6413b;
import p192j6.C6416e;
import p192j6.InterfaceC6419h;
import p258m6.C7485e;
import p258m6.C7492l;

/* JADX INFO: renamed from: com.bumptech.glide.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2089k<TranscodeType> extends AbstractC6196a<C2089k<TranscodeType>> {

    /* JADX INFO: renamed from: V */
    public final Context f10573V;

    /* JADX INFO: renamed from: W */
    public final ComponentCallbacks2C2090l f10574W;

    /* JADX INFO: renamed from: X */
    public final Class<TranscodeType> f10575X;

    /* JADX INFO: renamed from: Y */
    public final C2085g f10576Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC2144m<?, ? super TranscodeType> f10577Z;

    /* JADX INFO: renamed from: a0 */
    public Object f10578a0;

    /* JADX INFO: renamed from: b0 */
    public ArrayList f10579b0;

    /* JADX INFO: renamed from: c0 */
    public C2089k<TranscodeType> f10580c0;

    /* JADX INFO: renamed from: d0 */
    public C2089k<TranscodeType> f10581d0;

    /* JADX INFO: renamed from: e0 */
    public final boolean f10582e0 = true;

    /* JADX INFO: renamed from: f0 */
    public boolean f10583f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f10584g0;

    /* JADX INFO: renamed from: com.bumptech.glide.k$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10585a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10586b;

        static {
            int[] iArr = new int[Priority.values().length];
            f10586b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10586b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10586b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10586b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f10585a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10585a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10585a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10585a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10585a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10585a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10585a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10585a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SuppressLint({"CheckResult"})
    public C2089k(ComponentCallbacks2C2080b componentCallbacks2C2080b, ComponentCallbacks2C2090l componentCallbacks2C2090l, Class<TranscodeType> cls, Context context) {
        C6202g c6202g;
        this.f10574W = componentCallbacks2C2090l;
        this.f10575X = cls;
        this.f10573V = context;
        Map<Class<?>, AbstractC2144m<?, ?>> map = componentCallbacks2C2090l.f10589a.f10552c.f10563f;
        AbstractC2144m value = map.get(cls);
        if (value == null) {
            Iterator<Map.Entry<Class<?>, AbstractC2144m<?, ?>>> it = map.entrySet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Map.Entry<Class<?>, AbstractC2144m<?, ?>> next = it.next();
                    value = next.getKey().isAssignableFrom(cls) ? next.getValue() : value;
                }
            }
        }
        this.f10577Z = value == null ? C2085g.f10557k : value;
        this.f10576Y = componentCallbacks2C2080b.f10552c;
        Iterator<InterfaceC6201f<Object>> it2 = componentCallbacks2C2090l.f10597i.iterator();
        while (it2.hasNext()) {
            m6251z((InterfaceC6201f) it2.next());
        }
        synchronized (componentCallbacks2C2090l) {
            c6202g = componentCallbacks2C2090l.f10598j;
        }
        m6242A(c6202g);
    }

    /* JADX INFO: renamed from: A */
    public final C2089k<TranscodeType> m6242A(AbstractC6196a<?> abstractC6196a) {
        C0062b.m345f0(abstractC6196a);
        return (C2089k) super.mo6249b(abstractC6196a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final InterfaceC6199d m6243B(int i10, int i11, Priority priority, AbstractC2144m abstractC2144m, AbstractC6196a abstractC6196a, RequestCoordinator requestCoordinator, C6200e c6200e, InterfaceC6419h interfaceC6419h, Object obj, Executor executor) {
        C2164a c2164a;
        RequestCoordinator c2164a2;
        InterfaceC6199d interfaceC6199dM6248H;
        int i12;
        Priority priority2;
        int i13;
        int i14;
        if (this.f10581d0 != null) {
            c2164a2 = new C2164a(obj, requestCoordinator);
            c2164a = c2164a2;
        } else {
            c2164a = 0;
            c2164a2 = requestCoordinator;
        }
        C2089k<TranscodeType> c2089k = this.f10580c0;
        if (c2089k == null) {
            interfaceC6199dM6248H = m6248H(i10, i11, priority, abstractC2144m, abstractC6196a, c2164a2, c6200e, interfaceC6419h, obj, executor);
        } else {
            if (this.f10584g0) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            AbstractC2144m abstractC2144m2 = c2089k.f10582e0 ? abstractC2144m : c2089k.f10577Z;
            if (AbstractC6196a.m12715h(c2089k.f36074a, 8)) {
                priority2 = this.f10580c0.f36077d;
            } else {
                int i15 = a.f10586b[priority.ordinal()];
                if (i15 == 1) {
                    priority2 = Priority.NORMAL;
                } else if (i15 == 2) {
                    priority2 = Priority.HIGH;
                } else {
                    if (i15 != 3 && i15 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f36077d);
                    }
                    priority2 = Priority.IMMEDIATE;
                }
            }
            Priority priority3 = priority2;
            C2089k<TranscodeType> c2089k2 = this.f10580c0;
            int i16 = c2089k2.f36084k;
            int i17 = c2089k2.f36083j;
            if (C7492l.m14888i(i10, i11)) {
                C2089k<TranscodeType> c2089k3 = this.f10580c0;
                if (C7492l.m14888i(c2089k3.f36084k, c2089k3.f36083j)) {
                    i13 = i17;
                    i14 = i16;
                } else {
                    i14 = abstractC6196a.f36084k;
                    i13 = abstractC6196a.f36083j;
                }
            } else {
                i13 = i17;
                i14 = i16;
            }
            C2165b c2165b = new C2165b(obj, c2164a2);
            SingleRequest singleRequestM6248H = m6248H(i10, i11, priority, abstractC2144m, abstractC6196a, c2165b, c6200e, interfaceC6419h, obj, executor);
            this.f10584g0 = true;
            C2089k<TranscodeType> c2089k4 = this.f10580c0;
            InterfaceC6199d interfaceC6199dM6243B = c2089k4.m6243B(i14, i13, priority3, abstractC2144m2, c2089k4, c2165b, c6200e, interfaceC6419h, obj, executor);
            this.f10584g0 = false;
            c2165b.f10936c = singleRequestM6248H;
            c2165b.f10937d = interfaceC6199dM6243B;
            interfaceC6199dM6248H = c2165b;
        }
        if (c2164a == 0) {
            return interfaceC6199dM6248H;
        }
        C2089k<TranscodeType> c2089k5 = this.f10581d0;
        int i18 = c2089k5.f36084k;
        int i19 = c2089k5.f36083j;
        if (C7492l.m14888i(i10, i11)) {
            C2089k<TranscodeType> c2089k6 = this.f10581d0;
            if (C7492l.m14888i(c2089k6.f36084k, c2089k6.f36083j)) {
                i12 = i19;
            } else {
                int i20 = abstractC6196a.f36084k;
                i12 = abstractC6196a.f36083j;
                i18 = i20;
            }
        } else {
            i12 = i19;
        }
        C2089k<TranscodeType> c2089k7 = this.f10581d0;
        InterfaceC6199d interfaceC6199dM6243B2 = c2089k7.m6243B(i18, i12, c2089k7.f36077d, c2089k7.f10577Z, c2089k7, c2164a, c6200e, interfaceC6419h, obj, executor);
        c2164a.f10930c = interfaceC6199dM6248H;
        c2164a.f10931d = interfaceC6199dM6243B2;
        return c2164a;
    }

    @Override // p171i6.AbstractC6196a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C2089k<TranscodeType> clone() {
        C2089k<TranscodeType> c2089k = (C2089k) super.clone();
        c2089k.f10577Z = c2089k.f10577Z.clone();
        if (c2089k.f10579b0 != null) {
            c2089k.f10579b0 = new ArrayList(c2089k.f10579b0);
        }
        C2089k<TranscodeType> c2089k2 = c2089k.f10580c0;
        if (c2089k2 != null) {
            c2089k.f10580c0 = c2089k2.clone();
        }
        C2089k<TranscodeType> c2089k3 = c2089k.f10581d0;
        if (c2089k3 != null) {
            c2089k.f10581d0 = c2089k3.clone();
        }
        return c2089k;
    }

    /* JADX INFO: renamed from: E */
    public final void m6245E(ImageView imageView) {
        AbstractC6196a abstractC6196aM12720i;
        InterfaceC6419h c6416e;
        C7492l.m14880a();
        C0062b.m345f0(imageView);
        if (!AbstractC6196a.m12715h(this.f36074a, 2048) && this.f36061I && imageView.getScaleType() != null) {
            switch (a.f10585a[imageView.getScaleType().ordinal()]) {
                case 1:
                    abstractC6196aM12720i = clone().m12720i(DownsampleStrategy.f10804c, new C0032k());
                    break;
                case 2:
                    abstractC6196aM12720i = clone().m12720i(DownsampleStrategy.f10803b, new C0033l());
                    abstractC6196aM12720i.f36072T = true;
                    break;
                case 3:
                case 4:
                case 5:
                    abstractC6196aM12720i = clone().m12720i(DownsampleStrategy.f10802a, new C0038q());
                    abstractC6196aM12720i.f36072T = true;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    abstractC6196aM12720i = clone().m12720i(DownsampleStrategy.f10803b, new C0033l());
                    abstractC6196aM12720i.f36072T = true;
                    break;
                default:
                    abstractC6196aM12720i = this;
                    break;
            }
        } else {
            abstractC6196aM12720i = this;
        }
        this.f10576Y.f10560c.getClass();
        Class<TranscodeType> cls = this.f10575X;
        if (Bitmap.class.equals(cls)) {
            c6416e = new C6413b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c6416e = new C6416e(imageView);
        }
        m6246F(c6416e, null, abstractC6196aM12720i, C7485e.f41368a);
    }

    /* JADX INFO: renamed from: F */
    public final void m6246F(InterfaceC6419h interfaceC6419h, C6200e c6200e, AbstractC6196a abstractC6196a, Executor executor) {
        C0062b.m345f0(interfaceC6419h);
        if (!this.f10583f0) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        InterfaceC6199d interfaceC6199dM6243B = m6243B(abstractC6196a.f36084k, abstractC6196a.f36083j, abstractC6196a.f36077d, this.f10577Z, abstractC6196a, null, c6200e, interfaceC6419h, obj, executor);
        InterfaceC6199d interfaceC6199dMo12740p = interfaceC6419h.mo12740p();
        if (interfaceC6199dM6243B.mo6391e(interfaceC6199dMo12740p)) {
            if (!(!abstractC6196a.f36082i && interfaceC6199dMo12740p.mo6397k())) {
                C0062b.m345f0(interfaceC6199dMo12740p);
                if (interfaceC6199dMo12740p.isRunning()) {
                    return;
                }
                interfaceC6199dMo12740p.mo6396j();
                return;
            }
        }
        this.f10574W.m6256f(interfaceC6419h);
        interfaceC6419h.mo12735g(interfaceC6199dM6243B);
        ComponentCallbacks2C2090l componentCallbacks2C2090l = this.f10574W;
        synchronized (componentCallbacks2C2090l) {
            componentCallbacks2C2090l.f10594f.f10897a.add(interfaceC6419h);
            C5019f c5019f = componentCallbacks2C2090l.f10592d;
            ((Set) c5019f.f32814c).add(interfaceC6199dM6243B);
            if (c5019f.f32813b) {
                interfaceC6199dM6243B.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((Set) c5019f.f32815d).add(interfaceC6199dM6243B);
            } else {
                interfaceC6199dM6243B.mo6396j();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final C2089k<TranscodeType> m6247G(Object obj) {
        if (this.f36069Q) {
            return clone().m6247G(obj);
        }
        this.f10578a0 = obj;
        this.f10583f0 = true;
        m12726p();
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final SingleRequest m6248H(int i10, int i11, Priority priority, AbstractC2144m abstractC2144m, AbstractC6196a abstractC6196a, RequestCoordinator requestCoordinator, C6200e c6200e, InterfaceC6419h interfaceC6419h, Object obj, Executor executor) {
        Context context = this.f10573V;
        Object obj2 = this.f10578a0;
        Class<TranscodeType> cls = this.f10575X;
        ArrayList arrayList = this.f10579b0;
        C2085g c2085g = this.f10576Y;
        return new SingleRequest(context, c2085g, obj, obj2, cls, abstractC6196a, i10, i11, priority, interfaceC6419h, c6200e, arrayList, requestCoordinator, c2085g.f10564g, abstractC2144m.f10851a, executor);
    }

    @Override // p171i6.AbstractC6196a
    /* JADX INFO: renamed from: b */
    public final AbstractC6196a mo6249b(AbstractC6196a abstractC6196a) {
        C0062b.m345f0(abstractC6196a);
        return (C2089k) super.mo6249b(abstractC6196a);
    }

    @Override // p171i6.AbstractC6196a
    public final boolean equals(Object obj) {
        if (obj instanceof C2089k) {
            C2089k c2089k = (C2089k) obj;
            if (super.equals(c2089k)) {
                if (Objects.equals(this.f10575X, c2089k.f10575X) && this.f10577Z.equals(c2089k.f10577Z) && Objects.equals(this.f10578a0, c2089k.f10578a0) && Objects.equals(this.f10579b0, c2089k.f10579b0) && Objects.equals(this.f10580c0, c2089k.f10580c0) && Objects.equals(this.f10581d0, c2089k.f10581d0) && this.f10582e0 == c2089k.f10582e0 && this.f10583f0 == c2089k.f10583f0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p171i6.AbstractC6196a
    public final int hashCode() {
        return C7492l.m14886g(C7492l.m14886g(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(C7492l.m14885f(super.hashCode(), this.f10575X), this.f10577Z), this.f10578a0), this.f10579b0), this.f10580c0), this.f10581d0), null), this.f10582e0), this.f10583f0);
    }

    /* JADX INFO: renamed from: z */
    public final C2089k<TranscodeType> m6251z(InterfaceC6201f<TranscodeType> interfaceC6201f) {
        if (this.f36069Q) {
            return clone().m6251z(interfaceC6201f);
        }
        if (interfaceC6201f != null) {
            if (this.f10579b0 == null) {
                this.f10579b0 = new ArrayList();
            }
            this.f10579b0.add(interfaceC6201f);
        }
        m12726p();
        return this;
    }
}
