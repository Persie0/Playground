package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.util.List;
import p356r5.InterfaceC8732b;
import p392t5.C9197c;
import p474x5.InterfaceC10090o;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2116b implements InterfaceC2117c, InterfaceC2097d.a<Object> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC8732b> f10688a;

    /* JADX INFO: renamed from: b */
    public final C2118d<?> f10689b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2117c.a f10690c;

    /* JADX INFO: renamed from: d */
    public int f10691d = -1;

    /* JADX INFO: renamed from: e */
    public InterfaceC8732b f10692e;

    /* JADX INFO: renamed from: f */
    public List<InterfaceC10090o<File, ?>> f10693f;

    /* JADX INFO: renamed from: g */
    public int f10694g;

    /* JADX INFO: renamed from: h */
    public volatile InterfaceC10090o.a<?> f10695h;

    /* JADX INFO: renamed from: i */
    public File f10696i;

    public C2116b(List<InterfaceC8732b> list, C2118d<?> c2118d, InterfaceC2117c.a aVar) {
        this.f10688a = list;
        this.f10689b = c2118d;
        this.f10690c = aVar;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c
    /* JADX INFO: renamed from: a */
    public final boolean mo6307a() {
        while (true) {
            List<InterfaceC10090o<File, ?>> list = this.f10693f;
            if (list != null) {
                if (this.f10694g < list.size()) {
                    this.f10695h = null;
                    boolean z10 = false;
                    loop1: while (true) {
                        while (!z10) {
                            if (!(this.f10694g < this.f10693f.size())) {
                                break loop1;
                            }
                            List<InterfaceC10090o<File, ?>> list2 = this.f10693f;
                            int i10 = this.f10694g;
                            this.f10694g = i10 + 1;
                            InterfaceC10090o<File, ?> interfaceC10090o = list2.get(i10);
                            File file = this.f10696i;
                            C2118d<?> c2118d = this.f10689b;
                            this.f10695h = interfaceC10090o.mo18920b(file, c2118d.f10701e, c2118d.f10702f, c2118d.f10705i);
                            if (this.f10695h != null) {
                                if (this.f10689b.m6310c(this.f10695h.f51181c.mo6269a()) != null) {
                                    this.f10695h.f51181c.mo6275e(this.f10689b.f10711o, this);
                                    z10 = true;
                                }
                            }
                        }
                        break loop1;
                    }
                    return z10;
                }
            }
            int i11 = this.f10691d + 1;
            this.f10691d = i11;
            if (i11 >= this.f10688a.size()) {
                return false;
            }
            InterfaceC8732b interfaceC8732b = this.f10688a.get(this.f10691d);
            C2118d<?> c2118d2 = this.f10689b;
            File fileMo16806f = ((C2119e.c) c2118d2.f10704h).m6321a().mo16806f(new C9197c(interfaceC8732b, c2118d2.f10710n));
            this.f10696i = fileMo16806f;
            if (fileMo16806f != null) {
                this.f10692e = interfaceC8732b;
                this.f10693f = this.f10689b.f10699c.m6240a().m6231e(fileMo16806f);
                this.f10694g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
    /* JADX INFO: renamed from: c */
    public final void mo6277c(Exception exc) {
        this.f10690c.mo6282f(this.f10692e, exc, this.f10695h.f51181c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2117c
    public final void cancel() {
        InterfaceC10090o.a<?> aVar = this.f10695h;
        if (aVar != null) {
            aVar.f51181c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d.a
    /* JADX INFO: renamed from: f */
    public final void mo6278f(Object obj) {
        this.f10690c.mo6284i(this.f10692e, obj, this.f10695h.f51181c, DataSource.DATA_DISK_CACHE, this.f10692e);
    }
}
