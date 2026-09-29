package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8738h;
import p392t5.C9208n;
import p474x5.InterfaceC10090o;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2122h implements InterfaceC2117c, InterfaceC2097d.a<Object> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2117c.a f10780a;

    /* JADX INFO: renamed from: b */
    public final C2118d<?> f10781b;

    /* JADX INFO: renamed from: c */
    public int f10782c;

    /* JADX INFO: renamed from: d */
    public int f10783d = -1;

    /* JADX INFO: renamed from: e */
    public InterfaceC8732b f10784e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC10090o<File, ?>> f10785f;

    /* JADX INFO: renamed from: g */
    public int f10786g;

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC10090o.a<?> f10787h;

    /* JADX INFO: renamed from: i */
    public File f10788i;

    /* JADX INFO: renamed from: j */
    public C9208n f10789j;

    public C2122h(C2118d<?> c2118d, InterfaceC2117c.a aVar) {
        this.f10781b = c2118d;
        this.f10780a = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c
    /* JADX INFO: renamed from: a */
    public final boolean mo6307a() {
        ArrayList arrayListM6308a = this.f10781b.m6308a();
        if (arrayListM6308a.isEmpty()) {
            return false;
        }
        List<Class<?>> listM6311d = this.f10781b.m6311d();
        if (listM6311d.isEmpty()) {
            if (File.class.equals(this.f10781b.f10707k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f10781b.f10700d.getClass() + " to " + this.f10781b.f10707k);
        }
        while (true) {
            List<InterfaceC10090o<File, ?>> list = this.f10785f;
            if (list != null) {
                if (this.f10786g < list.size()) {
                    this.f10787h = null;
                    boolean z10 = false;
                    while (!z10) {
                        if (!(this.f10786g < this.f10785f.size())) {
                            break;
                        }
                        List<InterfaceC10090o<File, ?>> list2 = this.f10785f;
                        int i10 = this.f10786g;
                        this.f10786g = i10 + 1;
                        InterfaceC10090o<File, ?> interfaceC10090o = list2.get(i10);
                        File file = this.f10788i;
                        C2118d<?> c2118d = this.f10781b;
                        this.f10787h = interfaceC10090o.mo18920b(file, c2118d.f10701e, c2118d.f10702f, c2118d.f10705i);
                        if (this.f10787h != null) {
                            if (this.f10781b.m6310c(this.f10787h.f51181c.mo6269a()) != null) {
                                this.f10787h.f51181c.mo6275e(this.f10781b.f10711o, this);
                                z10 = true;
                            }
                        }
                    }
                    return z10;
                }
            }
            int i11 = this.f10783d + 1;
            this.f10783d = i11;
            if (i11 >= listM6311d.size()) {
                int i12 = this.f10782c + 1;
                this.f10782c = i12;
                if (i12 >= arrayListM6308a.size()) {
                    return false;
                }
                this.f10783d = 0;
            }
            InterfaceC8732b interfaceC8732b = (InterfaceC8732b) arrayListM6308a.get(this.f10782c);
            Class<?> cls = listM6311d.get(this.f10783d);
            InterfaceC8738h<Z> interfaceC8738hM6313f = this.f10781b.m6313f(cls);
            C2118d<?> c2118d2 = this.f10781b;
            this.f10789j = new C9208n(c2118d2.f10699c.f10558a, interfaceC8732b, c2118d2.f10710n, c2118d2.f10701e, c2118d2.f10702f, interfaceC8738hM6313f, cls, c2118d2.f10705i);
            File fileMo16806f = ((C2119e.c) c2118d2.f10704h).m6321a().mo16806f(this.f10789j);
            this.f10788i = fileMo16806f;
            if (fileMo16806f != null) {
                this.f10784e = interfaceC8732b;
                this.f10785f = this.f10781b.f10699c.m6240a().m6231e(fileMo16806f);
                this.f10786g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
    /* JADX INFO: renamed from: c */
    public final void mo6277c(Exception exc) {
        this.f10780a.mo6282f(this.f10789j, exc, this.f10787h.f51181c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c
    public final void cancel() {
        InterfaceC10090o.a<?> aVar = this.f10787h;
        if (aVar != null) {
            aVar.f51181c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
    /* JADX INFO: renamed from: f */
    public final void mo6278f(Object obj) {
        this.f10780a.mo6284i(this.f10784e, obj, this.f10787h.f51181c, DataSource.RESOURCE_DISK_CACHE, this.f10789j);
    }
}
