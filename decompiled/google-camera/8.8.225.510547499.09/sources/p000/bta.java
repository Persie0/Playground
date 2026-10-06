package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bta implements bsb, bqz {

    /* JADX INFO: renamed from: a */
    private final bsa f4399a;

    /* JADX INFO: renamed from: b */
    private final bsc f4400b;

    /* JADX INFO: renamed from: c */
    private int f4401c;

    /* JADX INFO: renamed from: d */
    private int f4402d = -1;

    /* JADX INFO: renamed from: e */
    private bqn f4403e;

    /* JADX INFO: renamed from: f */
    private List f4404f;

    /* JADX INFO: renamed from: g */
    private int f4405g;

    /* JADX INFO: renamed from: h */
    private File f4406h;

    /* JADX INFO: renamed from: i */
    private btb f4407i;

    /* JADX INFO: renamed from: j */
    private volatile C1058va f4408j;

    public bta(bsc bscVar, bsa bsaVar) {
        this.f4400b = bscVar;
        this.f4399a = bsaVar;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m3029d() {
        return this.f4405g < this.f4404f.size();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bra, java.lang.Object] */
    @Override // p000.bsb
    /* JADX INFO: renamed from: a */
    public final void mo2966a() {
        C1058va c1058va = this.f4408j;
        if (c1058va != null) {
            c1058va.f47802a.mo2937aY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.bqz
    /* JADX INFO: renamed from: b */
    public final void mo2945b(Object obj) {
        this.f4399a.mo2969d(this.f4403e, obj, this.f4408j.f47802a, 4, this.f4407i);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [bra, java.lang.Object] */
    @Override // p000.bsb
    /* JADX INFO: renamed from: c */
    public final boolean mo2967c() {
        List arrayList;
        List listM2974e = this.f4400b.m2974e();
        boolean z = false;
        if (listM2974e.isEmpty()) {
            return false;
        }
        bsc bscVar = this.f4400b;
        bpk bpkVarM2831a = bscVar.f4278c.m2831a();
        Class<?> cls = bscVar.f4279d.getClass();
        Class cls2 = bscVar.f4282g;
        Class cls3 = bscVar.f4285j;
        dsx dsxVar = bpkVarM2831a.f4061g;
        cbg cbgVar = (cbg) ((AtomicReference) dsxVar.f12522b).getAndSet(null);
        if (cbgVar == null) {
            cbgVar = new cbg(cls, cls2, cls3);
        } else {
            cbgVar.m3379a(cls, cls2, cls3);
        }
        synchronized (dsxVar.f12521a) {
            arrayList = (List) ((C1117xf) dsxVar.f12521a).get(cbgVar);
        }
        ((AtomicReference) dsxVar.f12522b).set(cbgVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            Iterator it = bpkVarM2831a.f4062h.m6678B(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : bpkVarM2831a.f4060f.m6705t((Class) it.next(), cls2)) {
                    if (!bpkVarM2831a.f4059e.m2620n(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            dsx dsxVar2 = bpkVarM2831a.f4061g;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (dsxVar2.f12521a) {
                ((C1117xf) dsxVar2.f12521a).put(new cbg(cls, cls2, cls3), listUnmodifiableList);
            }
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.f4400b.f4285j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(this.f4400b.f4279d.getClass()) + " to " + String.valueOf(this.f4400b.f4285j));
        }
        while (true) {
            if (this.f4404f != null && m3029d()) {
                this.f4408j = null;
                while (!z && m3029d()) {
                    List list = this.f4404f;
                    int i = this.f4405g;
                    this.f4405g = i + 1;
                    bvl bvlVar = (bvl) list.get(i);
                    File file = this.f4406h;
                    bsc bscVar2 = this.f4400b;
                    this.f4408j = bvlVar.mo3084b(file, bscVar2.f4280e, bscVar2.f4281f, bscVar2.f4283h);
                    if (this.f4408j != null && this.f4400b.m2977h(this.f4408j.f47802a.mo2934a())) {
                        this.f4408j.f47802a.mo2941f(this.f4400b.f4289n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f4402d + 1;
            this.f4402d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.f4401c + 1;
                this.f4401c = i3;
                if (i3 >= listM2974e.size()) {
                    return false;
                }
                this.f4402d = 0;
            }
            bqn bqnVar = (bqn) listM2974e.get(this.f4401c);
            Class cls5 = (Class) arrayList.get(this.f4402d);
            bqv bqvVarM2970a = this.f4400b.m2970a(cls5);
            btg btgVarM2972c = this.f4400b.m2972c();
            bsc bscVar3 = this.f4400b;
            this.f4407i = new btb(btgVarM2972c, bqnVar, bscVar3.f4288m, bscVar3.f4280e, bscVar3.f4281f, bqvVarM2970a, cls5, bscVar3.f4283h);
            File fileMo3068a = bscVar3.m2973d().mo3068a(this.f4407i);
            this.f4406h = fileMo3068a;
            if (fileMo3068a != null) {
                this.f4403e = bqnVar;
                this.f4404f = this.f4400b.m2976g(fileMo3068a);
                this.f4405g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.bqz
    /* JADX INFO: renamed from: e */
    public final void mo2946e(Exception exc) {
        this.f4399a.mo2968b(this.f4407i, exc, this.f4408j.f47802a, 4);
    }
}
