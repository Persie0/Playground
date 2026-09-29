package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.load.engine.C2119e;
import dm.C5206f;
import java.util.List;
import java.util.Map;
import p171i6.C6202g;
import p171i6.InterfaceC6201f;
import p258m6.C7486f;
import p326q.C8446b;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: com.bumptech.glide.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2085g extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    public static final C2079a f10557k = new C2079a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC9451b f10558a;

    /* JADX INFO: renamed from: b */
    public final C7486f f10559b;

    /* JADX INFO: renamed from: c */
    public final C5206f f10560c;

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C2080b.a f10561d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC6201f<Object>> f10562e;

    /* JADX INFO: renamed from: f */
    public final Map<Class<?>, AbstractC2144m<?, ?>> f10563f;

    /* JADX INFO: renamed from: g */
    public final C2119e f10564g;

    /* JADX INFO: renamed from: h */
    public final C2086h f10565h;

    /* JADX INFO: renamed from: i */
    public final int f10566i;

    /* JADX INFO: renamed from: j */
    public C6202g f10567j;

    public C2085g(Context context, InterfaceC9451b interfaceC9451b, C2087i c2087i, C5206f c5206f, C2081c c2081c, C8446b c8446b, List list, C2119e c2119e, C2086h c2086h, int i10) {
        super(context.getApplicationContext());
        this.f10558a = interfaceC9451b;
        this.f10560c = c5206f;
        this.f10561d = c2081c;
        this.f10562e = list;
        this.f10563f = c8446b;
        this.f10564g = c2119e;
        this.f10565h = c2086h;
        this.f10566i = i10;
        this.f10559b = new C7486f(c2087i);
    }

    /* JADX INFO: renamed from: a */
    public final Registry m6240a() {
        return (Registry) this.f10559b.get();
    }
}
