package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcg implements fcq {

    /* JADX INFO: renamed from: a */
    public static final nbh f21243a = nbh.m17259h("com/google/android/apps/camera/logging/ClearcutCameraEventLogger");

    /* JADX INFO: renamed from: i */
    private static final ksp f21244i = new ksp(-969197918, C0100R.raw.f6534xddda5c42);

    /* JADX INFO: renamed from: b */
    public final jqh f21245b;

    /* JADX INFO: renamed from: c */
    final ArrayBlockingQueue f21246c;

    /* JADX INFO: renamed from: d */
    private final jcb f21247d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f21248e;

    /* JADX INFO: renamed from: f */
    private final kbz f21249f;

    /* JADX INFO: renamed from: g */
    private final Context f21250g;

    /* JADX INFO: renamed from: h */
    private final oju f21251h;

    public fcg(Context context, ScheduledExecutorService scheduledExecutorService, kbz kbzVar) {
        List list = jcb.f33699j;
        ffw ffwVar = ffw.f21760f;
        EnumSet enumSet = jcg.f33720e;
        jib.m13203h("ANDROID_CAMERA");
        jcb jcbVarM12857b = jbx.m12857b(context, "ANDROID_CAMERA", ffwVar, enumSet);
        jdz jdzVar = new jdz(context.getApplicationContext(), new jqe());
        this.f21246c = new ArrayBlockingQueue(100);
        this.f21247d = jcbVarM12857b;
        this.f21245b = jdzVar;
        this.f21248e = scheduledExecutorService;
        this.f21249f = kbzVar;
        this.f21250g = context;
        this.f21251h = new doy(this, 5);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, nps] */
    @Override // p000.fcq
    /* JADX INFO: renamed from: a */
    public final void mo4205a(nho nhoVar) {
        if (!this.f21246c.offer(new bkn(nhoVar))) {
            ((nbe) ((nbe) f21243a.m17252c()).mo17276G((char) 2110)).mo17290o("Queue full. Discarded camera event.");
        }
        if (this.f21246c.peek() == null) {
            return;
        }
        ?? r5 = this.f21251h.get();
        nax naxVar = (nax) jvh.m13560h(r5);
        if (naxVar != null) {
            m8121b(naxVar);
        } else {
            kxk.m14975U(kxk.m14972R(r5, 5L, TimeUnit.SECONDS, this.f21248e), new djq(this, 3), this.f21248e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, nyw] */
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
    /* JADX INFO: renamed from: b */
    public final void m8121b(nax naxVar) {
        kbz kbzVar;
        try {
            this.f21249f.mo13961e("clearcut.process");
            ArrayList arrayList = new ArrayList();
            this.f21246c.drainTo(arrayList, 100);
            lku.m15662p(naxVar);
            if (naxVar.m17236g()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jbz jbzVarM12888e = this.f21247d.m12888e(((bkn) it.next()).f3651a);
                    jbzVarM12888e.f33697h = ktr.m14843a(this.f21250g, f21244i);
                    jbzVarM12888e.m12882a();
                }
                kbzVar = this.f21249f;
            } else {
                kbzVar = this.f21249f;
            }
            kbzVar.mo13962f();
        } catch (Throwable th) {
            this.f21249f.mo13962f();
            throw th;
        }
    }
}
