package androidx.activity.result;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p035c.AbstractC1641a;

/* JADX INFO: renamed from: androidx.activity.result.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0207f {

    /* JADX INFO: renamed from: a */
    public Random f521a = new Random();

    /* JADX INFO: renamed from: b */
    public final HashMap f522b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f523c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f524d = new HashMap();

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f525e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public final transient HashMap f526f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f527g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Bundle f528h = new Bundle();

    /* JADX INFO: renamed from: androidx.activity.result.f$a */
    public static class a<O> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0202a<O> f529a;

        /* JADX INFO: renamed from: b */
        public final AbstractC1641a<?, O> f530b;

        public a(InterfaceC0202a<O> interfaceC0202a, AbstractC1641a<?, O> abstractC1641a) {
            this.f529a = interfaceC0202a;
            this.f530b = abstractC1641a;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f531a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<InterfaceC1049o> f532b = new ArrayList<>();

        public b(Lifecycle lifecycle) {
            this.f531a = lifecycle;
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m866a(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            r3 = r7
            java.util.HashMap r0 = r3.f522b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r5 = r0.get(r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L12
            r8 = 0
            return r8
        L12:
            java.util.HashMap r0 = r3.f526f
            r6 = 6
            java.lang.Object r5 = r0.get(r8)
            r0 = r5
            androidx.activity.result.f$a r0 = (androidx.activity.result.AbstractC0207f.a) r0
            if (r0 == 0) goto L3e
            r6 = 2
            androidx.activity.result.a<O> r1 = r0.f529a
            r6 = 3
            if (r1 == 0) goto L3e
            r5 = 7
            java.util.ArrayList<java.lang.String> r2 = r3.f525e
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L3e
            c.a<?, O> r0 = r0.f530b
            r5 = 3
            java.lang.Object r9 = r0.mo3678c(r10, r9)
            r1.mo843a(r9)
            java.util.ArrayList<java.lang.String> r9 = r3.f525e
            r5 = 7
            r9.remove(r8)
            goto L50
        L3e:
            java.util.HashMap r0 = r3.f527g
            r0.remove(r8)
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r10, r9)
            r6 = 3
            android.os.Bundle r9 = r3.f528h
            r5 = 1
            r9.putParcelable(r8, r0)
            r6 = 6
        L50:
            r8 = 1
            r5 = 7
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.AbstractC0207f.m866a(int, int, android.content.Intent):boolean");
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo801b(int i10, AbstractC1641a abstractC1641a, @SuppressLint({"UnknownNullness"}) Object obj);

    /* JADX INFO: renamed from: c */
    public final C0205d m867c(final String str, Fragment fragment, final AbstractC1641a abstractC1641a, final InterfaceC0202a interfaceC0202a) {
        C1052r c1052r = fragment.f6112l0;
        if (c1052r.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + fragment + " is attempting to register while current state is " + c1052r.f6681d + ". LifecycleOwners must call register before they are STARTED.");
        }
        m869e(str);
        HashMap map = this.f524d;
        b bVar = (b) map.get(str);
        if (bVar == null) {
            bVar = new b(c1052r);
        }
        InterfaceC1049o interfaceC1049o = new InterfaceC1049o() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                boolean zEquals = Lifecycle.Event.ON_START.equals(event);
                String str2 = str;
                AbstractC0207f abstractC0207f = this.f510d;
                if (zEquals) {
                    HashMap map2 = abstractC0207f.f526f;
                    InterfaceC0202a interfaceC0202a2 = interfaceC0202a;
                    AbstractC1641a abstractC1641a2 = abstractC1641a;
                    map2.put(str2, new AbstractC0207f.a(interfaceC0202a2, abstractC1641a2));
                    HashMap map3 = abstractC0207f.f527g;
                    if (map3.containsKey(str2)) {
                        Object obj = map3.get(str2);
                        map3.remove(str2);
                        interfaceC0202a2.mo843a(obj);
                    }
                    Bundle bundle = abstractC0207f.f528h;
                    ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                    if (activityResult != null) {
                        bundle.remove(str2);
                        interfaceC0202a2.mo843a(abstractC1641a2.mo3678c(activityResult.f506b, activityResult.f505a));
                    }
                } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                    abstractC0207f.f526f.remove(str2);
                } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                    abstractC0207f.m870f(str2);
                }
            }
        };
        bVar.f531a.mo3883a(interfaceC1049o);
        bVar.f532b.add(interfaceC1049o);
        map.put(str, bVar);
        return new C0205d(this, str, abstractC1641a);
    }

    /* JADX INFO: renamed from: d */
    public final C0206e m868d(String str, AbstractC1641a abstractC1641a, InterfaceC0202a interfaceC0202a) {
        m869e(str);
        this.f526f.put(str, new a(interfaceC0202a, abstractC1641a));
        HashMap map = this.f527g;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC0202a.mo843a(obj);
        }
        Bundle bundle = this.f528h;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            interfaceC0202a.mo843a(abstractC1641a.mo3678c(activityResult.f506b, activityResult.f505a));
        }
        return new C0206e(this, str, abstractC1641a);
    }

    /* JADX INFO: renamed from: e */
    public final void m869e(String str) {
        HashMap map = this.f523c;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iNextInt = this.f521a.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            HashMap map2 = this.f522b;
            if (!map2.containsKey(Integer.valueOf(i10))) {
                map2.put(Integer.valueOf(i10), str);
                map.put(str, Integer.valueOf(i10));
                return;
            }
            iNextInt = this.f521a.nextInt(2147418112);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m870f(String str) {
        Integer num;
        if (!this.f525e.contains(str) && (num = (Integer) this.f523c.remove(str)) != null) {
            this.f522b.remove(num);
        }
        this.f526f.remove(str);
        HashMap map = this.f527g;
        if (map.containsKey(str)) {
            StringBuilder sbM854m = C0204c.m854m("Dropping pending result for request ", str, ": ");
            sbM854m.append(map.get(str));
            Log.w("ActivityResultRegistry", sbM854m.toString());
            map.remove(str);
        }
        Bundle bundle = this.f528h;
        if (bundle.containsKey(str)) {
            StringBuilder sbM854m2 = C0204c.m854m("Dropping pending result for request ", str, ": ");
            sbM854m2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbM854m2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f524d;
        b bVar = (b) map2.get(str);
        if (bVar != null) {
            ArrayList<InterfaceC1049o> arrayList = bVar.f532b;
            Iterator<InterfaceC1049o> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f531a.mo3885c(it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
