package p493xo;

import dm.C5207g;
import java.io.IOException;
import java.net.ProtocolException;
import mo.C7661i;
import okhttp3.internal.connection.C8077a;
import okhttp3.internal.http2.ConnectionShutdownException;
import p124fp.C5617n;
import p124fp.C5621r;
import p338qd.C8584v;
import p349qo.C8656b;
import p467wo.C9988c;
import p467wo.C9990e;
import so.AbstractC9093k;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9097o;
import to.C9347b;

/* JADX INFO: renamed from: xo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10262b implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public final boolean f51693a;

    public C10262b(boolean z10) {
        this.f51693a = z10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b1 A[Catch: IOException -> 0x0223, TryCatch #8 {IOException -> 0x0223, blocks: (B:95:0x0199, B:99:0x01a3, B:101:0x01c0, B:103:0x01ce, B:116:0x01fa, B:120:0x0217, B:121:0x0221, B:119:0x020f, B:113:0x01f0, B:105:0x01d8, B:100:0x01b1), top: B:151:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ce A[Catch: IOException -> 0x0223, TryCatch #8 {IOException -> 0x0223, blocks: (B:95:0x0199, B:99:0x01a3, B:101:0x01c0, B:103:0x01ce, B:116:0x01fa, B:120:0x0217, B:121:0x0221, B:119:0x020f, B:113:0x01f0, B:105:0x01d8, B:100:0x01b1), top: B:151:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01d8 A[Catch: IOException -> 0x0223, TRY_LEAVE, TryCatch #8 {IOException -> 0x0223, blocks: (B:95:0x0199, B:99:0x01a3, B:101:0x01c0, B:103:0x01ce, B:116:0x01fa, B:120:0x0217, B:121:0x0221, B:119:0x020f, B:113:0x01f0, B:105:0x01d8, B:100:0x01b1), top: B:151:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f0 A[Catch: IOException -> 0x0223, TRY_ENTER, TryCatch #8 {IOException -> 0x0223, blocks: (B:95:0x0199, B:99:0x01a3, B:101:0x01c0, B:103:0x01ce, B:116:0x01fa, B:120:0x0217, B:121:0x0221, B:119:0x020f, B:113:0x01f0, B:105:0x01d8, B:100:0x01b1), top: B:151:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01fa A[Catch: IOException -> 0x0223, TryCatch #8 {IOException -> 0x0223, blocks: (B:95:0x0199, B:99:0x01a3, B:101:0x01c0, B:103:0x01ce, B:116:0x01fa, B:120:0x0217, B:121:0x0221, B:119:0x020f, B:113:0x01f0, B:105:0x01d8, B:100:0x01b1), top: B:151:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x020d  */
    /* JADX WARN: Code duplicated, block: B:119:0x020f A[Catch: IOException -> 0x0223, TryCatch #8 {IOException -> 0x0223, blocks: (B:95:0x0199, B:99:0x01a3, B:101:0x01c0, B:103:0x01ce, B:116:0x01fa, B:120:0x0217, B:121:0x0221, B:119:0x020f, B:113:0x01f0, B:105:0x01d8, B:100:0x01b1), top: B:151:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x022a  */
    /* JADX WARN: Code duplicated, block: B:130:0x022e  */
    /* JADX WARN: Code duplicated, block: B:131:0x022f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0232  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130 A[Catch: IOException -> 0x0225, TryCatch #6 {IOException -> 0x0225, blocks: (B:72:0x0127, B:74:0x0130, B:76:0x013c, B:89:0x016c, B:91:0x0177, B:92:0x017d, B:93:0x0191), top: B:147:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013a A[PHI: r17
      0x013a: PHI (r17v3 so.x$a) = (r17v2 so.x$a), (r17v4 so.x$a) binds: [B:70:0x0124, B:73:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x0169  */
    /* JADX WARN: Code duplicated, block: B:89:0x016c A[Catch: IOException -> 0x0225, TryCatch #6 {IOException -> 0x0225, blocks: (B:72:0x0127, B:74:0x0130, B:76:0x013c, B:89:0x016c, B:91:0x0177, B:92:0x017d, B:93:0x0191), top: B:147:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0177 A[Catch: IOException -> 0x0225, TryCatch #6 {IOException -> 0x0225, blocks: (B:72:0x0127, B:74:0x0130, B:76:0x013c, B:89:0x016c, B:91:0x0177, B:92:0x017d, B:93:0x0191), top: B:147:0x0127 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x019d  */
    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws Throwable {
        boolean z10;
        C9106x.a aVarM18562c;
        String str;
        IOException iOException;
        boolean z11;
        C9106x.a aVar;
        boolean z12;
        C9106x c9106xM17352a;
        int i10;
        boolean z13;
        boolean z14;
        C9106x c9106xM17352a2;
        AbstractC9107y abstractC9107y;
        long jMo13136b;
        Long lValueOf;
        IOException iOException2;
        boolean z15;
        C9106x.a aVarM18562c2;
        boolean z16;
        C9988c c9988c = c10266f.f51700d;
        C5207g.m11108c(c9988c);
        InterfaceC10264d interfaceC10264d = c9988c.f50743d;
        C8077a c8077a = c9988c.f50746g;
        AbstractC9093k abstractC9093k = c9988c.f50741b;
        C9990e c9990e = c9988c.f50740a;
        C9101s c9101s = c10266f.f51701e;
        AbstractC9105w abstractC9105w = c9101s.f47545d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
                interfaceC10264d.mo19223a(c9101s);
                try {
                    if (!C8584v.m16799x(c9101s.f47543b) || abstractC9105w == null) {
                        str = "HTTP ";
                        iOException2 = null;
                        c9990e.m18575h(c9988c, true, false, null);
                        z15 = true;
                        aVarM18562c = null;
                    } else {
                        if (C7661i.m15249O2("100-continue", c9101s.f47544c.m17305a("Expect"))) {
                            try {
                                try {
                                    interfaceC10264d.mo19230h();
                                    aVarM18562c2 = c9988c.m18562c(true);
                                    try {
                                        abstractC9093k.getClass();
                                        C5207g.m11111f(c9990e, "call");
                                        z16 = false;
                                    } catch (IOException e10) {
                                        e = e10;
                                        str = "HTTP ";
                                        aVarM18562c = aVarM18562c2;
                                        z10 = true;
                                        if (!(e instanceof ConnectionShutdownException)) {
                                            throw e;
                                        }
                                        if (c9988c.f50745f) {
                                            throw e;
                                        }
                                        iOException = e;
                                        z11 = z10;
                                    }
                                } catch (IOException e11) {
                                    abstractC9093k.getClass();
                                    C5207g.m11111f(c9990e, "call");
                                    c9988c.m18563d(e11);
                                    throw e11;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                str = "HTTP ";
                                z10 = true;
                                aVarM18562c = null;
                            }
                        } else {
                            z16 = true;
                            aVarM18562c2 = null;
                        }
                        try {
                            if (aVarM18562c2 == null) {
                                try {
                                    c9988c.f50744e = false;
                                    AbstractC9105w abstractC9105w2 = c9101s.f47545d;
                                    C5207g.m11108c(abstractC9105w2);
                                    z15 = z16;
                                    aVarM18562c = aVarM18562c2;
                                    try {
                                        long jMo13145a = abstractC9105w2.mo13145a();
                                        abstractC9093k.getClass();
                                        C5207g.m11111f(c9990e, "call");
                                        str = "HTTP ";
                                        C5621r c5621rM11990b = C5617n.m11990b(new C9988c.a(c9988c, interfaceC10264d.mo19225c(c9101s, jMo13145a), jMo13145a));
                                        abstractC9105w.mo13147c(c5621rM11990b);
                                        c5621rM11990b.close();
                                    } catch (IOException e13) {
                                        e = e13;
                                        str = "HTTP ";
                                        z10 = z15;
                                        if (!(e instanceof ConnectionShutdownException)) {
                                            throw e;
                                        }
                                        if (c9988c.f50745f) {
                                            throw e;
                                        }
                                        iOException = e;
                                        z11 = z10;
                                        if (aVarM18562c != null) {
                                            aVar = aVarM18562c;
                                            aVar.f47575a = c9101s;
                                            aVar.f47579e = c8077a.f43871e;
                                            aVar.f47585k = jCurrentTimeMillis;
                                            z12 = z11;
                                            aVar.f47586l = System.currentTimeMillis();
                                            c9106xM17352a = aVar.m17352a();
                                            i10 = c9106xM17352a.f47566d;
                                            if (i10 != 100) {
                                                if (102 <= i10) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    C9106x.a aVarM18562c3 = c9988c.m18562c(false);
                                                    C5207g.m11108c(aVarM18562c3);
                                                    if (z12) {
                                                        abstractC9093k.getClass();
                                                        C5207g.m11111f(c9990e, "call");
                                                    }
                                                    aVarM18562c3.f47575a = c9101s;
                                                    aVarM18562c3.f47579e = c8077a.f43871e;
                                                    aVarM18562c3.f47585k = jCurrentTimeMillis;
                                                    aVarM18562c3.f47586l = System.currentTimeMillis();
                                                    c9106xM17352a = aVarM18562c3.m17352a();
                                                    i10 = c9106xM17352a.f47566d;
                                                }
                                                abstractC9093k.getClass();
                                                C5207g.m11111f(c9990e, "call");
                                                if (this.f51693a) {
                                                    C9106x.a aVar2 = new C9106x.a(c9106xM17352a);
                                                    aVar2.f47581g = c9988c.m18561b(c9106xM17352a);
                                                    c9106xM17352a2 = aVar2.m17352a();
                                                } else {
                                                    C9106x.a aVar3 = new C9106x.a(c9106xM17352a);
                                                    aVar3.f47581g = c9988c.m18561b(c9106xM17352a);
                                                    c9106xM17352a2 = aVar3.m17352a();
                                                }
                                                if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                                    interfaceC10264d.mo19229g().m15979k();
                                                } else {
                                                    interfaceC10264d.mo19229g().m15979k();
                                                }
                                                if (i10 != 204) {
                                                    abstractC9107y = c9106xM17352a2.f47569g;
                                                    if (abstractC9107y == null) {
                                                        jMo13136b = -1;
                                                    } else {
                                                        jMo13136b = abstractC9107y.mo13136b();
                                                    }
                                                    if (jMo13136b > 0) {
                                                        StringBuilder sb2 = new StringBuilder(str);
                                                        sb2.append(i10);
                                                        sb2.append(" had non-zero Content-Length: ");
                                                        if (abstractC9107y == null) {
                                                            lValueOf = null;
                                                        } else {
                                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                        }
                                                        sb2.append(lValueOf);
                                                        throw new ProtocolException(sb2.toString());
                                                    }
                                                } else {
                                                    abstractC9107y = c9106xM17352a2.f47569g;
                                                    if (abstractC9107y == null) {
                                                        jMo13136b = -1;
                                                    } else {
                                                        jMo13136b = abstractC9107y.mo13136b();
                                                    }
                                                    if (jMo13136b > 0) {
                                                        StringBuilder sb3 = new StringBuilder(str);
                                                        sb3.append(i10);
                                                        sb3.append(" had non-zero Content-Length: ");
                                                        if (abstractC9107y == null) {
                                                            lValueOf = null;
                                                        } else {
                                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                        }
                                                        sb3.append(lValueOf);
                                                        throw new ProtocolException(sb3.toString());
                                                    }
                                                }
                                                return c9106xM17352a2;
                                            }
                                            z14 = true;
                                            if (z14) {
                                                C9106x.a aVarM18562c4 = c9988c.m18562c(false);
                                                C5207g.m11108c(aVarM18562c4);
                                                if (z12) {
                                                    abstractC9093k.getClass();
                                                    C5207g.m11111f(c9990e, "call");
                                                }
                                                aVarM18562c4.f47575a = c9101s;
                                                aVarM18562c4.f47579e = c8077a.f43871e;
                                                aVarM18562c4.f47585k = jCurrentTimeMillis;
                                                aVarM18562c4.f47586l = System.currentTimeMillis();
                                                c9106xM17352a = aVarM18562c4.m17352a();
                                                i10 = c9106xM17352a.f47566d;
                                            }
                                            abstractC9093k.getClass();
                                            C5207g.m11111f(c9990e, "call");
                                            if (this.f51693a) {
                                                C9106x.a aVar4 = new C9106x.a(c9106xM17352a);
                                                aVar4.f47581g = c9988c.m18561b(c9106xM17352a);
                                                c9106xM17352a2 = aVar4.m17352a();
                                            } else {
                                                C9106x.a aVar5 = new C9106x.a(c9106xM17352a);
                                                aVar5.f47581g = c9988c.m18561b(c9106xM17352a);
                                                c9106xM17352a2 = aVar5.m17352a();
                                            }
                                            if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                                interfaceC10264d.mo19229g().m15979k();
                                            } else {
                                                interfaceC10264d.mo19229g().m15979k();
                                            }
                                            if (i10 != 204) {
                                                abstractC9107y = c9106xM17352a2.f47569g;
                                                if (abstractC9107y == null) {
                                                    jMo13136b = -1;
                                                } else {
                                                    jMo13136b = abstractC9107y.mo13136b();
                                                }
                                                if (jMo13136b > 0) {
                                                    StringBuilder sb4 = new StringBuilder(str);
                                                    sb4.append(i10);
                                                    sb4.append(" had non-zero Content-Length: ");
                                                    if (abstractC9107y == null) {
                                                        lValueOf = null;
                                                    } else {
                                                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                    }
                                                    sb4.append(lValueOf);
                                                    throw new ProtocolException(sb4.toString());
                                                }
                                            } else {
                                                abstractC9107y = c9106xM17352a2.f47569g;
                                                if (abstractC9107y == null) {
                                                    jMo13136b = -1;
                                                } else {
                                                    jMo13136b = abstractC9107y.mo13136b();
                                                }
                                                if (jMo13136b > 0) {
                                                    StringBuilder sb5 = new StringBuilder(str);
                                                    sb5.append(i10);
                                                    sb5.append(" had non-zero Content-Length: ");
                                                    if (abstractC9107y == null) {
                                                        lValueOf = null;
                                                    } else {
                                                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                    }
                                                    sb5.append(lValueOf);
                                                    throw new ProtocolException(sb5.toString());
                                                }
                                            }
                                            return c9106xM17352a2;
                                        }
                                        try {
                                            aVarM18562c = c9988c.m18562c(false);
                                            C5207g.m11108c(aVarM18562c);
                                            if (z11) {
                                                abstractC9093k.getClass();
                                                C5207g.m11111f(c9990e, "call");
                                                aVar = aVarM18562c;
                                                z11 = false;
                                            } else {
                                                aVar = aVarM18562c;
                                            }
                                            aVar.f47575a = c9101s;
                                            aVar.f47579e = c8077a.f43871e;
                                            aVar.f47585k = jCurrentTimeMillis;
                                            z12 = z11;
                                            aVar.f47586l = System.currentTimeMillis();
                                            c9106xM17352a = aVar.m17352a();
                                            i10 = c9106xM17352a.f47566d;
                                            try {
                                                if (i10 != 100) {
                                                    if (102 <= i10) {
                                                        z13 = false;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (z13) {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        C9106x.a aVarM18562c5 = c9988c.m18562c(false);
                                                        C5207g.m11108c(aVarM18562c5);
                                                        if (z12) {
                                                            abstractC9093k.getClass();
                                                            C5207g.m11111f(c9990e, "call");
                                                        }
                                                        aVarM18562c5.f47575a = c9101s;
                                                        aVarM18562c5.f47579e = c8077a.f43871e;
                                                        aVarM18562c5.f47585k = jCurrentTimeMillis;
                                                        aVarM18562c5.f47586l = System.currentTimeMillis();
                                                        c9106xM17352a = aVarM18562c5.m17352a();
                                                        i10 = c9106xM17352a.f47566d;
                                                    }
                                                    abstractC9093k.getClass();
                                                    C5207g.m11111f(c9990e, "call");
                                                    if (this.f51693a) {
                                                        C9106x.a aVar6 = new C9106x.a(c9106xM17352a);
                                                        aVar6.f47581g = c9988c.m18561b(c9106xM17352a);
                                                        c9106xM17352a2 = aVar6.m17352a();
                                                    } else {
                                                        C9106x.a aVar7 = new C9106x.a(c9106xM17352a);
                                                        aVar7.f47581g = c9988c.m18561b(c9106xM17352a);
                                                        c9106xM17352a2 = aVar7.m17352a();
                                                    }
                                                    if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                                        interfaceC10264d.mo19229g().m15979k();
                                                    } else {
                                                        interfaceC10264d.mo19229g().m15979k();
                                                    }
                                                    if (i10 != 204) {
                                                        abstractC9107y = c9106xM17352a2.f47569g;
                                                        if (abstractC9107y == null) {
                                                            jMo13136b = -1;
                                                        } else {
                                                            jMo13136b = abstractC9107y.mo13136b();
                                                        }
                                                        if (jMo13136b > 0) {
                                                            StringBuilder sb6 = new StringBuilder(str);
                                                            sb6.append(i10);
                                                            sb6.append(" had non-zero Content-Length: ");
                                                            if (abstractC9107y == null) {
                                                                lValueOf = null;
                                                            } else {
                                                                lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                            }
                                                            sb6.append(lValueOf);
                                                            throw new ProtocolException(sb6.toString());
                                                        }
                                                    } else {
                                                        abstractC9107y = c9106xM17352a2.f47569g;
                                                        if (abstractC9107y == null) {
                                                            jMo13136b = -1;
                                                        } else {
                                                            jMo13136b = abstractC9107y.mo13136b();
                                                        }
                                                        if (jMo13136b > 0) {
                                                            StringBuilder sb7 = new StringBuilder(str);
                                                            sb7.append(i10);
                                                            sb7.append(" had non-zero Content-Length: ");
                                                            if (abstractC9107y == null) {
                                                                lValueOf = null;
                                                            } else {
                                                                lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                            }
                                                            sb7.append(lValueOf);
                                                            throw new ProtocolException(sb7.toString());
                                                        }
                                                    }
                                                    return c9106xM17352a2;
                                                }
                                                if (this.f51693a) {
                                                    C9106x.a aVar8 = new C9106x.a(c9106xM17352a);
                                                    aVar8.f47581g = c9988c.m18561b(c9106xM17352a);
                                                    c9106xM17352a2 = aVar8.m17352a();
                                                } else {
                                                    C9106x.a aVar9 = new C9106x.a(c9106xM17352a);
                                                    aVar9.f47581g = c9988c.m18561b(c9106xM17352a);
                                                    c9106xM17352a2 = aVar9.m17352a();
                                                }
                                                if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                                    interfaceC10264d.mo19229g().m15979k();
                                                } else {
                                                    interfaceC10264d.mo19229g().m15979k();
                                                }
                                                if (i10 != 204) {
                                                    abstractC9107y = c9106xM17352a2.f47569g;
                                                    if (abstractC9107y == null) {
                                                        jMo13136b = -1;
                                                    } else {
                                                        jMo13136b = abstractC9107y.mo13136b();
                                                    }
                                                    if (jMo13136b > 0) {
                                                        StringBuilder sb8 = new StringBuilder(str);
                                                        sb8.append(i10);
                                                        sb8.append(" had non-zero Content-Length: ");
                                                        if (abstractC9107y == null) {
                                                            lValueOf = null;
                                                        } else {
                                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                        }
                                                        sb8.append(lValueOf);
                                                        throw new ProtocolException(sb8.toString());
                                                    }
                                                } else {
                                                    abstractC9107y = c9106xM17352a2.f47569g;
                                                    if (abstractC9107y == null) {
                                                        jMo13136b = -1;
                                                    } else {
                                                        jMo13136b = abstractC9107y.mo13136b();
                                                    }
                                                    if (jMo13136b > 0) {
                                                        StringBuilder sb9 = new StringBuilder(str);
                                                        sb9.append(i10);
                                                        sb9.append(" had non-zero Content-Length: ");
                                                        if (abstractC9107y == null) {
                                                            lValueOf = null;
                                                        } else {
                                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                                        }
                                                        sb9.append(lValueOf);
                                                        throw new ProtocolException(sb9.toString());
                                                    }
                                                }
                                                return c9106xM17352a2;
                                            } catch (IOException e14) {
                                                e = e14;
                                            }
                                            z14 = true;
                                            if (z14) {
                                                C9106x.a aVarM18562c6 = c9988c.m18562c(false);
                                                C5207g.m11108c(aVarM18562c6);
                                                if (z12) {
                                                    abstractC9093k.getClass();
                                                    C5207g.m11111f(c9990e, "call");
                                                }
                                                aVarM18562c6.f47575a = c9101s;
                                                aVarM18562c6.f47579e = c8077a.f43871e;
                                                aVarM18562c6.f47585k = jCurrentTimeMillis;
                                                aVarM18562c6.f47586l = System.currentTimeMillis();
                                                c9106xM17352a = aVarM18562c6.m17352a();
                                                i10 = c9106xM17352a.f47566d;
                                            }
                                            abstractC9093k.getClass();
                                            C5207g.m11111f(c9990e, "call");
                                        } catch (IOException e15) {
                                            e = e15;
                                        }
                                        if (iOException != null) {
                                            throw e;
                                        }
                                        C8656b.m16899g(iOException, e);
                                        throw iOException;
                                    }
                                } catch (IOException e16) {
                                    e = e16;
                                    str = "HTTP ";
                                    z15 = z16;
                                    aVarM18562c = aVarM18562c2;
                                }
                            } else {
                                str = "HTTP ";
                                z15 = z16;
                                aVarM18562c = aVarM18562c2;
                                c9990e.m18575h(c9988c, true, false, null);
                                if (!(c8077a.f43873g != null)) {
                                    interfaceC10264d.mo19229g().m15979k();
                                }
                            }
                            iOException2 = null;
                        } catch (IOException e17) {
                            e = e17;
                        }
                    }
                    try {
                        interfaceC10264d.mo19224b();
                        iOException = iOException2;
                        z11 = z15;
                    } catch (IOException e18) {
                        try {
                            c9988c.m18563d(e18);
                            throw e18;
                        } catch (IOException e19) {
                            e = e19;
                            z10 = z15;
                            if (!(e instanceof ConnectionShutdownException)) {
                                throw e;
                            }
                            if (c9988c.f50745f) {
                                throw e;
                            }
                            iOException = e;
                            z11 = z10;
                            if (aVarM18562c != null) {
                                aVar = aVarM18562c;
                                aVar.f47575a = c9101s;
                                aVar.f47579e = c8077a.f43871e;
                                aVar.f47585k = jCurrentTimeMillis;
                                z12 = z11;
                                aVar.f47586l = System.currentTimeMillis();
                                c9106xM17352a = aVar.m17352a();
                                i10 = c9106xM17352a.f47566d;
                                if (i10 != 100) {
                                    if (102 <= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        C9106x.a aVarM18562c7 = c9988c.m18562c(false);
                                        C5207g.m11108c(aVarM18562c7);
                                        if (z12) {
                                            abstractC9093k.getClass();
                                            C5207g.m11111f(c9990e, "call");
                                        }
                                        aVarM18562c7.f47575a = c9101s;
                                        aVarM18562c7.f47579e = c8077a.f43871e;
                                        aVarM18562c7.f47585k = jCurrentTimeMillis;
                                        aVarM18562c7.f47586l = System.currentTimeMillis();
                                        c9106xM17352a = aVarM18562c7.m17352a();
                                        i10 = c9106xM17352a.f47566d;
                                    }
                                    abstractC9093k.getClass();
                                    C5207g.m11111f(c9990e, "call");
                                    if (this.f51693a) {
                                        C9106x.a aVar10 = new C9106x.a(c9106xM17352a);
                                        aVar10.f47581g = c9988c.m18561b(c9106xM17352a);
                                        c9106xM17352a2 = aVar10.m17352a();
                                    } else {
                                        C9106x.a aVar11 = new C9106x.a(c9106xM17352a);
                                        aVar11.f47581g = c9988c.m18561b(c9106xM17352a);
                                        c9106xM17352a2 = aVar11.m17352a();
                                    }
                                    if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                        interfaceC10264d.mo19229g().m15979k();
                                    } else {
                                        interfaceC10264d.mo19229g().m15979k();
                                    }
                                    if (i10 != 204) {
                                        abstractC9107y = c9106xM17352a2.f47569g;
                                        if (abstractC9107y == null) {
                                            jMo13136b = -1;
                                        } else {
                                            jMo13136b = abstractC9107y.mo13136b();
                                        }
                                        if (jMo13136b > 0) {
                                            StringBuilder sb10 = new StringBuilder(str);
                                            sb10.append(i10);
                                            sb10.append(" had non-zero Content-Length: ");
                                            if (abstractC9107y == null) {
                                                lValueOf = null;
                                            } else {
                                                lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                            }
                                            sb10.append(lValueOf);
                                            throw new ProtocolException(sb10.toString());
                                        }
                                    } else {
                                        abstractC9107y = c9106xM17352a2.f47569g;
                                        if (abstractC9107y == null) {
                                            jMo13136b = -1;
                                        } else {
                                            jMo13136b = abstractC9107y.mo13136b();
                                        }
                                        if (jMo13136b > 0) {
                                            StringBuilder sb11 = new StringBuilder(str);
                                            sb11.append(i10);
                                            sb11.append(" had non-zero Content-Length: ");
                                            if (abstractC9107y == null) {
                                                lValueOf = null;
                                            } else {
                                                lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                            }
                                            sb11.append(lValueOf);
                                            throw new ProtocolException(sb11.toString());
                                        }
                                    }
                                    return c9106xM17352a2;
                                }
                                z14 = true;
                                if (z14) {
                                    C9106x.a aVarM18562c8 = c9988c.m18562c(false);
                                    C5207g.m11108c(aVarM18562c8);
                                    if (z12) {
                                        abstractC9093k.getClass();
                                        C5207g.m11111f(c9990e, "call");
                                    }
                                    aVarM18562c8.f47575a = c9101s;
                                    aVarM18562c8.f47579e = c8077a.f43871e;
                                    aVarM18562c8.f47585k = jCurrentTimeMillis;
                                    aVarM18562c8.f47586l = System.currentTimeMillis();
                                    c9106xM17352a = aVarM18562c8.m17352a();
                                    i10 = c9106xM17352a.f47566d;
                                }
                                abstractC9093k.getClass();
                                C5207g.m11111f(c9990e, "call");
                                if (this.f51693a) {
                                    C9106x.a aVar12 = new C9106x.a(c9106xM17352a);
                                    aVar12.f47581g = c9988c.m18561b(c9106xM17352a);
                                    c9106xM17352a2 = aVar12.m17352a();
                                } else {
                                    C9106x.a aVar13 = new C9106x.a(c9106xM17352a);
                                    aVar13.f47581g = c9988c.m18561b(c9106xM17352a);
                                    c9106xM17352a2 = aVar13.m17352a();
                                }
                                if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                    interfaceC10264d.mo19229g().m15979k();
                                } else {
                                    interfaceC10264d.mo19229g().m15979k();
                                }
                                if (i10 != 204) {
                                    abstractC9107y = c9106xM17352a2.f47569g;
                                    if (abstractC9107y == null) {
                                        jMo13136b = -1;
                                    } else {
                                        jMo13136b = abstractC9107y.mo13136b();
                                    }
                                    if (jMo13136b > 0) {
                                        StringBuilder sb12 = new StringBuilder(str);
                                        sb12.append(i10);
                                        sb12.append(" had non-zero Content-Length: ");
                                        if (abstractC9107y == null) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                        }
                                        sb12.append(lValueOf);
                                        throw new ProtocolException(sb12.toString());
                                    }
                                } else {
                                    abstractC9107y = c9106xM17352a2.f47569g;
                                    if (abstractC9107y == null) {
                                        jMo13136b = -1;
                                    } else {
                                        jMo13136b = abstractC9107y.mo13136b();
                                    }
                                    if (jMo13136b > 0) {
                                        StringBuilder sb13 = new StringBuilder(str);
                                        sb13.append(i10);
                                        sb13.append(" had non-zero Content-Length: ");
                                        if (abstractC9107y == null) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                        }
                                        sb13.append(lValueOf);
                                        throw new ProtocolException(sb13.toString());
                                    }
                                }
                                return c9106xM17352a2;
                            }
                            aVarM18562c = c9988c.m18562c(false);
                            C5207g.m11108c(aVarM18562c);
                            if (z11) {
                                abstractC9093k.getClass();
                                C5207g.m11111f(c9990e, "call");
                                aVar = aVarM18562c;
                                z11 = false;
                            } else {
                                aVar = aVarM18562c;
                            }
                            aVar.f47575a = c9101s;
                            aVar.f47579e = c8077a.f43871e;
                            aVar.f47585k = jCurrentTimeMillis;
                            z12 = z11;
                            aVar.f47586l = System.currentTimeMillis();
                            c9106xM17352a = aVar.m17352a();
                            i10 = c9106xM17352a.f47566d;
                            if (i10 != 100) {
                                if (102 <= i10) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    z14 = false;
                                }
                                if (z14) {
                                    C9106x.a aVarM18562c9 = c9988c.m18562c(false);
                                    C5207g.m11108c(aVarM18562c9);
                                    if (z12) {
                                        abstractC9093k.getClass();
                                        C5207g.m11111f(c9990e, "call");
                                    }
                                    aVarM18562c9.f47575a = c9101s;
                                    aVarM18562c9.f47579e = c8077a.f43871e;
                                    aVarM18562c9.f47585k = jCurrentTimeMillis;
                                    aVarM18562c9.f47586l = System.currentTimeMillis();
                                    c9106xM17352a = aVarM18562c9.m17352a();
                                    i10 = c9106xM17352a.f47566d;
                                }
                                abstractC9093k.getClass();
                                C5207g.m11111f(c9990e, "call");
                                if (this.f51693a) {
                                    C9106x.a aVar14 = new C9106x.a(c9106xM17352a);
                                    aVar14.f47581g = c9988c.m18561b(c9106xM17352a);
                                    c9106xM17352a2 = aVar14.m17352a();
                                } else {
                                    C9106x.a aVar15 = new C9106x.a(c9106xM17352a);
                                    aVar15.f47581g = c9988c.m18561b(c9106xM17352a);
                                    c9106xM17352a2 = aVar15.m17352a();
                                }
                                if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                    interfaceC10264d.mo19229g().m15979k();
                                } else {
                                    interfaceC10264d.mo19229g().m15979k();
                                }
                                if (i10 != 204) {
                                    abstractC9107y = c9106xM17352a2.f47569g;
                                    if (abstractC9107y == null) {
                                        jMo13136b = -1;
                                    } else {
                                        jMo13136b = abstractC9107y.mo13136b();
                                    }
                                    if (jMo13136b > 0) {
                                        StringBuilder sb14 = new StringBuilder(str);
                                        sb14.append(i10);
                                        sb14.append(" had non-zero Content-Length: ");
                                        if (abstractC9107y == null) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                        }
                                        sb14.append(lValueOf);
                                        throw new ProtocolException(sb14.toString());
                                    }
                                } else {
                                    abstractC9107y = c9106xM17352a2.f47569g;
                                    if (abstractC9107y == null) {
                                        jMo13136b = -1;
                                    } else {
                                        jMo13136b = abstractC9107y.mo13136b();
                                    }
                                    if (jMo13136b > 0) {
                                        StringBuilder sb15 = new StringBuilder(str);
                                        sb15.append(i10);
                                        sb15.append(" had non-zero Content-Length: ");
                                        if (abstractC9107y == null) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                        }
                                        sb15.append(lValueOf);
                                        throw new ProtocolException(sb15.toString());
                                    }
                                }
                                return c9106xM17352a2;
                            }
                            z14 = true;
                            if (z14) {
                                C9106x.a aVarM18562c10 = c9988c.m18562c(false);
                                C5207g.m11108c(aVarM18562c10);
                                if (z12) {
                                    abstractC9093k.getClass();
                                    C5207g.m11111f(c9990e, "call");
                                }
                                aVarM18562c10.f47575a = c9101s;
                                aVarM18562c10.f47579e = c8077a.f43871e;
                                aVarM18562c10.f47585k = jCurrentTimeMillis;
                                aVarM18562c10.f47586l = System.currentTimeMillis();
                                c9106xM17352a = aVarM18562c10.m17352a();
                                i10 = c9106xM17352a.f47566d;
                            }
                            abstractC9093k.getClass();
                            C5207g.m11111f(c9990e, "call");
                            if (this.f51693a) {
                                C9106x.a aVar16 = new C9106x.a(c9106xM17352a);
                                aVar16.f47581g = c9988c.m18561b(c9106xM17352a);
                                c9106xM17352a2 = aVar16.m17352a();
                            } else {
                                C9106x.a aVar17 = new C9106x.a(c9106xM17352a);
                                aVar17.f47581g = c9988c.m18561b(c9106xM17352a);
                                c9106xM17352a2 = aVar17.m17352a();
                            }
                            if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                interfaceC10264d.mo19229g().m15979k();
                            } else {
                                interfaceC10264d.mo19229g().m15979k();
                            }
                            if (i10 != 204) {
                                abstractC9107y = c9106xM17352a2.f47569g;
                                if (abstractC9107y == null) {
                                    jMo13136b = -1;
                                } else {
                                    jMo13136b = abstractC9107y.mo13136b();
                                }
                                if (jMo13136b > 0) {
                                    StringBuilder sb16 = new StringBuilder(str);
                                    sb16.append(i10);
                                    sb16.append(" had non-zero Content-Length: ");
                                    if (abstractC9107y == null) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                    }
                                    sb16.append(lValueOf);
                                    throw new ProtocolException(sb16.toString());
                                }
                            } else {
                                abstractC9107y = c9106xM17352a2.f47569g;
                                if (abstractC9107y == null) {
                                    jMo13136b = -1;
                                } else {
                                    jMo13136b = abstractC9107y.mo13136b();
                                }
                                if (jMo13136b > 0) {
                                    StringBuilder sb17 = new StringBuilder(str);
                                    sb17.append(i10);
                                    sb17.append(" had non-zero Content-Length: ");
                                    if (abstractC9107y == null) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                    }
                                    sb17.append(lValueOf);
                                    throw new ProtocolException(sb17.toString());
                                }
                            }
                            return c9106xM17352a2;
                            if (iOException != null) {
                                throw e;
                            }
                            C8656b.m16899g(iOException, e);
                            throw iOException;
                        }
                    }
                } catch (IOException e20) {
                    e = e20;
                    str = "HTTP ";
                    z10 = true;
                    aVarM18562c = null;
                    if (!(e instanceof ConnectionShutdownException)) {
                        throw e;
                    }
                    if (c9988c.f50745f) {
                        throw e;
                    }
                    iOException = e;
                    z11 = z10;
                    if (aVarM18562c != null) {
                        aVar = aVarM18562c;
                        aVar.f47575a = c9101s;
                        aVar.f47579e = c8077a.f43871e;
                        aVar.f47585k = jCurrentTimeMillis;
                        z12 = z11;
                        aVar.f47586l = System.currentTimeMillis();
                        c9106xM17352a = aVar.m17352a();
                        i10 = c9106xM17352a.f47566d;
                        if (i10 != 100) {
                            if (102 <= i10) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                z14 = false;
                            }
                            if (z14) {
                                C9106x.a aVarM18562c11 = c9988c.m18562c(false);
                                C5207g.m11108c(aVarM18562c11);
                                if (z12) {
                                    abstractC9093k.getClass();
                                    C5207g.m11111f(c9990e, "call");
                                }
                                aVarM18562c11.f47575a = c9101s;
                                aVarM18562c11.f47579e = c8077a.f43871e;
                                aVarM18562c11.f47585k = jCurrentTimeMillis;
                                aVarM18562c11.f47586l = System.currentTimeMillis();
                                c9106xM17352a = aVarM18562c11.m17352a();
                                i10 = c9106xM17352a.f47566d;
                            }
                            abstractC9093k.getClass();
                            C5207g.m11111f(c9990e, "call");
                            if (this.f51693a) {
                                C9106x.a aVar18 = new C9106x.a(c9106xM17352a);
                                aVar18.f47581g = c9988c.m18561b(c9106xM17352a);
                                c9106xM17352a2 = aVar18.m17352a();
                            } else {
                                C9106x.a aVar19 = new C9106x.a(c9106xM17352a);
                                aVar19.f47581g = c9988c.m18561b(c9106xM17352a);
                                c9106xM17352a2 = aVar19.m17352a();
                            }
                            if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                                interfaceC10264d.mo19229g().m15979k();
                            } else {
                                interfaceC10264d.mo19229g().m15979k();
                            }
                            if (i10 != 204) {
                                abstractC9107y = c9106xM17352a2.f47569g;
                                if (abstractC9107y == null) {
                                    jMo13136b = -1;
                                } else {
                                    jMo13136b = abstractC9107y.mo13136b();
                                }
                                if (jMo13136b > 0) {
                                    StringBuilder sb18 = new StringBuilder(str);
                                    sb18.append(i10);
                                    sb18.append(" had non-zero Content-Length: ");
                                    if (abstractC9107y == null) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                    }
                                    sb18.append(lValueOf);
                                    throw new ProtocolException(sb18.toString());
                                }
                            } else {
                                abstractC9107y = c9106xM17352a2.f47569g;
                                if (abstractC9107y == null) {
                                    jMo13136b = -1;
                                } else {
                                    jMo13136b = abstractC9107y.mo13136b();
                                }
                                if (jMo13136b > 0) {
                                    StringBuilder sb19 = new StringBuilder(str);
                                    sb19.append(i10);
                                    sb19.append(" had non-zero Content-Length: ");
                                    if (abstractC9107y == null) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                    }
                                    sb19.append(lValueOf);
                                    throw new ProtocolException(sb19.toString());
                                }
                            }
                            return c9106xM17352a2;
                        }
                        z14 = true;
                        if (z14) {
                            C9106x.a aVarM18562c12 = c9988c.m18562c(false);
                            C5207g.m11108c(aVarM18562c12);
                            if (z12) {
                                abstractC9093k.getClass();
                                C5207g.m11111f(c9990e, "call");
                            }
                            aVarM18562c12.f47575a = c9101s;
                            aVarM18562c12.f47579e = c8077a.f43871e;
                            aVarM18562c12.f47585k = jCurrentTimeMillis;
                            aVarM18562c12.f47586l = System.currentTimeMillis();
                            c9106xM17352a = aVarM18562c12.m17352a();
                            i10 = c9106xM17352a.f47566d;
                        }
                        abstractC9093k.getClass();
                        C5207g.m11111f(c9990e, "call");
                        if (this.f51693a) {
                            C9106x.a aVar110 = new C9106x.a(c9106xM17352a);
                            aVar110.f47581g = c9988c.m18561b(c9106xM17352a);
                            c9106xM17352a2 = aVar110.m17352a();
                        } else {
                            C9106x.a aVar111 = new C9106x.a(c9106xM17352a);
                            aVar111.f47581g = c9988c.m18561b(c9106xM17352a);
                            c9106xM17352a2 = aVar111.m17352a();
                        }
                        if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                            interfaceC10264d.mo19229g().m15979k();
                        } else {
                            interfaceC10264d.mo19229g().m15979k();
                        }
                        if (i10 != 204) {
                            abstractC9107y = c9106xM17352a2.f47569g;
                            if (abstractC9107y == null) {
                                jMo13136b = -1;
                            } else {
                                jMo13136b = abstractC9107y.mo13136b();
                            }
                            if (jMo13136b > 0) {
                                StringBuilder sb110 = new StringBuilder(str);
                                sb110.append(i10);
                                sb110.append(" had non-zero Content-Length: ");
                                if (abstractC9107y == null) {
                                    lValueOf = null;
                                } else {
                                    lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                }
                                sb110.append(lValueOf);
                                throw new ProtocolException(sb110.toString());
                            }
                        } else {
                            abstractC9107y = c9106xM17352a2.f47569g;
                            if (abstractC9107y == null) {
                                jMo13136b = -1;
                            } else {
                                jMo13136b = abstractC9107y.mo13136b();
                            }
                            if (jMo13136b > 0) {
                                StringBuilder sb111 = new StringBuilder(str);
                                sb111.append(i10);
                                sb111.append(" had non-zero Content-Length: ");
                                if (abstractC9107y == null) {
                                    lValueOf = null;
                                } else {
                                    lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                }
                                sb111.append(lValueOf);
                                throw new ProtocolException(sb111.toString());
                            }
                        }
                        return c9106xM17352a2;
                    }
                    aVarM18562c = c9988c.m18562c(false);
                    C5207g.m11108c(aVarM18562c);
                    if (z11) {
                        abstractC9093k.getClass();
                        C5207g.m11111f(c9990e, "call");
                        aVar = aVarM18562c;
                        z11 = false;
                    } else {
                        aVar = aVarM18562c;
                    }
                    aVar.f47575a = c9101s;
                    aVar.f47579e = c8077a.f43871e;
                    aVar.f47585k = jCurrentTimeMillis;
                    z12 = z11;
                    aVar.f47586l = System.currentTimeMillis();
                    c9106xM17352a = aVar.m17352a();
                    i10 = c9106xM17352a.f47566d;
                    if (i10 != 100) {
                        if (102 <= i10) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z14 = false;
                        }
                        if (z14) {
                            C9106x.a aVarM18562c13 = c9988c.m18562c(false);
                            C5207g.m11108c(aVarM18562c13);
                            if (z12) {
                                abstractC9093k.getClass();
                                C5207g.m11111f(c9990e, "call");
                            }
                            aVarM18562c13.f47575a = c9101s;
                            aVarM18562c13.f47579e = c8077a.f43871e;
                            aVarM18562c13.f47585k = jCurrentTimeMillis;
                            aVarM18562c13.f47586l = System.currentTimeMillis();
                            c9106xM17352a = aVarM18562c13.m17352a();
                            i10 = c9106xM17352a.f47566d;
                        }
                        abstractC9093k.getClass();
                        C5207g.m11111f(c9990e, "call");
                        if (this.f51693a) {
                            C9106x.a aVar112 = new C9106x.a(c9106xM17352a);
                            aVar112.f47581g = c9988c.m18561b(c9106xM17352a);
                            c9106xM17352a2 = aVar112.m17352a();
                        } else {
                            C9106x.a aVar113 = new C9106x.a(c9106xM17352a);
                            aVar113.f47581g = c9988c.m18561b(c9106xM17352a);
                            c9106xM17352a2 = aVar113.m17352a();
                        }
                        if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                            interfaceC10264d.mo19229g().m15979k();
                        } else {
                            interfaceC10264d.mo19229g().m15979k();
                        }
                        if (i10 != 204) {
                            abstractC9107y = c9106xM17352a2.f47569g;
                            if (abstractC9107y == null) {
                                jMo13136b = -1;
                            } else {
                                jMo13136b = abstractC9107y.mo13136b();
                            }
                            if (jMo13136b > 0) {
                                StringBuilder sb112 = new StringBuilder(str);
                                sb112.append(i10);
                                sb112.append(" had non-zero Content-Length: ");
                                if (abstractC9107y == null) {
                                    lValueOf = null;
                                } else {
                                    lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                }
                                sb112.append(lValueOf);
                                throw new ProtocolException(sb112.toString());
                            }
                        } else {
                            abstractC9107y = c9106xM17352a2.f47569g;
                            if (abstractC9107y == null) {
                                jMo13136b = -1;
                            } else {
                                jMo13136b = abstractC9107y.mo13136b();
                            }
                            if (jMo13136b > 0) {
                                StringBuilder sb113 = new StringBuilder(str);
                                sb113.append(i10);
                                sb113.append(" had non-zero Content-Length: ");
                                if (abstractC9107y == null) {
                                    lValueOf = null;
                                } else {
                                    lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                                }
                                sb113.append(lValueOf);
                                throw new ProtocolException(sb113.toString());
                            }
                        }
                        return c9106xM17352a2;
                    }
                    z14 = true;
                    if (z14) {
                        C9106x.a aVarM18562c14 = c9988c.m18562c(false);
                        C5207g.m11108c(aVarM18562c14);
                        if (z12) {
                            abstractC9093k.getClass();
                            C5207g.m11111f(c9990e, "call");
                        }
                        aVarM18562c14.f47575a = c9101s;
                        aVarM18562c14.f47579e = c8077a.f43871e;
                        aVarM18562c14.f47585k = jCurrentTimeMillis;
                        aVarM18562c14.f47586l = System.currentTimeMillis();
                        c9106xM17352a = aVarM18562c14.m17352a();
                        i10 = c9106xM17352a.f47566d;
                    }
                    abstractC9093k.getClass();
                    C5207g.m11111f(c9990e, "call");
                    if (this.f51693a) {
                        C9106x.a aVar114 = new C9106x.a(c9106xM17352a);
                        aVar114.f47581g = c9988c.m18561b(c9106xM17352a);
                        c9106xM17352a2 = aVar114.m17352a();
                    } else {
                        C9106x.a aVar115 = new C9106x.a(c9106xM17352a);
                        aVar115.f47581g = c9988c.m18561b(c9106xM17352a);
                        c9106xM17352a2 = aVar115.m17352a();
                    }
                    if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                        interfaceC10264d.mo19229g().m15979k();
                    } else {
                        interfaceC10264d.mo19229g().m15979k();
                    }
                    if (i10 != 204) {
                        abstractC9107y = c9106xM17352a2.f47569g;
                        if (abstractC9107y == null) {
                            jMo13136b = -1;
                        } else {
                            jMo13136b = abstractC9107y.mo13136b();
                        }
                        if (jMo13136b > 0) {
                            StringBuilder sb114 = new StringBuilder(str);
                            sb114.append(i10);
                            sb114.append(" had non-zero Content-Length: ");
                            if (abstractC9107y == null) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                            }
                            sb114.append(lValueOf);
                            throw new ProtocolException(sb114.toString());
                        }
                    } else {
                        abstractC9107y = c9106xM17352a2.f47569g;
                        if (abstractC9107y == null) {
                            jMo13136b = -1;
                        } else {
                            jMo13136b = abstractC9107y.mo13136b();
                        }
                        if (jMo13136b > 0) {
                            StringBuilder sb115 = new StringBuilder(str);
                            sb115.append(i10);
                            sb115.append(" had non-zero Content-Length: ");
                            if (abstractC9107y == null) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                            }
                            sb115.append(lValueOf);
                            throw new ProtocolException(sb115.toString());
                        }
                    }
                    return c9106xM17352a2;
                    if (iOException != null) {
                        throw e;
                    }
                    C8656b.m16899g(iOException, e);
                    throw iOException;
                }
            } catch (IOException e21) {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
                c9988c.m18563d(e21);
                throw e21;
            }
        } catch (IOException e22) {
            e = e22;
        }
        if (aVarM18562c != null) {
            aVarM18562c = c9988c.m18562c(false);
            C5207g.m11108c(aVarM18562c);
            if (z11) {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
                aVar = aVarM18562c;
                z11 = false;
            } else {
                aVar = aVarM18562c;
            }
            aVar.f47575a = c9101s;
            aVar.f47579e = c8077a.f43871e;
            aVar.f47585k = jCurrentTimeMillis;
            z12 = z11;
            aVar.f47586l = System.currentTimeMillis();
            c9106xM17352a = aVar.m17352a();
            i10 = c9106xM17352a.f47566d;
            if (i10 != 100) {
                if (102 <= i10 || i10 >= 200) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    z14 = false;
                }
                if (z14) {
                    C9106x.a aVarM18562c15 = c9988c.m18562c(false);
                    C5207g.m11108c(aVarM18562c15);
                    if (z12) {
                        abstractC9093k.getClass();
                        C5207g.m11111f(c9990e, "call");
                    }
                    aVarM18562c15.f47575a = c9101s;
                    aVarM18562c15.f47579e = c8077a.f43871e;
                    aVarM18562c15.f47585k = jCurrentTimeMillis;
                    aVarM18562c15.f47586l = System.currentTimeMillis();
                    c9106xM17352a = aVarM18562c15.m17352a();
                    i10 = c9106xM17352a.f47566d;
                }
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
                if (this.f51693a || i10 != 101) {
                    C9106x.a aVar116 = new C9106x.a(c9106xM17352a);
                    aVar116.f47581g = c9988c.m18561b(c9106xM17352a);
                    c9106xM17352a2 = aVar116.m17352a();
                } else {
                    C9106x.a aVar20 = new C9106x.a(c9106xM17352a);
                    aVar20.f47581g = C9347b.f48084c;
                    c9106xM17352a2 = aVar20.m17352a();
                }
                if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection")) || C7661i.m15249O2("close", C9106x.m17348b(c9106xM17352a2, "Connection"))) {
                    interfaceC10264d.mo19229g().m15979k();
                }
                if (i10 != 204 || i10 == 205) {
                    abstractC9107y = c9106xM17352a2.f47569g;
                    if (abstractC9107y == null) {
                        jMo13136b = -1;
                    } else {
                        jMo13136b = abstractC9107y.mo13136b();
                    }
                    if (jMo13136b > 0) {
                        StringBuilder sb116 = new StringBuilder(str);
                        sb116.append(i10);
                        sb116.append(" had non-zero Content-Length: ");
                        if (abstractC9107y == null) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                        }
                        sb116.append(lValueOf);
                        throw new ProtocolException(sb116.toString());
                    }
                }
                return c9106xM17352a2;
            }
            z14 = true;
            if (z14) {
                C9106x.a aVarM18562c16 = c9988c.m18562c(false);
                C5207g.m11108c(aVarM18562c16);
                if (z12) {
                    abstractC9093k.getClass();
                    C5207g.m11111f(c9990e, "call");
                }
                aVarM18562c16.f47575a = c9101s;
                aVarM18562c16.f47579e = c8077a.f43871e;
                aVarM18562c16.f47585k = jCurrentTimeMillis;
                aVarM18562c16.f47586l = System.currentTimeMillis();
                c9106xM17352a = aVarM18562c16.m17352a();
                i10 = c9106xM17352a.f47566d;
            }
            abstractC9093k.getClass();
            C5207g.m11111f(c9990e, "call");
            if (this.f51693a) {
                C9106x.a aVar117 = new C9106x.a(c9106xM17352a);
                aVar117.f47581g = c9988c.m18561b(c9106xM17352a);
                c9106xM17352a2 = aVar117.m17352a();
            } else {
                C9106x.a aVar118 = new C9106x.a(c9106xM17352a);
                aVar118.f47581g = c9988c.m18561b(c9106xM17352a);
                c9106xM17352a2 = aVar118.m17352a();
            }
            if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                interfaceC10264d.mo19229g().m15979k();
            } else {
                interfaceC10264d.mo19229g().m15979k();
            }
            if (i10 != 204) {
                abstractC9107y = c9106xM17352a2.f47569g;
                if (abstractC9107y == null) {
                    jMo13136b = -1;
                } else {
                    jMo13136b = abstractC9107y.mo13136b();
                }
                if (jMo13136b > 0) {
                    StringBuilder sb117 = new StringBuilder(str);
                    sb117.append(i10);
                    sb117.append(" had non-zero Content-Length: ");
                    if (abstractC9107y == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                    }
                    sb117.append(lValueOf);
                    throw new ProtocolException(sb117.toString());
                }
            } else {
                abstractC9107y = c9106xM17352a2.f47569g;
                if (abstractC9107y == null) {
                    jMo13136b = -1;
                } else {
                    jMo13136b = abstractC9107y.mo13136b();
                }
                if (jMo13136b > 0) {
                    StringBuilder sb118 = new StringBuilder(str);
                    sb118.append(i10);
                    sb118.append(" had non-zero Content-Length: ");
                    if (abstractC9107y == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                    }
                    sb118.append(lValueOf);
                    throw new ProtocolException(sb118.toString());
                }
            }
            return c9106xM17352a2;
        }
        aVar = aVarM18562c;
        aVar.f47575a = c9101s;
        aVar.f47579e = c8077a.f43871e;
        aVar.f47585k = jCurrentTimeMillis;
        z12 = z11;
        aVar.f47586l = System.currentTimeMillis();
        c9106xM17352a = aVar.m17352a();
        i10 = c9106xM17352a.f47566d;
        if (i10 != 100) {
            if (102 <= i10) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z13) {
                z14 = false;
            }
            if (z14) {
                C9106x.a aVarM18562c17 = c9988c.m18562c(false);
                C5207g.m11108c(aVarM18562c17);
                if (z12) {
                    abstractC9093k.getClass();
                    C5207g.m11111f(c9990e, "call");
                }
                aVarM18562c17.f47575a = c9101s;
                aVarM18562c17.f47579e = c8077a.f43871e;
                aVarM18562c17.f47585k = jCurrentTimeMillis;
                aVarM18562c17.f47586l = System.currentTimeMillis();
                c9106xM17352a = aVarM18562c17.m17352a();
                i10 = c9106xM17352a.f47566d;
            }
            abstractC9093k.getClass();
            C5207g.m11111f(c9990e, "call");
            if (this.f51693a) {
                C9106x.a aVar119 = new C9106x.a(c9106xM17352a);
                aVar119.f47581g = c9988c.m18561b(c9106xM17352a);
                c9106xM17352a2 = aVar119.m17352a();
            } else {
                C9106x.a aVar1110 = new C9106x.a(c9106xM17352a);
                aVar1110.f47581g = c9988c.m18561b(c9106xM17352a);
                c9106xM17352a2 = aVar1110.m17352a();
            }
            if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
                interfaceC10264d.mo19229g().m15979k();
            } else {
                interfaceC10264d.mo19229g().m15979k();
            }
            if (i10 != 204) {
                abstractC9107y = c9106xM17352a2.f47569g;
                if (abstractC9107y == null) {
                    jMo13136b = -1;
                } else {
                    jMo13136b = abstractC9107y.mo13136b();
                }
                if (jMo13136b > 0) {
                    StringBuilder sb119 = new StringBuilder(str);
                    sb119.append(i10);
                    sb119.append(" had non-zero Content-Length: ");
                    if (abstractC9107y == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                    }
                    sb119.append(lValueOf);
                    throw new ProtocolException(sb119.toString());
                }
            } else {
                abstractC9107y = c9106xM17352a2.f47569g;
                if (abstractC9107y == null) {
                    jMo13136b = -1;
                } else {
                    jMo13136b = abstractC9107y.mo13136b();
                }
                if (jMo13136b > 0) {
                    StringBuilder sb1110 = new StringBuilder(str);
                    sb1110.append(i10);
                    sb1110.append(" had non-zero Content-Length: ");
                    if (abstractC9107y == null) {
                        lValueOf = null;
                    } else {
                        lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                    }
                    sb1110.append(lValueOf);
                    throw new ProtocolException(sb1110.toString());
                }
            }
            return c9106xM17352a2;
        }
        z14 = true;
        if (z14) {
            C9106x.a aVarM18562c18 = c9988c.m18562c(false);
            C5207g.m11108c(aVarM18562c18);
            if (z12) {
                abstractC9093k.getClass();
                C5207g.m11111f(c9990e, "call");
            }
            aVarM18562c18.f47575a = c9101s;
            aVarM18562c18.f47579e = c8077a.f43871e;
            aVarM18562c18.f47585k = jCurrentTimeMillis;
            aVarM18562c18.f47586l = System.currentTimeMillis();
            c9106xM17352a = aVarM18562c18.m17352a();
            i10 = c9106xM17352a.f47566d;
        }
        abstractC9093k.getClass();
        C5207g.m11111f(c9990e, "call");
        if (this.f51693a) {
            C9106x.a aVar1111 = new C9106x.a(c9106xM17352a);
            aVar1111.f47581g = c9988c.m18561b(c9106xM17352a);
            c9106xM17352a2 = aVar1111.m17352a();
        } else {
            C9106x.a aVar1112 = new C9106x.a(c9106xM17352a);
            aVar1112.f47581g = c9988c.m18561b(c9106xM17352a);
            c9106xM17352a2 = aVar1112.m17352a();
        }
        if (C7661i.m15249O2("close", c9106xM17352a2.f47563a.f47544c.m17305a("Connection"))) {
            interfaceC10264d.mo19229g().m15979k();
        } else {
            interfaceC10264d.mo19229g().m15979k();
        }
        if (i10 != 204) {
            abstractC9107y = c9106xM17352a2.f47569g;
            if (abstractC9107y == null) {
                jMo13136b = -1;
            } else {
                jMo13136b = abstractC9107y.mo13136b();
            }
            if (jMo13136b > 0) {
                StringBuilder sb1111 = new StringBuilder(str);
                sb1111.append(i10);
                sb1111.append(" had non-zero Content-Length: ");
                if (abstractC9107y == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                }
                sb1111.append(lValueOf);
                throw new ProtocolException(sb1111.toString());
            }
        } else {
            abstractC9107y = c9106xM17352a2.f47569g;
            if (abstractC9107y == null) {
                jMo13136b = -1;
            } else {
                jMo13136b = abstractC9107y.mo13136b();
            }
            if (jMo13136b > 0) {
                StringBuilder sb1112 = new StringBuilder(str);
                sb1112.append(i10);
                sb1112.append(" had non-zero Content-Length: ");
                if (abstractC9107y == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(abstractC9107y.mo13136b());
                }
                sb1112.append(lValueOf);
                throw new ProtocolException(sb1112.toString());
            }
        }
        return c9106xM17352a2;
        if (iOException != null) {
            throw e;
        }
        C8656b.m16899g(iOException, e);
        throw iOException;
    }
}
