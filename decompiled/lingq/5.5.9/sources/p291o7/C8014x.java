package p291o7;

import android.os.Handler;
import com.facebook.GraphRequest;
import dm.C5207g;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p067d8.C5056a0;
import p286o2.RunnableC7907g;

/* JADX INFO: renamed from: o7.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8014x extends FilterOutputStream implements InterfaceC8015y {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f43601h = 0;

    /* JADX INFO: renamed from: a */
    public final C8009s f43602a;

    /* JADX INFO: renamed from: b */
    public final Map<GraphRequest, C7989a0> f43603b;

    /* JADX INFO: renamed from: c */
    public final long f43604c;

    /* JADX INFO: renamed from: d */
    public final long f43605d;

    /* JADX INFO: renamed from: e */
    public long f43606e;

    /* JADX INFO: renamed from: f */
    public long f43607f;

    /* JADX INFO: renamed from: g */
    public C7989a0 f43608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8014x(FilterOutputStream filterOutputStream, C8009s c8009s, HashMap map, long j10) {
        super(filterOutputStream);
        C5207g.m11111f(map, "progressMap");
        this.f43602a = c8009s;
        this.f43603b = map;
        this.f43604c = j10;
        C8004n c8004n = C8004n.f43550a;
        C5056a0.m10747e();
        this.f43605d = C8004n.f43558i.get();
    }

    @Override // p291o7.InterfaceC8015y
    /* JADX INFO: renamed from: a */
    public final void mo15889a(GraphRequest graphRequest) {
        this.f43608g = graphRequest != null ? this.f43603b.get(graphRequest) : null;
    }

    /* JADX INFO: renamed from: b */
    public final void m15891b(long j10) {
        C7989a0 c7989a0 = this.f43608g;
        if (c7989a0 != null) {
            long j11 = c7989a0.f43486d + j10;
            c7989a0.f43486d = j11;
            if (j11 >= c7989a0.f43487e + c7989a0.f43485c || j11 >= c7989a0.f43488f) {
                c7989a0.m15847a();
            }
        }
        long j12 = this.f43606e + j10;
        this.f43606e = j12;
        if (j12 >= this.f43607f + this.f43605d || j12 >= this.f43604c) {
            m15892l();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        Iterator<C7989a0> it = this.f43603b.values().iterator();
        while (it.hasNext()) {
            it.next().m15847a();
        }
        m15892l();
    }

    /* JADX INFO: renamed from: l */
    public final void m15892l() {
        if (this.f43606e <= this.f43607f) {
            return;
        }
        C8009s c8009s = this.f43602a;
        Iterator it = c8009s.f43584d.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    this.f43607f = this.f43606e;
                    return;
                }
                C8009s.a aVar = (C8009s.a) it.next();
                if (!(aVar instanceof C8009s.b)) {
                    break;
                }
                Handler handler = c8009s.f43581a;
                if ((handler == null ? null : Boolean.valueOf(handler.post(new RunnableC7907g(aVar, 5, this)))) != null) {
                    break;
                } else {
                    ((C8009s.b) aVar).m15883b();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        m15891b(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        C5207g.m11111f(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr);
        m15891b(bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        C5207g.m11111f(bArr, "buffer");
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        m15891b(i11);
    }
}
