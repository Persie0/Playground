package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cad implements bzw, cak, cac {

    /* JADX INFO: renamed from: a */
    private final Object f4882a;

    /* JADX INFO: renamed from: b */
    private final caa f4883b;

    /* JADX INFO: renamed from: c */
    private final bzy f4884c;

    /* JADX INFO: renamed from: d */
    private final Context f4885d;

    /* JADX INFO: renamed from: e */
    private final bpc f4886e;

    /* JADX INFO: renamed from: f */
    private final Object f4887f;

    /* JADX INFO: renamed from: g */
    private final Class f4888g;

    /* JADX INFO: renamed from: h */
    private final bzs f4889h;

    /* JADX INFO: renamed from: i */
    private final int f4890i;

    /* JADX INFO: renamed from: j */
    private final int f4891j;

    /* JADX INFO: renamed from: k */
    private final bpe f4892k;

    /* JADX INFO: renamed from: l */
    private final cal f4893l;

    /* JADX INFO: renamed from: m */
    private final List f4894m;

    /* JADX INFO: renamed from: n */
    private final Executor f4895n;

    /* JADX INFO: renamed from: o */
    private bsz f4896o;

    /* JADX INFO: renamed from: p */
    private bsn f4897p;

    /* JADX INFO: renamed from: q */
    private long f4898q;

    /* JADX INFO: renamed from: r */
    private Drawable f4899r;

    /* JADX INFO: renamed from: s */
    private Drawable f4900s;

    /* JADX INFO: renamed from: t */
    private int f4901t;

    /* JADX INFO: renamed from: u */
    private int f4902u;

    /* JADX INFO: renamed from: v */
    private boolean f4903v;

    /* JADX INFO: renamed from: w */
    private RuntimeException f4904w;

    /* JADX INFO: renamed from: z */
    private volatile ljf f4907z;

    /* JADX INFO: renamed from: y */
    private final fky f4906y = fky.m8534d();

    /* JADX INFO: renamed from: x */
    private int f4905x = 1;

    public cad(Context context, bpc bpcVar, Object obj, Object obj2, Class cls, bzs bzsVar, int i, int i2, bpe bpeVar, cal calVar, caa caaVar, List list, bzy bzyVar, ljf ljfVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f4882a = obj;
        this.f4885d = context;
        this.f4886e = bpcVar;
        this.f4887f = obj2;
        this.f4888g = cls;
        this.f4889h = bzsVar;
        this.f4890i = i;
        this.f4891j = i2;
        this.f4892k = bpeVar;
        this.f4893l = calVar;
        this.f4883b = caaVar;
        this.f4894m = list;
        this.f4884c = bzyVar;
        this.f4907z = ljfVar;
        this.f4895n = executor;
        if (this.f4904w == null && bpcVar.f4045f.m2607a(boz.class)) {
            this.f4904w = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: renamed from: h */
    private static int m3351h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    /* JADX INFO: renamed from: i */
    private final Drawable m3352i() {
        int i;
        if (this.f4900s == null) {
            bzs bzsVar = this.f4889h;
            Drawable drawable = bzsVar.f4833e;
            this.f4900s = drawable;
            if (drawable == null && (i = bzsVar.f4834f) > 0) {
                this.f4900s = m3353o(i);
            }
        }
        return this.f4900s;
    }

    /* JADX INFO: renamed from: o */
    private final Drawable m3353o(int i) {
        Resources.Theme theme = this.f4889h.f4844p;
        if (theme == null) {
            theme = this.f4885d.getTheme();
        }
        Context context = this.f4885d;
        return bya.m3180a(context, context, i, theme);
    }

    /* JADX INFO: renamed from: p */
    private final void m3354p() {
        if (this.f4903v) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX INFO: renamed from: q */
    private final boolean m3355q() {
        bzy bzyVar = this.f4884c;
        return bzyVar == null || bzyVar.mo3328h(this);
    }

    /* JADX INFO: renamed from: r */
    private final void m3356r() {
        bzy bzyVar = this.f4884c;
        if (bzyVar != null) {
            bzyVar.mo3321a().mo3330j();
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m3357s(bsv bsvVar) {
        this.f4906y.m8537c();
        synchronized (this.f4882a) {
            int i = this.f4886e.f4044e;
            Log.w("Glide", "Load failed for [" + String.valueOf(this.f4887f) + "] with dimensions [" + this.f4901t + "x" + this.f4902u + "]", bsvVar);
            List listM3024a = bsvVar.m3024a();
            int size = listM3024a.size();
            for (int i2 = 0; i2 < size; i2++) {
            }
            this.f4897p = null;
            this.f4905x = 5;
            bzy bzyVar = this.f4884c;
            if (bzyVar != null) {
                bzyVar.mo3324d(this);
            }
            this.f4903v = true;
            try {
                List<caa> list = this.f4894m;
                if (list != null) {
                    for (caa caaVar : list) {
                        m3356r();
                        caaVar.mo3343l(bsvVar);
                    }
                }
                caa caaVar2 = this.f4883b;
                if (caaVar2 != null) {
                    m3356r();
                    caaVar2.mo3343l(bsvVar);
                }
                if (m3355q()) {
                    if (this.f4899r == null) {
                        this.f4899r = null;
                        int i3 = this.f4889h.f4832d;
                        if (i3 > 0) {
                            this.f4899r = m3353o(i3);
                        }
                    }
                    Drawable drawableM3352i = this.f4899r;
                    if (drawableM3352i == null) {
                        drawableM3352i = m3352i();
                    }
                    this.f4893l.mo3339e(drawableM3352i);
                }
                this.f4903v = false;
            } catch (Throwable th) {
                this.f4903v = false;
                throw th;
            }
        }
    }

    @Override // p000.cac
    /* JADX INFO: renamed from: a */
    public final Object mo3348a() {
        this.f4906y.m8537c();
        return this.f4882a;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: b */
    public final void mo3322b() {
        synchronized (this.f4882a) {
            m3354p();
            this.f4906y.m8537c();
            this.f4898q = SystemClock.elapsedRealtimeNanos();
            if (this.f4887f == null) {
                if (cbi.m3393n(this.f4890i, this.f4891j)) {
                    this.f4901t = this.f4890i;
                    this.f4902u = this.f4891j;
                }
                m3357s(new bsv("Received null model"));
                return;
            }
            int i = this.f4905x;
            if (i == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i == 4) {
                mo3350e(this.f4896o, 5);
                return;
            }
            List<caa> list = this.f4894m;
            if (list != null) {
                for (caa caaVar : list) {
                    if (caaVar instanceof bzu) {
                        throw null;
                    }
                }
            }
            this.f4905x = 3;
            if (cbi.m3393n(this.f4890i, this.f4891j)) {
                mo3358g(this.f4890i, this.f4891j);
            } else {
                this.f4893l.mo3338d(this);
            }
            int i2 = this.f4905x;
            if ((i2 == 2 || i2 == 3) && m3355q()) {
                this.f4893l.mo3340f(m3352i());
            }
        }
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: c */
    public final void mo3323c() {
        synchronized (this.f4882a) {
            m3354p();
            this.f4906y.m8537c();
            if (this.f4905x != 6) {
                m3354p();
                this.f4906y.m8537c();
                this.f4893l.mo3341j(this);
                bsn bsnVar = this.f4897p;
                bsz bszVar = null;
                if (bsnVar != null) {
                    synchronized (bsnVar.f4340c) {
                        bsnVar.f4338a.m3011g(bsnVar.f4339b);
                    }
                    this.f4897p = null;
                }
                bsz bszVar2 = this.f4896o;
                if (bszVar2 != null) {
                    this.f4896o = null;
                    bszVar = bszVar2;
                }
                bzy bzyVar = this.f4884c;
                if (bzyVar == null || bzyVar.mo3327g(this)) {
                    this.f4893l.mo3191a(m3352i());
                }
                this.f4905x = 6;
                if (bszVar != null) {
                    ((bst) bszVar).m3019f();
                }
            }
        }
    }

    @Override // p000.cac
    /* JADX INFO: renamed from: d */
    public final void mo3349d(bsv bsvVar) {
        m3357s(bsvVar);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x017e */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r11 = (p000.bst) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        r11 = (p000.bst) r11;
     */
    @Override // p000.cac
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3350e(bsz bszVar, int i) throws Throwable {
        Throwable th;
        Throwable th2;
        bst bstVar;
        boolean zM3335a;
        this.f4906y.m8537c();
        bsz bszVar2 = null;
        try {
            try {
                synchronized (this.f4882a) {
                    try {
                        this.f4897p = null;
                        if (bszVar == null) {
                            mo3349d(new bsv("Expected to receive a Resource<R> with an object of " + this.f4888g.toString() + " inside, but instead got null."));
                            return;
                        }
                        Object objMo3016c = bszVar.mo3016c();
                        try {
                            if (objMo3016c == null || !this.f4888g.isAssignableFrom(objMo3016c.getClass())) {
                                this.f4896o = null;
                                mo3349d(new bsv("Expected to receive an object of " + this.f4888g.toString() + " but instead got " + String.valueOf(objMo3016c != null ? objMo3016c.getClass() : "") + "{" + String.valueOf(objMo3016c) + "} inside Resource{" + bszVar.toString() + "}." + (objMo3016c != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                            } else {
                                bzy bzyVar = this.f4884c;
                                if (bzyVar == null || bzyVar.mo3329i(this)) {
                                    m3356r();
                                    this.f4905x = 4;
                                    this.f4896o = bszVar;
                                    if (this.f4886e.f4044e <= 3) {
                                        String simpleName = objMo3016c.getClass().getSimpleName();
                                        String strM3231D = bzq.m3231D(i);
                                        String strValueOf = String.valueOf(this.f4887f);
                                        int i2 = this.f4901t;
                                        int i3 = this.f4902u;
                                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.f4898q;
                                        double d = cbd.f4946a;
                                        double d2 = jElapsedRealtimeNanos;
                                        Double.isNaN(d2);
                                        double d3 = d2 * d;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Finished loading ");
                                        sb.append(simpleName);
                                        sb.append(" from ");
                                        sb.append(strM3231D);
                                        sb.append(" for ");
                                        sb.append(strValueOf);
                                        sb.append(" with size [");
                                        sb.append(i2);
                                        sb.append(BcwGDRhrTsnlj.etyUSf);
                                        sb.append(i3);
                                        sb.append("] in ");
                                        sb.append(d3);
                                        sb.append(" ms");
                                    }
                                    bzy bzyVar2 = this.f4884c;
                                    if (bzyVar2 != null) {
                                        bzyVar2.mo3325e(this);
                                    }
                                    this.f4903v = true;
                                    try {
                                        List<caa> list = this.f4894m;
                                        if (list != null) {
                                            zM3335a = false;
                                            for (caa caaVar : list) {
                                                caaVar.mo3344m(objMo3016c);
                                                if (caaVar instanceof bzu) {
                                                    zM3335a |= ((bzu) caaVar).m3335a();
                                                }
                                            }
                                        } else {
                                            zM3335a = false;
                                        }
                                        caa caaVar2 = this.f4883b;
                                        if (caaVar2 != null) {
                                            caaVar2.mo3344m(objMo3016c);
                                        }
                                        if (!zM3335a) {
                                            this.f4893l.mo3192b(objMo3016c);
                                        }
                                        this.f4903v = false;
                                        return;
                                    } catch (Throwable th3) {
                                        this.f4903v = false;
                                        throw th3;
                                    }
                                }
                                this.f4896o = null;
                                this.f4905x = 4;
                            }
                            bstVar.m3019f();
                            return;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        bszVar = null;
                    }
                    while (true) {
                    }
                    throw th2;
                }
                throw th2;
            } catch (Throwable th6) {
                th = th6;
                bszVar2 = bszVar;
                if (bszVar2 == null) {
                    throw th;
                }
                ((bst) bszVar2).m3019f();
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: f */
    public final void mo3326f() {
        synchronized (this.f4882a) {
            if (mo3334n()) {
                mo3323c();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v8 ??, still in use, count: 7, list:
          (r1v8 ?? I:bqn) from 0x007b: INVOKE (r11v5 ?? I:bst) = (r11v4 ?? I:brw), (r1v8 ?? I:bqn) VIRTUAL call: brw.a(bqn):bst A[Catch: all -> 0x01a5, MD:(bqn):bst (m)] (LINE:6)
          (r1v8 ?? I:bqn) from 0x008a: INVOKE (r12v2 ?? I:bsz) = (r11v7 ?? I:bub), (r1v8 ?? I:bqn) VIRTUAL call: bub.b(bqn):bsz A[Catch: all -> 0x01a5, MD:(bqn):bsz (m)] (LINE:8)
          (r1v8 ?? I:bqn) from 0x00b6: INVOKE (r11v11 ?? I:brw), (r1v8 ?? I:bqn), (r15v7 ?? I:bst) VIRTUAL call: brw.b(bqn, bst):void A[Catch: all -> 0x01a5, MD:(bqn, bst):void (m)] (LINE:13)
          (r1v8 ?? I:java.lang.Object) from 0x00c8: INVOKE (r11v17 ?? I:java.lang.Object) = (r11v16 ?? I:java.util.Map), (r1v8 ?? I:java.lang.Object) INTERFACE call: java.util.Map.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x01a5, MD:(java.lang.Object):V (c)] (LINE:14)
          (r1v8 ?? I:bqn) from 0x00fe: INVOKE (r8v5 ?? I:bsr), (r1v8 ?? I:bqn), (r1v5 ?? I:boolean), (r1v6 ?? I:boolean), (r3v1 ?? I:boolean) VIRTUAL call: bsr.i(bqn, boolean, boolean, boolean):void A[Catch: all -> 0x01a3, MD:(bqn, boolean, boolean, boolean):void (m)] (LINE:17)
          (r1v8 ?? I:java.lang.Object) from 0x016d: INVOKE (r0v16 ?? I:java.util.Map), (r1v8 ?? I:java.lang.Object), (r8v5 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x018c, MD:(K, V):V (c), TRY_LEAVE] (LINE:19)
          (r1v8 ?? I:bqn) from 0x00a8: INVOKE 
          (r28v0 ?? I:bst)
          (r12v2 ?? I:bsz)
          (r13v2 ?? I:boolean)
          (r1v8 ?? I:bqn)
          (r8v0 ?? I:ljf)
          (r16v1 ?? I:byte[])
          (r17v1 ?? I:byte[])
          (r18v1 ?? I:byte[])
          (r19v1 ?? I:byte[])
         DIRECT call: bst.<init>(bsz, boolean, bqn, ljf, byte[], byte[], byte[], byte[]):void A[Catch: all -> 0x01a5, MD:(bsz, boolean, bqn, ljf, byte[], byte[], byte[], byte[]):void (m)] (LINE:11)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p000.cak
    /* JADX INFO: renamed from: g */
    public final void mo3358g(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v8 ??, still in use, count: 7, list:
          (r1v8 ?? I:bqn) from 0x007b: INVOKE (r11v5 ?? I:bst) = (r11v4 ?? I:brw), (r1v8 ?? I:bqn) VIRTUAL call: brw.a(bqn):bst A[Catch: all -> 0x01a5, MD:(bqn):bst (m)] (LINE:6)
          (r1v8 ?? I:bqn) from 0x008a: INVOKE (r12v2 ?? I:bsz) = (r11v7 ?? I:bub), (r1v8 ?? I:bqn) VIRTUAL call: bub.b(bqn):bsz A[Catch: all -> 0x01a5, MD:(bqn):bsz (m)] (LINE:8)
          (r1v8 ?? I:bqn) from 0x00b6: INVOKE (r11v11 ?? I:brw), (r1v8 ?? I:bqn), (r15v7 ?? I:bst) VIRTUAL call: brw.b(bqn, bst):void A[Catch: all -> 0x01a5, MD:(bqn, bst):void (m)] (LINE:13)
          (r1v8 ?? I:java.lang.Object) from 0x00c8: INVOKE (r11v17 ?? I:java.lang.Object) = (r11v16 ?? I:java.util.Map), (r1v8 ?? I:java.lang.Object) INTERFACE call: java.util.Map.get(java.lang.Object):java.lang.Object A[Catch: all -> 0x01a5, MD:(java.lang.Object):V (c)] (LINE:14)
          (r1v8 ?? I:bqn) from 0x00fe: INVOKE (r8v5 ?? I:bsr), (r1v8 ?? I:bqn), (r1v5 ?? I:boolean), (r1v6 ?? I:boolean), (r3v1 ?? I:boolean) VIRTUAL call: bsr.i(bqn, boolean, boolean, boolean):void A[Catch: all -> 0x01a3, MD:(bqn, boolean, boolean, boolean):void (m)] (LINE:17)
          (r1v8 ?? I:java.lang.Object) from 0x016d: INVOKE (r0v16 ?? I:java.util.Map), (r1v8 ?? I:java.lang.Object), (r8v5 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x018c, MD:(K, V):V (c), TRY_LEAVE] (LINE:19)
          (r1v8 ?? I:bqn) from 0x00a8: INVOKE 
          (r28v0 ?? I:bst)
          (r12v2 ?? I:bsz)
          (r13v2 ?? I:boolean)
          (r1v8 ?? I:bqn)
          (r8v0 ?? I:ljf)
          (r16v1 ?? I:byte[])
          (r17v1 ?? I:byte[])
          (r18v1 ?? I:byte[])
          (r19v1 ?? I:byte[])
         DIRECT call: bst.<init>(bsz, boolean, bqn, ljf, byte[], byte[], byte[], byte[]):void A[Catch: all -> 0x01a5, MD:(bsz, boolean, bqn, ljf, byte[], byte[], byte[], byte[]):void (m)] (LINE:11)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // p000.bzw
    /* JADX INFO: renamed from: j */
    public final boolean mo3330j() {
        boolean z;
        synchronized (this.f4882a) {
            z = this.f4905x == 4;
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: k */
    public final boolean mo3331k() {
        boolean z;
        synchronized (this.f4882a) {
            z = this.f4905x == 6;
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: l */
    public final boolean mo3332l() {
        boolean z;
        synchronized (this.f4882a) {
            z = this.f4905x == 4;
        }
        return z;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: m */
    public final boolean mo3333m(bzw bzwVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        bzs bzsVar;
        bpe bpeVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        bzs bzsVar2;
        bpe bpeVar2;
        int size2;
        if (!(bzwVar instanceof cad)) {
            return false;
        }
        synchronized (this.f4882a) {
            i = this.f4890i;
            i2 = this.f4891j;
            obj = this.f4887f;
            cls = this.f4888g;
            bzsVar = this.f4889h;
            bpeVar = this.f4892k;
            List list = this.f4894m;
            size = list != null ? list.size() : 0;
        }
        cad cadVar = (cad) bzwVar;
        synchronized (cadVar.f4882a) {
            i3 = cadVar.f4890i;
            i4 = cadVar.f4891j;
            obj2 = cadVar.f4887f;
            cls2 = cadVar.f4888g;
            bzsVar2 = cadVar.f4889h;
            bpeVar2 = cadVar.f4892k;
            List list2 = cadVar.f4894m;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        char[] cArr = cbi.f4955a;
        if (obj != null) {
            if (!(obj instanceof bvi ? ((bvi) obj).m3095a() : obj.equals(obj2))) {
                return false;
            }
        } else if (obj2 != null) {
            return false;
        }
        return cls.equals(cls2) && bzsVar.equals(bzsVar2) && bpeVar == bpeVar2 && size == size2;
    }

    @Override // p000.bzw
    /* JADX INFO: renamed from: n */
    public final boolean mo3334n() {
        boolean z;
        synchronized (this.f4882a) {
            int i = this.f4905x;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f4882a) {
            obj = this.f4887f;
            cls = this.f4888g;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + aJFPpVSaoDO.TDSEb;
    }
}
