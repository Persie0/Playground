package p000;

import android.graphics.Bitmap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class jl0 {

    /* JADX INFO: renamed from: a */
    public final cs4 f45660a;

    /* JADX INFO: renamed from: b */
    public final cs4 f45661b;

    /* JADX INFO: renamed from: c */
    public final long f45662c;

    /* JADX INFO: renamed from: d */
    public final long f45663d;

    /* JADX INFO: renamed from: e */
    public final boolean f45664e;

    /* JADX INFO: renamed from: f */
    public final qr3 f45665f;

    public jl0(e18 e18Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.f45660a = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: il0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jl0 f44252b;

            {
                this.f44252b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                jl0 jl0Var = this.f44252b;
                switch (i2) {
                    case 0:
                        gl0 gl0Var = gl0.f40924n;
                        return AbstractC3584sr.m21612Y(jl0Var.f45665f);
                    default:
                        String strM20121d = jl0Var.f45665f.m20121d("Content-Type");
                        if (strM20121d == null) {
                            return null;
                        }
                        Regex regex = xv5.f68845e;
                        try {
                            return AbstractC3122is.m14103q(strM20121d);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final char c = 1 == true ? 1 : 0;
        this.f45661b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: il0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jl0 f44252b;

            {
                this.f44252b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = c;
                jl0 jl0Var = this.f44252b;
                switch (i2) {
                    case 0:
                        gl0 gl0Var = gl0.f40924n;
                        return AbstractC3584sr.m21612Y(jl0Var.f45665f);
                    default:
                        String strM20121d = jl0Var.f45665f.m20121d("Content-Type");
                        if (strM20121d == null) {
                            return null;
                        }
                        Regex regex = xv5.f68845e;
                        try {
                            return AbstractC3122is.m14103q(strM20121d);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f45662c = Long.parseLong(e18Var.mo457D(Long.MAX_VALUE));
        this.f45663d = Long.parseLong(e18Var.mo457D(Long.MAX_VALUE));
        this.f45664e = Integer.parseInt(e18Var.mo457D(Long.MAX_VALUE)) > 0;
        int i2 = Integer.parseInt(e18Var.mo457D(Long.MAX_VALUE));
        or3 or3Var = new or3(0);
        for (int i3 = 0; i3 < i2; i3++) {
            String strMo457D = e18Var.mo457D(Long.MAX_VALUE);
            Bitmap.Config[] configArr = AbstractC3057h.f41581a;
            int iM23388k0 = vk9.m23388k0(strMo457D, ':', 0, 6);
            if (iM23388k0 == -1) {
                C3386nv.m17624j("Unexpected header: ".concat(strMo457D));
                throw null;
            }
            or3Var.m18308v(vk9.m23376L0(strMo457D.substring(0, iM23388k0)).toString(), strMo457D.substring(iM23388k0 + 1));
        }
        this.f45665f = or3Var.m18309w();
    }

    /* JADX INFO: renamed from: a */
    public final void m14531a(d18 d18Var) {
        d18Var.mo477c0(this.f45662c);
        d18Var.writeByte(10);
        d18Var.mo477c0(this.f45663d);
        d18Var.writeByte(10);
        d18Var.mo477c0(this.f45664e ? 1L : 0L);
        d18Var.writeByte(10);
        qr3 qr3Var = this.f45665f;
        d18Var.mo477c0(qr3Var.size());
        d18Var.writeByte(10);
        int size = qr3Var.size();
        for (int i = 0; i < size; i++) {
            d18Var.mo461H(qr3Var.m20122f(i));
            d18Var.mo461H(": ");
            d18Var.mo461H(qr3Var.m20124h(i));
            d18Var.writeByte(10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jl0(j88 j88Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f45660a = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: il0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jl0 f44252b;

            {
                this.f44252b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = objArr;
                jl0 jl0Var = this.f44252b;
                switch (i2) {
                    case 0:
                        gl0 gl0Var = gl0.f40924n;
                        return AbstractC3584sr.m21612Y(jl0Var.f45665f);
                    default:
                        String strM20121d = jl0Var.f45665f.m20121d("Content-Type");
                        if (strM20121d == null) {
                            return null;
                        }
                        Regex regex = xv5.f68845e;
                        try {
                            return AbstractC3122is.m14103q(strM20121d);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        final int i = 1;
        this.f45661b = AbstractC3192a.m15357b(lazyThreadSafetyMode, new ui3(this) { // from class: il0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jl0 f44252b;

            {
                this.f44252b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                jl0 jl0Var = this.f44252b;
                switch (i2) {
                    case 0:
                        gl0 gl0Var = gl0.f40924n;
                        return AbstractC3584sr.m21612Y(jl0Var.f45665f);
                    default:
                        String strM20121d = jl0Var.f45665f.m20121d("Content-Type");
                        if (strM20121d == null) {
                            return null;
                        }
                        Regex regex = xv5.f68845e;
                        try {
                            return AbstractC3122is.m14103q(strM20121d);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f45662c = j88Var.f45212l;
        this.f45663d = j88Var.f45196H;
        this.f45664e = j88Var.f45205e != null;
        this.f45665f = j88Var.f45206f;
    }
}
