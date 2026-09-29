package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o90 implements am2, i90, ni4 {

    /* JADX INFO: renamed from: A */
    public float f54043A;

    /* JADX INFO: renamed from: B */
    public BlurMaskFilter f54044B;

    /* JADX INFO: renamed from: a */
    public final Path f54045a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f54046b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f54047c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final yk4 f54048d = new yk4(1, 0);

    /* JADX INFO: renamed from: e */
    public final yk4 f54049e;

    /* JADX INFO: renamed from: f */
    public final yk4 f54050f;

    /* JADX INFO: renamed from: g */
    public final yk4 f54051g;

    /* JADX INFO: renamed from: h */
    public final yk4 f54052h;

    /* JADX INFO: renamed from: i */
    public final RectF f54053i;

    /* JADX INFO: renamed from: j */
    public final RectF f54054j;

    /* JADX INFO: renamed from: k */
    public final RectF f54055k;

    /* JADX INFO: renamed from: l */
    public final RectF f54056l;

    /* JADX INFO: renamed from: m */
    public final RectF f54057m;

    /* JADX INFO: renamed from: n */
    public final Matrix f54058n;

    /* JADX INFO: renamed from: o */
    public final C0868b f54059o;

    /* JADX INFO: renamed from: p */
    public final tp4 f54060p;

    /* JADX INFO: renamed from: q */
    public final gv5 f54061q;

    /* JADX INFO: renamed from: r */
    public final j73 f54062r;

    /* JADX INFO: renamed from: s */
    public o90 f54063s;

    /* JADX INFO: renamed from: t */
    public o90 f54064t;

    /* JADX INFO: renamed from: u */
    public List f54065u;

    /* JADX INFO: renamed from: v */
    public final ArrayList f54066v;

    /* JADX INFO: renamed from: w */
    public final j9a f54067w;

    /* JADX INFO: renamed from: x */
    public boolean f54068x;

    /* JADX INFO: renamed from: y */
    public boolean f54069y;

    /* JADX INFO: renamed from: z */
    public yk4 f54070z;

    public o90(C0868b c0868b, tp4 tp4Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f54049e = new yk4(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f54050f = new yk4(mode2);
        yk4 yk4Var = new yk4(1, 0);
        this.f54051g = yk4Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        yk4 yk4Var2 = new yk4();
        yk4Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.f54052h = yk4Var2;
        this.f54053i = new RectF();
        this.f54054j = new RectF();
        this.f54055k = new RectF();
        this.f54056l = new RectF();
        this.f54057m = new RectF();
        this.f54058n = new Matrix();
        this.f54066v = new ArrayList();
        this.f54068x = true;
        this.f54043A = 0.0f;
        this.f54059o = c0868b;
        this.f54060p = tp4Var;
        List list = tp4Var.f62678h;
        if (tp4Var.f62691u == Layer$MatteType.INVERT) {
            yk4Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            yk4Var.setXfermode(new PorterDuffXfermode(mode));
        }
        C0852cm c0852cm = tp4Var.f62679i;
        c0852cm.getClass();
        j9a j9aVar = new j9a(c0852cm);
        this.f54067w = j9aVar;
        j9aVar.m14355b(this);
        if (list != null && !list.isEmpty()) {
            gv5 gv5Var = new gv5(list);
            this.f54061q = gv5Var;
            Iterator it = ((ArrayList) gv5Var.f41394d).iterator();
            while (it.hasNext()) {
                ((m90) it.next()).m16687a(this);
            }
            for (m90 m90Var : (ArrayList) this.f54061q.f41392b) {
                m17863e(m90Var);
                m90Var.m16687a(this);
            }
        }
        tp4 tp4Var2 = this.f54060p;
        if (tp4Var2.f62690t.isEmpty()) {
            if (true != this.f54068x) {
                this.f54068x = true;
                this.f54059o.invalidateSelf();
                return;
            }
            return;
        }
        j73 j73Var = new j73(tp4Var2.f62690t);
        this.f54062r = j73Var;
        j73Var.f50797b = true;
        j73Var.m16687a(new i9a(this, 3));
        boolean z = ((Float) this.f54062r.mo16692f()).floatValue() == 1.0f;
        if (z != this.f54068x) {
            this.f54068x = z;
            this.f54059o.invalidateSelf();
        }
        m17863e(this.f54062r);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        this.f54059o.invalidateSelf();
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
    }

    @Override // p000.ni4
    /* JADX INFO: renamed from: c */
    public final void mo9829c(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
        o90 o90Var = this.f54063s;
        tp4 tp4Var = this.f54060p;
        if (o90Var != null) {
            String str = o90Var.f54060p.f62673c;
            mi4 mi4Var3 = new mi4(mi4Var2);
            mi4Var3.f51357a.add(str);
            if (mi4Var.m16841a(i, this.f54063s.f54060p.f62673c)) {
                o90 o90Var2 = this.f54063s;
                mi4 mi4Var4 = new mi4(mi4Var3);
                mi4Var4.f51358b = o90Var2;
                arrayList.add(mi4Var4);
            }
            if (mi4Var.m16843c(i, this.f54063s.f54060p.f62673c) && mi4Var.m16844d(i, tp4Var.f62673c)) {
                this.f54063s.mo10093o(mi4Var, mi4Var.m16842b(i, this.f54063s.f54060p.f62673c) + i, arrayList, mi4Var3);
            }
        }
        String str2 = tp4Var.f62673c;
        String str3 = tp4Var.f62673c;
        if (mi4Var.m16843c(i, str2)) {
            if (!"__container".equals(str3)) {
                mi4 mi4Var5 = new mi4(mi4Var2);
                mi4Var5.f51357a.add(str3);
                if (mi4Var.m16841a(i, str3)) {
                    mi4 mi4Var6 = new mi4(mi4Var5);
                    mi4Var6.f51358b = this;
                    arrayList.add(mi4Var6);
                }
                mi4Var2 = mi4Var5;
            }
            if (mi4Var.m16844d(i, str3)) {
                mo10093o(mi4Var, mi4Var.m16842b(i, str3) + i, arrayList, mi4Var2);
            }
        }
    }

    @Override // p000.am2
    /* JADX INFO: renamed from: d */
    public void mo555d(RectF rectF, Matrix matrix, boolean z) {
        this.f54053i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m17864i();
        Matrix matrix2 = this.f54058n;
        matrix2.set(matrix);
        if (z) {
            List list = this.f54065u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((o90) this.f54065u.get(size)).f54067w.m14358e());
                }
            } else {
                o90 o90Var = this.f54064t;
                if (o90Var != null) {
                    matrix2.preConcat(o90Var.f54067w.m14358e());
                }
            }
        }
        matrix2.preConcat(this.f54067w.m14358e());
    }

    /* JADX INFO: renamed from: e */
    public final void m17863e(m90 m90Var) {
        if (m90Var == null) {
            return;
        }
        this.f54066v.add(m90Var);
    }

    /* JADX INFO: renamed from: f */
    public void mo9830f(p33 p33Var, Object obj) {
        this.f54067w.m14356c(p33Var, obj);
    }

    /* JADX WARN: Failed to calculate best type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v26 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v33 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v34 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r20v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v0 ??, new type: android.graphics.Canvas
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // p000.am2
    /* JADX INFO: renamed from: h */
    public final void mo556h(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22, p000.qm2 r23) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.o90.mo556h(android.graphics.Canvas, android.graphics.Matrix, int, qm2):void");
    }

    /* JADX INFO: renamed from: i */
    public final void m17864i() {
        if (this.f54065u != null) {
            return;
        }
        if (this.f54064t == null) {
            this.f54065u = Collections.EMPTY_LIST;
            return;
        }
        this.f54065u = new ArrayList();
        for (o90 o90Var = this.f54064t; o90Var != null; o90Var = o90Var.f54064t) {
            this.f54065u.add(o90Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo10091j(Canvas canvas, Matrix matrix, int i, qm2 qm2Var);

    /* JADX INFO: renamed from: k */
    public hi8 mo10092k() {
        return this.f54060p.f62693w;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17865l() {
        gv5 gv5Var = this.f54061q;
        return (gv5Var == null || ((ArrayList) gv5Var.f41394d).isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final void m17866m() {
        d77 d77Var = this.f54059o.f10620a.f40957a;
        String str = this.f54060p.f62673c;
        HashMap map = d77Var.f35089c;
        if (d77Var.f35087a) {
            bt5 bt5Var = (bt5) map.get(str);
            if (bt5Var == null) {
                bt5Var = new bt5();
                map.put(str, bt5Var);
            }
            int i = bt5Var.f8987a + 1;
            bt5Var.f8987a = i;
            if (i == Integer.MAX_VALUE) {
                bt5Var.f8987a = i / 2;
            }
            if (str.equals("__container")) {
                C3437ov c3437ov = d77Var.f35088b;
                c3437ov.getClass();
                C3052gv c3052gv = new C3052gv(c3437ov);
                if (c3052gv.hasNext()) {
                    c3052gv.next().getClass();
                    ho2.m13383c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m17867n(m90 m90Var) {
        this.f54066v.remove(m90Var);
    }

    /* JADX INFO: renamed from: o */
    public void mo10093o(mi4 mi4Var, int i, ArrayList arrayList, mi4 mi4Var2) {
    }

    /* JADX INFO: renamed from: p */
    public void mo17868p(boolean z) {
        if (z && this.f54070z == null) {
            this.f54070z = new yk4();
        }
        this.f54069y = z;
    }

    /* JADX INFO: renamed from: q */
    public void mo17869q(float f) {
        AsyncUpdates asyncUpdates = wk4.f66962a;
        j9a j9aVar = this.f54067w;
        m90 m90Var = j9aVar.f45257p;
        if (m90Var != null) {
            m90Var.mo16694j(f);
        }
        m90 m90Var2 = j9aVar.f45263v;
        if (m90Var2 != null) {
            m90Var2.mo16694j(f);
        }
        m90 m90Var3 = j9aVar.f45264w;
        if (m90Var3 != null) {
            m90Var3.mo16694j(f);
        }
        m90 m90Var4 = j9aVar.f45253l;
        if (m90Var4 != null) {
            m90Var4.mo16694j(f);
        }
        m90 m90Var5 = j9aVar.f45254m;
        if (m90Var5 != null) {
            m90Var5.mo16694j(f);
        }
        m90 m90Var6 = j9aVar.f45255n;
        if (m90Var6 != null) {
            m90Var6.mo16694j(f);
        }
        m90 m90Var7 = j9aVar.f45256o;
        if (m90Var7 != null) {
            m90Var7.mo16694j(f);
        }
        j73 j73Var = j9aVar.f45258q;
        if (j73Var != null) {
            j73Var.mo16694j(f);
        }
        j73 j73Var2 = j9aVar.f45259r;
        if (j73Var2 != null) {
            j73Var2.mo16694j(f);
        }
        j73 j73Var3 = j9aVar.f45260s;
        if (j73Var3 != null) {
            j73Var3.mo16694j(f);
        }
        j73 j73Var4 = j9aVar.f45261t;
        if (j73Var4 != null) {
            j73Var4.mo16694j(f);
        }
        j73 j73Var5 = j9aVar.f45262u;
        if (j73Var5 != null) {
            j73Var5.mo16694j(f);
        }
        int i = 0;
        gv5 gv5Var = this.f54061q;
        if (gv5Var != null) {
            ArrayList arrayList = (ArrayList) gv5Var.f41394d;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((m90) arrayList.get(i2)).mo16694j(f);
            }
            AsyncUpdates asyncUpdates2 = wk4.f66962a;
        }
        j73 j73Var6 = this.f54062r;
        if (j73Var6 != null) {
            j73Var6.mo16694j(f);
        }
        o90 o90Var = this.f54063s;
        if (o90Var != null) {
            o90Var.mo17869q(f);
        }
        while (true) {
            ArrayList arrayList2 = this.f54066v;
            if (i >= arrayList2.size()) {
                AsyncUpdates asyncUpdates3 = wk4.f66962a;
                return;
            } else {
                ((m90) arrayList2.get(i)).mo16694j(f);
                i++;
            }
        }
    }
}
