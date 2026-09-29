package p422uo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.io.EOFException;
import java.io.IOException;
import p124fp.AbstractC5611h;
import p124fp.C5608e;
import p124fp.InterfaceC5625v;
import sl.C9072e;

/* JADX INFO: renamed from: uo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9602f extends AbstractC5611h {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<IOException, C9072e> f49274b;

    /* JADX INFO: renamed from: c */
    public boolean f49275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9602f(InterfaceC5625v interfaceC5625v, InterfaceC2052l<? super IOException, C9072e> interfaceC2052l) {
        super(interfaceC5625v);
        C5207g.m11111f(interfaceC5625v, "delegate");
        this.f49274b = interfaceC2052l;
    }

    @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f49275c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f49275c = true;
            this.f49274b.mo528n(e10);
        }
    }

    @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v, java.io.Flushable
    public final void flush() {
        if (this.f49275c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f49275c = true;
            this.f49274b.mo528n(e10);
        }
    }

    @Override // p124fp.AbstractC5611h, p124fp.InterfaceC5625v
    /* JADX INFO: renamed from: k1 */
    public final void mo11922k1(C5608e c5608e, long j10) throws EOFException {
        C5207g.m11111f(c5608e, "source");
        if (this.f49275c) {
            c5608e.skip(j10);
            return;
        }
        try {
            super.mo11922k1(c5608e, j10);
        } catch (IOException e10) {
            this.f49275c = true;
            this.f49274b.mo528n(e10);
        }
    }
}
