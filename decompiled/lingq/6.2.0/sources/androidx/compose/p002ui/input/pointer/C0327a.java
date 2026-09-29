package androidx.compose.p002ui.input.pointer;

import java.util.List;
import p000.aq4;
import p000.d16;
import p000.fa4;
import p000.h66;
import p000.ol6;
import p000.tk5;
import p000.ui3;
import p000.vl6;
import p000.x44;
import p000.x66;
import p000.xfa;
import p000.y56;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0327a {

    /* JADX INFO: renamed from: a */
    public final aq4 f4116a;

    /* JADX INFO: renamed from: b */
    public boolean f4117b;

    /* JADX INFO: renamed from: c */
    public boolean f4118c;

    /* JADX INFO: renamed from: d */
    public boolean f4119d;

    /* JADX INFO: renamed from: e */
    public boolean f4120e;

    /* JADX INFO: renamed from: f */
    public final h66 f4121f = new h66();

    /* JADX INFO: renamed from: g */
    public final vl6 f4122g = new vl6();

    /* JADX INFO: renamed from: h */
    public final y56 f4123h = new y56(10);

    public C0327a(aq4 aq4Var) {
        this.f4116a = aq4Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX INFO: renamed from: a */
    public final void m1453a(long j, List list, boolean z) {
        y56 y56Var;
        long[] jArr;
        ol6 ol6Var;
        Object objM24942d;
        Object obj;
        int size = list.size();
        vl6 vl6Var = this.f4122g;
        vl6 vl6Var2 = vl6Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            y56Var = this.f4123h;
            if (i >= size) {
                break;
            }
            final d16 d16Var = (d16) list.get(i);
            if (d16Var.f34836I) {
                d16Var.f34835H = new ui3() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        this.f4094b.m1456d(d16Var);
                        return xfa.f68157a;
                    }
                };
                if (z2) {
                    x66 x66Var = vl6Var2.f65569a;
                    Object[] objArr = x66Var.f67830a;
                    int i2 = x66Var.f67832c;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (fa4.m11650l(((ol6) obj).f54536c, d16Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    ol6Var = (ol6) obj;
                    if (ol6Var != null) {
                        ol6Var.f54542i = true;
                        ol6Var.f54537d.m14167a(j);
                        if (z) {
                            Object objM24942d2 = y56Var.m24942d(j);
                            if (objM24942d2 == null) {
                                objM24942d2 = new h66();
                                y56Var.m24945g(objM24942d2, j);
                            }
                            ((h66) objM24942d2).m13090g(ol6Var);
                        }
                    } else {
                        z2 = false;
                        ol6Var = new ol6(d16Var);
                        ol6Var.f54537d.m14167a(j);
                        if (z) {
                            objM24942d = y56Var.m24942d(j);
                            if (objM24942d == null) {
                                objM24942d = new h66();
                                y56Var.m24945g(objM24942d, j);
                            }
                            ((h66) objM24942d).m13090g(ol6Var);
                        }
                        vl6Var2.f65569a.m24305c(ol6Var);
                    }
                } else {
                    ol6Var = new ol6(d16Var);
                    ol6Var.f54537d.m14167a(j);
                    if (z) {
                        objM24942d = y56Var.m24942d(j);
                        if (objM24942d == null) {
                            objM24942d = new h66();
                            y56Var.m24945g(objM24942d, j);
                        }
                        ((h66) objM24942d).m13090g(ol6Var);
                    }
                    vl6Var2.f65569a.m24305c(ol6Var);
                }
                vl6Var2 = ol6Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = y56Var.f69317b;
            Object[] objArr2 = y56Var.f69318c;
            long[] jArr3 = y56Var.f69316a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                h66 h66Var = (h66) objArr2[i8];
                                x66 x66Var2 = vl6Var.f65569a;
                                Object[] objArr3 = x66Var2.f67830a;
                                int i9 = x66Var2.f67832c;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((ol6) objArr3[i10]).m18101f(j3, h66Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        y56Var.m24939a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1454b(x44 x44Var, boolean z) {
        tk5 tk5Var = (tk5) x44Var.f67752c;
        aq4 aq4Var = this.f4116a;
        vl6 vl6Var = this.f4122g;
        boolean zMo18096a = vl6Var.mo18096a(tk5Var, aq4Var, x44Var, z);
        x66 x66Var = vl6Var.f65569a;
        if (!zMo18096a) {
            return false;
        }
        boolean z2 = true;
        this.f4117b = true;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((ol6) objArr[i2]).m18100e(x44Var, z) || z3;
        }
        Object[] objArr2 = x66Var.f67830a;
        int i3 = x66Var.f67832c;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((ol6) objArr2[i4]).m18099d(x44Var) || z4;
        }
        vl6Var.mo18097b(x44Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f4117b = false;
        if (this.f4120e) {
            this.f4120e = false;
            h66 h66Var = this.f4121f;
            int i5 = h66Var.f1294b;
            for (int i6 = 0; i6 < i5; i6++) {
                m1456d((d16) h66Var.m717b(i6));
            }
            h66Var.m13093j();
        }
        if (this.f4118c) {
            this.f4118c = false;
            m1455c();
        }
        if (this.f4119d) {
            this.f4119d = false;
            vl6Var.f65569a.m24310h();
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1455c() {
        if (this.f4117b) {
            this.f4118c = true;
            return;
        }
        vl6 vl6Var = this.f4122g;
        x66 x66Var = vl6Var.f65569a;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ol6) objArr[i2]).m18098c();
        }
        if (this.f4119d) {
            this.f4119d = true;
        } else {
            vl6Var.f65569a.m24310h();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m1456d(d16 d16Var) {
        if (this.f4117b) {
            this.f4120e = true;
            this.f4121f.m13090g(d16Var);
            return;
        }
        vl6 vl6Var = this.f4122g;
        h66 h66Var = vl6Var.f65570b;
        h66Var.m13093j();
        h66Var.m13090g(vl6Var);
        while (h66Var.m720e()) {
            vl6 vl6Var2 = (vl6) h66Var.m13095l(h66Var.f1294b - 1);
            int i = 0;
            while (true) {
                x66 x66Var = vl6Var2.f65569a;
                if (i < x66Var.f67832c) {
                    ol6 ol6Var = (ol6) x66Var.f67830a[i];
                    if (fa4.m11650l(ol6Var.f54536c, d16Var)) {
                        vl6Var2.f65569a.m24313k(ol6Var);
                        ol6Var.m18098c();
                    } else {
                        h66Var.m13090g(ol6Var);
                        i++;
                    }
                }
            }
        }
    }
}
