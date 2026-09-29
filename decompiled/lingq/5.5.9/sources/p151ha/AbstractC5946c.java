package p151ha;

import com.google.android.exoplayer2.C2416m;
import java.io.IOException;
import java.util.Arrays;
import p175ia.C6241e;
import p338qd.C8573r0;
import p454wa.C9884i;
import p454wa.InterfaceC9882g;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ha.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5946c extends AbstractC5945b {

    /* JADX INFO: renamed from: j */
    public byte[] f35403j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f35404k;

    public AbstractC5946c(InterfaceC9882g interfaceC9882g, C9884i c9884i, C2416m c2416m, int i10, Object obj, byte[] bArr) {
        super(interfaceC9882g, c9884i, 3, c2416m, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f35403j = bArr == null ? C10134c0.f51359f : bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
    /* JADX INFO: renamed from: a */
    public final void mo7374a() throws IOException {
        try {
            this.f35402i.mo7273e(this.f35395b);
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                while (true) {
                    if (i10 == -1 || this.f35404k) {
                        break loop0;
                    }
                    byte[] bArr = this.f35403j;
                    if (bArr.length < i11 + 16384) {
                        this.f35403j = Arrays.copyOf(bArr, bArr.length + 16384);
                    }
                    i10 = this.f35402i.read(this.f35403j, i11, 16384);
                    if (i10 != -1) {
                        i11 += i10;
                    }
                }
            }
            if (!this.f35404k) {
                ((C6241e.a) this).f36262l = Arrays.copyOf(this.f35403j, i11);
            }
        } finally {
            C8573r0.m16705W(this.f35402i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2524d
    /* JADX INFO: renamed from: b */
    public final void mo7375b() {
        this.f35404k = true;
    }
}
