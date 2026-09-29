package p291o7;

import android.os.Handler;
import com.facebook.GraphRequest;
import dm.C5207g;
import java.io.OutputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: o7.w */
/* JADX INFO: loaded from: classes.dex */
public final class C8013w extends OutputStream implements InterfaceC8015y {

    /* JADX INFO: renamed from: a */
    public final Handler f43596a;

    /* JADX INFO: renamed from: b */
    public final HashMap f43597b = new HashMap();

    /* JADX INFO: renamed from: c */
    public GraphRequest f43598c;

    /* JADX INFO: renamed from: d */
    public C7989a0 f43599d;

    /* JADX INFO: renamed from: e */
    public int f43600e;

    public C8013w(Handler handler) {
        this.f43596a = handler;
    }

    @Override // p291o7.InterfaceC8015y
    /* JADX INFO: renamed from: a */
    public final void mo15889a(GraphRequest graphRequest) {
        this.f43598c = graphRequest;
        this.f43599d = graphRequest != null ? (C7989a0) this.f43597b.get(graphRequest) : null;
    }

    /* JADX INFO: renamed from: b */
    public final void m15890b(long j10) {
        GraphRequest graphRequest = this.f43598c;
        if (graphRequest == null) {
            return;
        }
        if (this.f43599d == null) {
            C7989a0 c7989a0 = new C7989a0(this.f43596a, graphRequest);
            this.f43599d = c7989a0;
            this.f43597b.put(graphRequest, c7989a0);
        }
        C7989a0 c7989a1 = this.f43599d;
        if (c7989a1 != null) {
            c7989a1.f43488f += j10;
        }
        this.f43600e += (int) j10;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        m15890b(1L);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        C5207g.m11111f(bArr, "buffer");
        m15890b(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        C5207g.m11111f(bArr, "buffer");
        m15890b(i11);
    }
}
