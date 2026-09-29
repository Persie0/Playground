package p087e6;

import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import p042c6.AbstractC1731c;

/* JADX INFO: renamed from: e6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5375d extends AbstractC1731c<C5374c> {
    public C5375d(C5374c c5374c) {
        super(c5374c);
    }

    @Override // p042c6.AbstractC1731c, p392t5.InterfaceC9204j
    /* JADX INFO: renamed from: a */
    public final void mo156a() {
        ((C5374c) this.f9577a).f33757a.f33767a.f33780l.prepareToDraw();
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final void mo157b() {
        C5374c c5374c = (C5374c) this.f9577a;
        c5374c.stop();
        c5374c.f33760d = true;
        C5377f c5377f = c5374c.f33757a.f33767a;
        c5377f.f33771c.clear();
        Bitmap bitmap = c5377f.f33780l;
        if (bitmap != null) {
            c5377f.f33773e.mo164d(bitmap);
            c5377f.f33780l = null;
        }
        c5377f.f33774f = false;
        C5377f.a aVar = c5377f.f33777i;
        ComponentCallbacks2C2090l componentCallbacks2C2090l = c5377f.f33772d;
        if (aVar != null) {
            componentCallbacks2C2090l.m6256f(aVar);
            c5377f.f33777i = null;
        }
        C5377f.a aVar2 = c5377f.f33779k;
        if (aVar2 != null) {
            componentCallbacks2C2090l.m6256f(aVar2);
            c5377f.f33779k = null;
        }
        C5377f.a aVar3 = c5377f.f33782n;
        if (aVar3 != null) {
            componentCallbacks2C2090l.m6256f(aVar3);
            c5377f.f33782n = null;
        }
        c5377f.f33769a.clear();
        c5377f.f33778j = true;
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final int mo158c() {
        C5377f c5377f = ((C5374c) this.f9577a).f33757a.f33767a;
        return c5377f.f33769a.mo16587g() + c5377f.f33783o;
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class<C5374c> mo159d() {
        return C5374c.class;
    }
}
