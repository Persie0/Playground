package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grc implements gre, grk {

    /* JADX INFO: renamed from: l */
    private static final kbc f26107l = new kbc(512, 384);

    /* JADX INFO: renamed from: a */
    protected final ExecutorService f26108a;

    /* JADX INFO: renamed from: b */
    protected final ExecutorService f26109b;

    /* JADX INFO: renamed from: c */
    protected final ExecutorService f26110c;

    /* JADX INFO: renamed from: d */
    protected final ExecutorService f26111d;

    /* JADX INFO: renamed from: m */
    private final gsa f26119m;

    /* JADX INFO: renamed from: n */
    private final kbz f26120n;

    /* JADX INFO: renamed from: o */
    private final kbc f26121o;

    /* JADX INFO: renamed from: p */
    private final gqq f26122p;

    /* JADX INFO: renamed from: h */
    public int f26115h = 0;

    /* JADX INFO: renamed from: i */
    public int f26116i = 0;

    /* JADX INFO: renamed from: j */
    public int f26117j = 0;

    /* JADX INFO: renamed from: k */
    public final gri f26118k = new gri();

    /* JADX INFO: renamed from: e */
    public final Map f26112e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map f26113f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Set f26114g = new HashSet();

    public grc(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, gsa gsaVar, gqq gqqVar, kbz kbzVar, int i) {
        this.f26108a = executorService;
        this.f26109b = executorService2;
        this.f26110c = executorService3;
        this.f26111d = executorService4;
        this.f26119m = gsaVar;
        this.f26122p = gqqVar;
        this.f26120n = kbzVar;
        this.f26121o = new kbc(i, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m9661a(grv grvVar) {
        synchronized (this.f26113f) {
            this.f26113f.remove(grvVar);
        }
    }

    @Override // p000.grk
    /* JADX INFO: renamed from: b */
    public final void mo9662b(kpw kpwVar, Executor executor) {
        synchronized (this.f26112e) {
            gra graVar = (gra) this.f26112e.get(kpwVar);
            if (graVar == null || graVar.m9638b() <= 0) {
                throw new RuntimeException("ERROR: Task implementation did NOT balance its release.");
            }
            graVar.m9637a(-1);
            this.f26115h--;
            if (graVar.m9638b() == 0) {
                this.f26112e.remove(kpwVar);
                this.f26114g.retainAll(this.f26112e.keySet());
                if (graVar.f26102b) {
                    gqn gqnVar = new gqn(this, kpwVar, 3);
                    if (executor == null) {
                        gqnVar.run();
                    } else {
                        executor.execute(gqnVar);
                    }
                }
                if (graVar.f26101a) {
                    graVar.m9640d();
                }
            } else {
                this.f26112e.put(kpwVar, graVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [gqs, java.lang.Object] */
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
    /* JADX INFO: renamed from: c */
    public final boolean m9663c(gyh gyhVar, Set set, boolean z, boolean z2, mrm mrmVar) {
        gra graVar;
        gyhVar.getClass();
        if (set.isEmpty()) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kpw kpwVar = ((grv) it.next()).f26188f.f26152a;
            Integer num = (Integer) map.get(kpwVar);
            if (num == null) {
                map.put(kpwVar, 1);
            } else {
                map.put(kpwVar, Integer.valueOf(num.intValue() + 1));
            }
        }
        Set setKeySet = map.keySet();
        gqi gqiVar = new gqi();
        gqiVar.m9641e(set.size());
        grj grjVar = new grj(gqiVar, gyhVar, mrmVar);
        synchronized (this.f26113f) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                lku.m15614I(((gtd) this.f26113f.get((grv) it2.next())) == null, "Overlap of Shadow Task association.  You've possibly submitted the same task twice?");
            }
        }
        gtd gtdVar = new gtd(grjVar, setKeySet);
        HashSet<gra> hashSet = new HashSet(map.keySet().size());
        for (kpw kpwVar2 : map.keySet()) {
            int iIntValue = ((Integer) map.get(kpwVar2)).intValue();
            synchronized (this.f26112e) {
                lku.m15614I(this.f26112e.get(kpwVar2) == null, "Image is already being processed by another task.");
                graVar = new gra(z, z2);
                graVar.m9641e(iIntValue);
                this.f26112e.put(kpwVar2, graVar);
                this.f26115h += iIntValue;
                this.f26116i++;
            }
            hashSet.add(graVar);
        }
        this.f26122p.m9649a(gtdVar.f26334a);
        m9665e(set, gtdVar);
        for (gra graVar2 : hashSet) {
            if (graVar2.f26101a) {
                graVar2.m9639c();
            }
        }
        return true;
    }

    @Override // p000.gre
    /* JADX INFO: renamed from: d */
    public final void mo9664d(grm grmVar, Executor executor, Set set, gyh gyhVar, mrm mrmVar) {
        HashSet hashSet = new HashSet();
        if (set.contains(grd.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK)) {
            grr grrVar = new grr(grmVar, executor, this, gyhVar, this.f26119m);
            if (set.contains(grd.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new grx(grmVar, executor, this, gyhVar, f26107l, mrm.m16829i(grrVar), this.f26120n));
            } else {
                hashSet.add(grrVar);
            }
        } else if (set.contains(grd.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
            hashSet.add(new grx(grmVar, executor, this, gyhVar, f26107l, mqu.f41450a, this.f26120n));
        }
        if (set.contains(grd.CONVERT_TO_RGB_PREVIEW)) {
            hashSet.add(new grs(grmVar, executor, this, 3, gyhVar, this.f26121o, 3, this.f26120n));
        }
        mrq mrqVar = (mrq) mrmVar;
        if (m9663c(gyhVar, hashSet, set.contains(grd.BLOCK_UNTIL_ALL_TASKS_RELEASE), set.contains(grd.CLOSE_ON_ALL_TASKS_RELEASE), mrm.m16829i(new gqn(this, (grh) mrqVar.f41482a, 2)))) {
            gri griVar = this.f26118k;
            grh grhVar = (grh) mrqVar.f41482a;
            kpw kpwVar = grmVar.f26152a;
            synchronized (griVar.f26136a) {
                griVar.f26136a.size();
                if (!griVar.f26136a.contains(grhVar)) {
                    griVar.f26136a.add(grhVar);
                }
                if (kpwVar == null) {
                    griVar.f26137b.put(grhVar, null);
                } else {
                    griVar.f26137b.put(grhVar, Long.valueOf(kpwVar.mo7248d()));
                }
                griVar.f26136a.size();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9665e(Set set, gtd gtdVar) {
        synchronized (this.f26113f) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                grv grvVar = (grv) it.next();
                this.f26113f.put(grvVar, gtdVar);
                grb grbVar = new grb(this, gtdVar, grvVar, this.f26120n, null);
                switch (grvVar.f26190h - 1) {
                    case 0:
                        this.f26108a.execute(grbVar);
                        break;
                    case 1:
                        this.f26109b.execute(grbVar);
                        break;
                    case 2:
                        this.f26110c.execute(grbVar);
                        break;
                    default:
                        this.f26111d.execute(grbVar);
                        break;
                }
            }
        }
    }

    public final String toString() {
        int size;
        int size2;
        int size3 = this.f26113f.size();
        int size4 = this.f26112e.size();
        int i = this.f26115h;
        gri griVar = this.f26118k;
        synchronized (griVar.f26136a) {
            size = griVar.f26137b.size();
        }
        gri griVar2 = this.f26118k;
        synchronized (griVar2.f26136a) {
            size2 = griVar2.f26136a.size();
        }
        return "ImageBackend Status BEGIN:\nShadow Image Map Size = " + size3 + "\nImage Semaphore Map Size = " + size4 + "\nOutstandingImageRefs = " + i + "\nProxy Listener Map Size = " + size + "\nProxy Listener = " + size2 + "\nImageBackend Status END:\n";
    }
}
