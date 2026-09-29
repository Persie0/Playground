package pf;

import dm.C5212l;
import no.C7814a0;

/* JADX INFO: renamed from: pf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8245h extends C7814a0 {
    @Override // no.C7814a0
    /* JADX INFO: renamed from: a */
    public final int mo15554a(char c10, StringBuilder sb2) {
        if (c10 == '\r') {
            sb2.append((char) 0);
        } else if (c10 == ' ') {
            sb2.append((char) 3);
        } else if (c10 == '*') {
            sb2.append((char) 1);
        } else if (c10 == '>') {
            sb2.append((char) 2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
        } else {
            if (c10 < 'A' || c10 > 'Z') {
                C5212l.m11148U(c10);
                throw null;
            }
            sb2.append((char) ((c10 - 'A') + 14));
        }
        return 1;
    }

    @Override // no.C7814a0
    /* JADX INFO: renamed from: b */
    public final int mo15555b() {
        return 3;
    }

    @Override // no.C7814a0
    /* JADX INFO: renamed from: d */
    public final void mo15556d(C8241d c8241d, StringBuilder sb2) {
        c8241d.m16387d(c8241d.m16384a());
        int iM16384a = c8241d.f44517h.f44525b - c8241d.m16384a();
        c8241d.f44515f -= sb2.length();
        String str = c8241d.f44510a;
        if ((str.length() - c8241d.f44518i) - c8241d.f44515f > 1 || iM16384a > 1 || (str.length() - c8241d.f44518i) - c8241d.f44515f != iM16384a) {
            c8241d.m16388e((char) 254);
        }
        if (c8241d.f44516g < 0) {
            c8241d.f44516g = 0;
        }
    }

    @Override // no.C7814a0, pf.InterfaceC8240c
    /* JADX INFO: renamed from: h */
    public final void mo15557h(C8241d c8241d) {
        StringBuilder sb2 = new StringBuilder();
        while (c8241d.m16386c()) {
            char cM16385b = c8241d.m16385b();
            c8241d.f44515f++;
            mo15554a(cM16385b, sb2);
            if (sb2.length() % 3 == 0) {
                C7814a0.m15553f(c8241d, sb2);
                if (C5212l.m11154a0(c8241d.f44510a, c8241d.f44515f, 3) != 3) {
                    c8241d.f44516g = 0;
                    break;
                }
            }
        }
        mo15556d(c8241d, sb2);
    }
}
