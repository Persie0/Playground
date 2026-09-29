package p000;

import com.google.android.gms.internal.measurement.zzyg;
import com.google.android.gms.internal.measurement.zzyv;
import com.google.android.gms.internal.measurement.zzzg;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class rmd implements qmd, dnd {

    /* JADX INFO: renamed from: i */
    public static final String f59558i = new String();

    /* JADX INFO: renamed from: a */
    public final Level f59559a;

    /* JADX INFO: renamed from: b */
    public final long f59560b;

    /* JADX INFO: renamed from: c */
    public vmd f59561c;

    /* JADX INFO: renamed from: d */
    public bnd f59562d;

    /* JADX INFO: renamed from: e */
    public ind f59563e;

    /* JADX INFO: renamed from: f */
    public vfb f59564f;

    /* JADX INFO: renamed from: g */
    public Object[] f59565g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ qn3 f59566h;

    public rmd(qn3 qn3Var, Level level) {
        Objects.requireNonNull(qn3Var);
        this.f59566h = qn3Var;
        sfb.f60802a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f59561c = null;
        this.f59562d = null;
        this.f59563e = null;
        this.f59564f = null;
        this.f59565g = null;
        dja.m10418b(level, "level");
        this.f59559a = level;
        this.f59560b = nanos;
    }

    @Override // p000.dnd
    /* JADX INFO: renamed from: a */
    public final dnd mo10511a() {
        and andVar = new and();
        andVar.f937b = 0;
        if (this.f59562d == null) {
            this.f59562d = andVar;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    @Override // p000.dnd
    /* JADX INFO: renamed from: b */
    public final void mo10512b(String str, Object[] objArr) {
        boolean z;
        vmd vmdVar;
        int iM23436l;
        int i;
        fnd fndVar;
        bnd bndVar = this.f59562d;
        zmd zmdVar = bnd.f8756a;
        if (bndVar == null) {
            ((xfb) sfb.f60802a).getClass();
            xfb.f68158b.getClass();
            this.f59562d = zmdVar;
        }
        cnd cndVarM15341a = this.f59562d;
        if (cndVarM15341a != zmdVar) {
            vmd vmdVar2 = this.f59561c;
            if (vmdVar2 != null && vmdVar2.f65626b > 0) {
                dja.m10418b(cndVarM15341a, "logSiteKey");
                int i2 = vmdVar2.f65626b;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (umd.f64097f.equals(vmdVar2.mo358h(i3))) {
                        cndVarM15341a = knd.m15341a(cndVarM15341a, vmdVar2.mo359i(i3));
                    }
                }
            }
        } else {
            cndVarM15341a = null;
        }
        afa afaVarM20717d = m20717d();
        int iMo357g = afaVarM20717d.mo357g();
        for (int i4 = 0; i4 < iMo357g; i4++) {
            if (afaVarM20717d.mo358h(i4).f37584a == "eye3tag") {
                if (afaVarM20717d.mo360j(umd.f64092a) != null) {
                    break;
                }
                end endVar = umd.f64100i;
                if (afaVarM20717d.mo360j(endVar) != null) {
                    break;
                }
                m20718e(endVar, zzyv.SMALL);
                break;
            }
        }
        vmd vmdVar3 = this.f59561c;
        if (vmdVar3 != null) {
            if (cndVarM15341a != null) {
                pmd.m19402b(vmdVar3);
                ind indVarM17500b = nmd.m17500b(this.f59561c, cndVarM15341a);
                ind indVarM14565b = jnd.m14565b(this.f59561c, cndVarM15341a);
                fnd fndVar2 = ind.f44335a;
                if (indVarM17500b == null) {
                    indVarM17500b = indVarM14565b;
                } else if (indVarM14565b != null && indVarM17500b != fndVar2 && indVarM14565b != (fndVar = ind.f44336b)) {
                    if (indVarM14565b == fndVar2 || indVarM17500b == fndVar) {
                        indVarM17500b = indVarM14565b;
                    } else {
                        indVarM17500b = new gnd(indVarM17500b, indVarM14565b);
                    }
                }
                this.f59563e = indVarM17500b;
                z = indVarM17500b != fndVar2;
            }
            vmd vmdVar4 = this.f59561c;
            end endVar2 = umd.f64100i;
            zzyv zzyvVar = (zzyv) vmdVar4.mo360j(endVar2);
            if (zzyvVar != null) {
                vmd vmdVar5 = this.f59561c;
                if (vmdVar5 != null && (iM23436l = vmdVar5.m23436l(endVar2)) >= 0) {
                    int i5 = iM23436l + iM23436l;
                    int i6 = i5 + 2;
                    while (true) {
                        i = vmdVar5.f65626b;
                        if (i6 >= i + i) {
                            break;
                        }
                        Object obj = vmdVar5.f65625a[i6];
                        if (!obj.equals(endVar2)) {
                            Object[] objArr2 = vmdVar5.f65625a;
                            objArr2[i5] = obj;
                            objArr2[i5 + 1] = objArr2[i6 + 1];
                            i5 += 2;
                        }
                        i6 += 2;
                    }
                    vmdVar5.f65626b = i - ((i6 - i5) >> 1);
                    while (i5 < i6) {
                        vmdVar5.f65625a[i5] = null;
                        i5++;
                    }
                }
                afa afaVarM20717d2 = m20717d();
                end endVar3 = umd.f64092a;
                m20718e(endVar3, new zzyg((Throwable) afaVarM20717d2.mo360j(endVar3), zzyvVar, tgb.m22029a(zzyvVar.zza())));
            }
        }
        ind indVar = this.f59563e;
        if (indVar != null) {
            int iM13382a = hnd.m13382a(indVar, cndVarM15341a, this.f59561c);
            if (z && iM13382a > 0 && (vmdVar = this.f59561c) != null) {
                vmdVar.m23435k(umd.f64096e, Integer.valueOf(iM13382a));
            }
            z &= iM13382a >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.f59565g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != f59558i) {
                rgb rgbVar = rgb.f59244b;
                this.f59564f = new vfb(str);
            }
            ((xfb) sfb.f60802a).getClass();
            ngb ngbVarMo4644b = cgb.f10033b.mo4644b();
            if (!ngbVarMo4644b.f52718a.isEmpty()) {
                afa afaVarM20717d3 = m20717d();
                end endVar4 = umd.f64099h;
                ngb ngbVar = (ngb) afaVarM20717d3.mo360j(endVar4);
                if (ngbVar != null) {
                    mgb mgbVar = ngbVar.f52718a;
                    if (!mgbVar.isEmpty()) {
                        mgb mgbVar2 = ngbVarMo4644b.f52718a;
                        if (!mgbVar2.isEmpty()) {
                            ngbVar = new ngb(new mgb(mgbVar2, mgbVar));
                        }
                        ngbVarMo4644b = ngbVar;
                    }
                }
                m20718e(endVar4, ngbVarMo4644b);
            }
            AbstractC3572sf abstractC3572sf = (AbstractC3572sf) this.f59566h.f57974a;
            try {
                ugb ugbVar = (ugb) ugb.f63908b.get();
                int i7 = ugbVar.f63909a + 1;
                ugbVar.f63909a = i7;
                if (i7 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i7 <= 100) {
                        abstractC3572sf.mo3705B(this);
                    } else {
                        qn3.m20045X("unbounded recursion in log statement", this);
                    }
                    ugbVar.close();
                } catch (Throwable th) {
                    try {
                        ugbVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (RuntimeException e) {
                try {
                    abstractC3572sf.mo3706C(e, this);
                } catch (zzzg e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                    String name = e3.getClass().getName();
                    String message = e3.getMessage();
                    StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(message);
                    qn3.m20045X(sb.toString(), this);
                    try {
                        e3.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // p000.dnd
    /* JADX INFO: renamed from: c */
    public final dnd mo10513c(Throwable th) {
        end endVar = umd.f64092a;
        dja.m10418b(endVar, "metadata key");
        if (th != null) {
            m20718e(endVar, th);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final afa m20717d() {
        vmd vmdVar = this.f59561c;
        return vmdVar != null ? vmdVar : snd.f61078a;
    }

    /* JADX INFO: renamed from: e */
    public final void m20718e(end endVar, Object obj) {
        if (this.f59561c == null) {
            vmd vmdVar = new vmd();
            vmdVar.f65625a = new Object[8];
            vmdVar.f65626b = 0;
            this.f59561c = vmdVar;
        }
        this.f59561c.m23435k(endVar, obj);
    }
}
