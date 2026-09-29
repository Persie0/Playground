package com.bumptech.glide;

import ae.C0062b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C2099f;
import com.bumptech.glide.load.data.InterfaceC2098e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p081e0.C5298b1;
import p081e0.C5320k0;
import p110f6.C5472c;
import p110f6.InterfaceC5471b;
import p147h6.C5894a;
import p147h6.C5895b;
import p147h6.C5896c;
import p147h6.C5897d;
import p272n6.C7709a;
import p272n6.C7710b;
import p272n6.C7711c;
import p356r5.InterfaceC8736f;
import p356r5.InterfaceC8737g;
import p446w2.C9807e;
import p474x5.C10092q;
import p474x5.C10094s;
import p474x5.InterfaceC10090o;
import p474x5.InterfaceC10091p;

/* JADX INFO: loaded from: classes.dex */
public final class Registry {

    /* JADX INFO: renamed from: a */
    public final C10092q f10538a;

    /* JADX INFO: renamed from: b */
    public final C5894a f10539b;

    /* JADX INFO: renamed from: c */
    public final C5896c f10540c;

    /* JADX INFO: renamed from: d */
    public final C5897d f10541d;

    /* JADX INFO: renamed from: e */
    public final C2099f f10542e;

    /* JADX INFO: renamed from: f */
    public final C5472c f10543f;

    /* JADX INFO: renamed from: g */
    public final C5320k0 f10544g;

    /* JADX INFO: renamed from: h */
    public final C5298b1 f10545h = new C5298b1(5);

    /* JADX INFO: renamed from: i */
    public final C5895b f10546i = new C5895b();

    /* JADX INFO: renamed from: j */
    public final C7709a.c f10547j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<InterfaceC10090o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public Registry() {
        C7709a.c cVar = new C7709a.c(new C9807e(20), new C7710b(), new C7711c());
        this.f10547j = cVar;
        this.f10538a = new C10092q(cVar);
        this.f10539b = new C5894a();
        this.f10540c = new C5896c();
        this.f10541d = new C5897d();
        this.f10542e = new C2099f();
        this.f10543f = new C5472c();
        this.f10544g = new C5320k0();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C5896c c5896c = this.f10540c;
        synchronized (c5896c) {
            ArrayList arrayList2 = new ArrayList(c5896c.f35228a);
            c5896c.f35228a.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c5896c.f35228a.add((String) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                while (true) {
                    if (it3.hasNext()) {
                        String str = (String) it3.next();
                        if (!arrayList.contains(str)) {
                            c5896c.f35228a.add(str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m6227a(Class cls, Class cls2, InterfaceC10091p interfaceC10091p) {
        C10092q c10092q = this.f10538a;
        synchronized (c10092q) {
            C10094s c10094s = c10092q.f51182a;
            synchronized (c10094s) {
                try {
                    C10094s.b bVar = new C10094s.b(cls, cls2, interfaceC10091p);
                    ArrayList arrayList = c10094s.f51197a;
                    arrayList.add(arrayList.size(), bVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c10092q.f51183b.f51184a.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6228b(Class cls, InterfaceC8737g interfaceC8737g) {
        C5897d c5897d = this.f10541d;
        synchronized (c5897d) {
            c5897d.f35233a.add(new C5897d.a(cls, interfaceC8737g));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m6229c(InterfaceC8736f interfaceC8736f, Class cls, Class cls2, String str) {
        C5896c c5896c = this.f10540c;
        synchronized (c5896c) {
            c5896c.m12317a(str).add(new C5896c.a<>(cls, cls2, interfaceC8736f));
        }
    }

    /* JADX INFO: renamed from: d */
    public final List<ImageHeaderParser> m6230d() {
        List<ImageHeaderParser> list;
        C5320k0 c5320k0 = this.f10544g;
        synchronized (c5320k0) {
            try {
                list = c5320k0.f33593a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return list;
    }

    /* JADX INFO: renamed from: e */
    public final <Model> List<InterfaceC10090o<Model, ?>> m6231e(Model model) {
        List<InterfaceC10090o<Model, ?>> listUnmodifiableList;
        C10092q c10092q = this.f10538a;
        c10092q.getClass();
        Class<?> cls = model.getClass();
        synchronized (c10092q) {
            C10092q.a.C10683a c10683a = (C10092q.a.C10683a) c10092q.f51183b.f51184a.get(cls);
            listUnmodifiableList = c10683a == null ? null : c10683a.f51185a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c10092q.f51182a.m18940a(cls));
                if (((C10092q.a.C10683a) c10092q.f51183b.f51184a.put(cls, new C10092q.a.C10683a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        int size = listUnmodifiableList.size();
        List<InterfaceC10090o<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC10090o<Model, ?> interfaceC10090o = listUnmodifiableList.get(i10);
            if (interfaceC10090o.mo18919a(model)) {
                if (z10) {
                    listEmptyList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                listEmptyList.add(interfaceC10090o);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model, listUnmodifiableList);
        }
        return listEmptyList;
    }

    /* JADX INFO: renamed from: f */
    public final <X> InterfaceC2098e<X> m6232f(X x10) {
        InterfaceC2098e<X> interfaceC2098eMo4886b;
        C2099f c2099f = this.f10542e;
        synchronized (c2099f) {
            C0062b.m345f0(x10);
            InterfaceC2098e.a aVar = (InterfaceC2098e.a) c2099f.f10613a.get(x10.getClass());
            if (aVar == null) {
                for (InterfaceC2098e.a aVar2 : c2099f.f10613a.values()) {
                    if (aVar2.mo4885a().isAssignableFrom(x10.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = C2099f.f10612b;
            }
            interfaceC2098eMo4886b = aVar.mo4886b(x10);
        }
        return interfaceC2098eMo4886b;
    }

    /* JADX INFO: renamed from: g */
    public final void m6233g(InterfaceC2098e.a aVar) {
        C2099f c2099f = this.f10542e;
        synchronized (c2099f) {
            c2099f.f10613a.put(aVar.mo4885a(), aVar);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m6234h(Class cls, Class cls2, InterfaceC5471b interfaceC5471b) {
        C5472c c5472c = this.f10543f;
        synchronized (c5472c) {
            c5472c.f34059a.add(new C5472c.a(cls, cls2, interfaceC5471b));
        }
    }
}
