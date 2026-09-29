package p493xo;

import java.util.regex.Pattern;
import p124fp.C5622s;
import p124fp.InterfaceC5610g;
import so.AbstractC9107y;
import so.C9098p;

/* JADX INFO: renamed from: xo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10267g extends AbstractC9107y {

    /* JADX INFO: renamed from: b */
    public final String f51706b;

    /* JADX INFO: renamed from: c */
    public final long f51707c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5610g f51708d;

    public C10267g(String str, long j10, C5622s c5622s) {
        this.f51706b = str;
        this.f51707c = j10;
        this.f51708d = c5622s;
    }

    @Override // so.AbstractC9107y
    /* JADX INFO: renamed from: b */
    public final long mo13136b() {
        return this.f51707c;
    }

    @Override // so.AbstractC9107y
    /* JADX INFO: renamed from: l */
    public final C9098p mo13137l() {
        String str = this.f51706b;
        if (str == null) {
            return null;
        }
        Pattern pattern = C9098p.f47473d;
        try {
            return C9098p.a.m17339a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // so.AbstractC9107y
    /* JADX INFO: renamed from: q */
    public final InterfaceC5610g mo13138q() {
        return this.f51708d;
    }
}
