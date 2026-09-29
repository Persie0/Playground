package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import jm.C6526i;
import no.InterfaceC7840j;
import p105f0.C5458f;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0412a {

    /* JADX INFO: renamed from: a */
    public final C5458f<ContentInViewModifier.C0394a> f2285a = new C5458f<>(new ContentInViewModifier.C0394a[16]);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m1489a(CancellationException cancellationException) {
        C5458f<ContentInViewModifier.C0394a> c5458f = this.f2285a;
        int i10 = c5458f.f34019c;
        InterfaceC7840j[] interfaceC7840jArr = new InterfaceC7840j[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            interfaceC7840jArr[i11] = c5458f.f34017a[i11].f1966b;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            interfaceC7840jArr[i12].mo15583t0(cancellationException);
        }
        if (!c5458f.m11694k()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1490b() {
        C5458f<ContentInViewModifier.C0394a> c5458f = this.f2285a;
        int i10 = 0;
        int i11 = new C6526i(0, c5458f.f34019c - 1).f37164b;
        if (i11 >= 0) {
            while (true) {
                c5458f.f34017a[i10].f1966b.mo2031y(C9072e.f47360a);
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        c5458f.m11691h();
    }
}
