package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vx9 {

    /* JADX INFO: renamed from: d */
    public static final vx9 f66064d = new vx9(0, 0, null, null, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a */
    public final he9 f66065a;

    /* JADX INFO: renamed from: b */
    public final j37 f66066b;

    /* JADX INFO: renamed from: c */
    public final i97 f66067c;

    public vx9(long j, long j2, bc3 bc3Var, bb3 bb3Var, long j3, int i, long j4, int i2) {
        this(new he9((i2 & 1) != 0 ? aa1.f412k : j, (i2 & 2) != 0 ? zx9.f72359c : j2, (i2 & 4) != 0 ? null : bc3Var, (wb3) null, (xb3) null, (i2 & 32) != 0 ? null : bb3Var, (String) null, (i2 & 128) != 0 ? zx9.f72359c : j3, (oa0) null, (yv9) null, (xi5) null, aa1.f412k, (rt9) null, (l39) null, (g97) null, (ml2) null), new j37((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? zx9.f72359c : j4, null, null, null, 0, 0, null), null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: a */
    public static p000.vx9 m23583a(p000.vx9 r35, p000.vi0 r36, p000.wb3 r37, int r38) {
        /*
            r0 = r35
            r1 = r36
            he9 r2 = r0.f66065a
            xv9 r2 = r2.f42264a
            float r2 = r2.mo24175c()
            he9 r3 = r0.f66065a
            long r6 = r3.f42265b
            bc3 r8 = r3.f42266c
            r4 = r38 & 16
            if (r4 == 0) goto L1a
            wb3 r4 = r3.f42267d
            r9 = r4
            goto L1c
        L1a:
            r9 = r37
        L1c:
            xb3 r10 = r3.f42268e
            xa3 r11 = r3.f42269f
            java.lang.String r12 = r3.f42270g
            long r13 = r3.f42271h
            oa0 r15 = r3.f42272i
            yv9 r4 = r3.f42273j
            xi5 r5 = r3.f42274k
            r16 = r4
            r17 = r5
            long r4 = r3.f42275l
            r18 = r4
            rt9 r4 = r3.f42276m
            l39 r5 = r3.f42277n
            ml2 r3 = r3.f42279p
            r23 = r3
            j37 r3 = r0.f66066b
            r20 = r4
            int r4 = r3.f45012a
            r25 = r4
            int r4 = r3.f45013b
            r26 = r4
            r21 = r5
            long r4 = r3.f45014c
            r27 = r4
            aw9 r4 = r3.f45015d
            i97 r5 = r0.f66067c
            rc5 r0 = r3.f45017f
            r31 = r0
            int r0 = r3.f45018g
            r32 = r0
            int r0 = r3.f45019h
            ax9 r3 = r3.f45020i
            r35.getClass()
            r33 = r0
            vx9 r0 = new vx9
            r29 = r4
            he9 r4 = new he9
            r24 = 0
            r34 = r3
            if (r5 == 0) goto L72
            g97 r3 = r5.f43742a
            r22 = r3
            goto L74
        L72:
            r22 = r24
        L74:
            wv9 r3 = p000.wv9.f67395a
            if (r1 != 0) goto L7b
        L78:
            r1 = r5
            r5 = r3
            goto Laa
        L7b:
            r35 = r3
            boolean r3 = r1 instanceof p000.pd9
            if (r3 == 0) goto L9c
            pd9 r1 = (p000.pd9) r1
            r37 = r4
            long r3 = r1.f55989a
            long r1 = p000.omd.m18135Y(r2, r3)
            r3 = 16
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L97
            xa1 r3 = new xa1
            r3.<init>(r1)
            goto L99
        L97:
            r3 = r35
        L99:
            r4 = r37
            goto L78
        L9c:
            r37 = r4
            boolean r3 = r1 instanceof p000.i39
            if (r3 == 0) goto Lc0
            xi0 r3 = new xi0
            i39 r1 = (p000.i39) r1
            r3.<init>(r1, r2)
            goto L99
        Laa:
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23)
            r2 = r24
            j37 r24 = new j37
            if (r1 == 0) goto Lb5
            a97 r2 = r1.f43743b
        Lb5:
            r30 = r2
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34)
            r2 = r24
            r0.<init>(r4, r2, r1)
            return r0
        Lc0:
            r2 = r24
            p000.gm5.m12750e()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vx9.m23583a(vx9, vi0, wb3, int):vx9");
    }

    /* JADX INFO: renamed from: b */
    public static vx9 m23584b(vx9 vx9Var, long j, long j2, bc3 bc3Var, wb3 wb3Var, xa3 xa3Var, long j3, rt9 rt9Var, l39 l39Var, int i, long j4, rc5 rc5Var, int i2) {
        xv9 xa1Var;
        i97 i97Var = AbstractC3122is.f44468a;
        long jMo24173a = (i2 & 1) != 0 ? vx9Var.f66065a.f42264a.mo24173a() : j;
        long j5 = (i2 & 2) != 0 ? vx9Var.f66065a.f42265b : j2;
        bc3 bc3Var2 = (i2 & 4) != 0 ? vx9Var.f66065a.f42266c : bc3Var;
        wb3 wb3Var2 = (i2 & 8) != 0 ? vx9Var.f66065a.f42267d : wb3Var;
        he9 he9Var = vx9Var.f66065a;
        xb3 xb3Var = he9Var.f42268e;
        xa3 xa3Var2 = (i2 & 32) != 0 ? he9Var.f42269f : xa3Var;
        String str = he9Var.f42270g;
        long j6 = (i2 & 128) != 0 ? he9Var.f42271h : j3;
        oa0 oa0Var = he9Var.f42272i;
        yv9 yv9Var = he9Var.f42273j;
        xi5 xi5Var = he9Var.f42274k;
        long j7 = he9Var.f42275l;
        rt9 rt9Var2 = (i2 & 4096) != 0 ? he9Var.f42276m : rt9Var;
        l39 l39Var2 = (i2 & 8192) != 0 ? he9Var.f42277n : l39Var;
        ml2 ml2Var = he9Var.f42279p;
        int i3 = (i2 & 32768) != 0 ? vx9Var.f66066b.f45012a : 3;
        int i4 = (i2 & 65536) != 0 ? vx9Var.f66066b.f45013b : i;
        long j8 = (i2 & 131072) != 0 ? vx9Var.f66066b.f45014c : j4;
        j37 j37Var = vx9Var.f66066b;
        aw9 aw9Var = j37Var.f45015d;
        i97 i97Var2 = (i2 & 524288) != 0 ? vx9Var.f66067c : i97Var;
        rc5 rc5Var2 = (i2 & 1048576) != 0 ? j37Var.f45017f : rc5Var;
        int i5 = j37Var.f45018g;
        int i6 = j37Var.f45019h;
        ax9 ax9Var = j37Var.f45020i;
        if (aa1.m199c(jMo24173a, he9Var.f42264a.mo24173a())) {
            xa1Var = he9Var.f42264a;
        } else {
            xa1Var = jMo24173a != 16 ? new xa1(jMo24173a) : wv9.f67395a;
        }
        return new vx9(new he9(xa1Var, j5, bc3Var2, wb3Var2, xb3Var, xa3Var2, str, j6, oa0Var, yv9Var, xi5Var, j7, rt9Var2, l39Var2, i97Var2 != null ? i97Var2.f43742a : null, ml2Var), new j37(i3, i4, j8, aw9Var, i97Var2 != null ? i97Var2.f43743b : null, rc5Var2, i5, i6, ax9Var), i97Var2);
    }

    /* JADX INFO: renamed from: f */
    public static vx9 m23585f(vx9 vx9Var, long j, long j2, bc3 bc3Var, wb3 wb3Var, long j3, rt9 rt9Var, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? zx9.f72359c : j2;
        bc3 bc3Var2 = (i2 & 4) != 0 ? null : bc3Var;
        wb3 wb3Var2 = (i2 & 8) != 0 ? null : wb3Var;
        long j6 = (i2 & 128) != 0 ? zx9.f72359c : j3;
        long j7 = aa1.f412k;
        rt9 rt9Var2 = (i2 & 4096) != 0 ? null : rt9Var;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? zx9.f72359c : j4;
        he9 he9VarM13812a = ie9.m13812a(vx9Var.f66065a, j, null, Float.NaN, j5, bc3Var2, wb3Var2, null, null, null, j6, null, null, null, j7, rt9Var2, null, null, null);
        j37 j37VarM14787a = k37.m14787a(vx9Var.f66066b, i3, 0, j8, null, null, null, 0, 0, null);
        return (vx9Var.f66065a == he9VarM13812a && vx9Var.f66066b == j37VarM14787a) ? vx9Var : new vx9(he9VarM13812a, j37VarM14787a);
    }

    /* JADX INFO: renamed from: c */
    public final long m23586c() {
        return this.f66065a.f42264a.mo24173a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23587d(vx9 vx9Var) {
        if (this != vx9Var) {
            return fa4.m11650l(this.f66066b, vx9Var.f66066b) && this.f66065a.m13210b(vx9Var.f66065a);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final vx9 m23588e(vx9 vx9Var) {
        return (vx9Var == null || vx9Var.equals(f66064d)) ? this : new vx9(this.f66065a.m13212d(vx9Var.f66065a), this.f66066b.m14282a(vx9Var.f66066b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx9)) {
            return false;
        }
        vx9 vx9Var = (vx9) obj;
        return fa4.m11650l(this.f66065a, vx9Var.f66065a) && fa4.m11650l(this.f66066b, vx9Var.f66066b) && fa4.m11650l(this.f66067c, vx9Var.f66067c);
    }

    public final int hashCode() {
        int iHashCode = (this.f66066b.hashCode() + (this.f66065a.hashCode() * 31)) * 31;
        i97 i97Var = this.f66067c;
        return iHashCode + (i97Var != null ? i97Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) aa1.m205i(m23586c()));
        sb.append(", brush=");
        he9 he9Var = this.f66065a;
        sb.append(he9Var.f42264a.mo24174b());
        sb.append(", alpha=");
        sb.append(he9Var.f42264a.mo24175c());
        sb.append(", fontSize=");
        sb.append((Object) zx9.m25850e(he9Var.f42265b));
        sb.append(", fontWeight=");
        sb.append(he9Var.f42266c);
        sb.append(", fontStyle=");
        sb.append(he9Var.f42267d);
        sb.append(", fontSynthesis=");
        sb.append(he9Var.f42268e);
        sb.append(", fontFamily=");
        sb.append(he9Var.f42269f);
        sb.append(", fontFeatureSettings=");
        sb.append(he9Var.f42270g);
        sb.append(", letterSpacing=");
        sb.append((Object) zx9.m25850e(he9Var.f42271h));
        sb.append(", baselineShift=");
        sb.append(he9Var.f42272i);
        sb.append(", textGeometricTransform=");
        sb.append(he9Var.f42273j);
        sb.append(", localeList=");
        sb.append(he9Var.f42274k);
        sb.append(", background=");
        ux5.m23002y(he9Var.f42275l, ", textDecoration=", sb);
        sb.append(he9Var.f42276m);
        sb.append(", shadow=");
        sb.append(he9Var.f42277n);
        sb.append(", drawStyle=");
        sb.append(he9Var.f42279p);
        sb.append(", textAlign=");
        j37 j37Var = this.f66066b;
        sb.append((Object) ks9.m15663b(j37Var.f45012a));
        sb.append(", textDirection=");
        sb.append((Object) vt9.m23544a(j37Var.f45013b));
        sb.append(", lineHeight=");
        sb.append((Object) zx9.m25850e(j37Var.f45014c));
        sb.append(", textIndent=");
        sb.append(j37Var.f45015d);
        sb.append(", platformStyle=");
        sb.append(this.f66067c);
        sb.append(", lineHeightStyle=");
        sb.append(j37Var.f45017f);
        sb.append(", lineBreak=");
        sb.append((Object) hc5.m13193a(j37Var.f45018g));
        sb.append(", hyphens=");
        sb.append((Object) kx3.m15711a(j37Var.f45019h));
        sb.append(", textMotion=");
        sb.append(j37Var.f45020i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vx9(he9 he9Var, j37 j37Var) {
        g97 g97Var = he9Var.f42278o;
        a97 a97Var = j37Var.f45016e;
        this(he9Var, j37Var, (g97Var == null && a97Var == null) ? null : new i97(g97Var, a97Var));
    }

    public vx9(he9 he9Var, j37 j37Var, i97 i97Var) {
        this.f66065a = he9Var;
        this.f66066b = j37Var;
        this.f66067c = i97Var;
    }
}
