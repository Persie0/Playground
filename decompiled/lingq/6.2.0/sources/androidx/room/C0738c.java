package androidx.room;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.NotImplementedError;
import kotlin.collections.AbstractC3194a;
import p000.C3051gu;
import p000.C3386nv;
import p000.C3487q7;
import p000.ExecutorC3014fu;
import p000.ai7;
import p000.bna;
import p000.by8;
import p000.ci8;
import p000.d54;
import p000.eh0;
import p000.fa4;
import p000.ga2;
import p000.ij6;
import p000.jj5;
import p000.kn1;
import p000.lq2;
import p000.r00;
import p000.r46;
import p000.ry5;
import p000.s02;
import p000.sb2;
import p000.ux5;
import p000.v63;
import p000.vl1;
import p000.vp6;
import p000.vz1;
import p000.xn9;
import p000.y38;
import p000.yn9;
import p000.z21;

/* JADX INFO: renamed from: androidx.room.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0738c {

    /* JADX INFO: renamed from: a */
    public final z21 f6825a;

    /* JADX INFO: renamed from: b */
    public final Context f6826b;

    /* JADX INFO: renamed from: c */
    public final String f6827c;

    /* JADX INFO: renamed from: f */
    public Executor f6830f;

    /* JADX INFO: renamed from: g */
    public Executor f6831g;

    /* JADX INFO: renamed from: h */
    public C3487q7 f6832h;

    /* JADX INFO: renamed from: i */
    public boolean f6833i;

    /* JADX INFO: renamed from: q */
    public boolean f6841q;

    /* JADX INFO: renamed from: r */
    public boolean f6842r;

    /* JADX INFO: renamed from: d */
    public final ArrayList f6828d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f6829e = new ArrayList();

    /* JADX INFO: renamed from: j */
    public RoomDatabase$JournalMode f6834j = RoomDatabase$JournalMode.AUTOMATIC;

    /* JADX INFO: renamed from: k */
    public final long f6835k = -1;

    /* JADX INFO: renamed from: l */
    public final d54 f6836l = new d54(1);

    /* JADX INFO: renamed from: m */
    public final LinkedHashSet f6837m = new LinkedHashSet();

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f6838n = new LinkedHashSet();

    /* JADX INFO: renamed from: o */
    public final ArrayList f6839o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public boolean f6840p = true;

    /* JADX INFO: renamed from: s */
    public final boolean f6843s = true;

    public C0738c(Context context, Class cls, String str) {
        this.f6825a = y38.m24933a(cls);
        this.f6826b = context;
        this.f6827c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m2811a(ry5... ry5VarArr) {
        for (ry5 ry5Var : ry5VarArr) {
            Integer numValueOf = Integer.valueOf(ry5Var.f60039a);
            LinkedHashSet linkedHashSet = this.f6838n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(ry5Var.f60040b));
        }
        ry5[] ry5VarArr2 = (ry5[]) Arrays.copyOf(ry5VarArr, ry5VarArr.length);
        d54 d54Var = this.f6836l;
        d54Var.getClass();
        for (ry5 ry5Var2 : ry5VarArr2) {
            d54Var.m10099b(ry5Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0746d m2812b() {
        String name;
        lq2 lq2VarMo2834g;
        yn9 yn9VarM12453a;
        yn9 yn9VarM12453a2;
        boolean zContainsKey;
        Executor executor = this.f6830f;
        if (executor == null && this.f6831g == null) {
            ExecutorC3014fu executorC3014fu = C3051gu.f41317u;
            this.f6831g = executorC3014fu;
            this.f6830f = executorC3014fu;
        } else if (executor != null && this.f6831g == null) {
            this.f6831g = executor;
        } else if (executor == null) {
            this.f6830f = this.f6831g;
        }
        LinkedHashSet linkedHashSet = this.f6838n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.f6837m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    C3386nv.m17624j(ux5.m22988k(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        xn9 jj5Var = this.f6832h;
        if (jj5Var == null) {
            jj5Var = new jj5(11);
        }
        xn9 xn9Var = jj5Var;
        if (this.f6835k > 0) {
            if (this.f6827c != null) {
                C3386nv.m17626m("Required value was null.");
                return null;
            }
            C3386nv.m17626m("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = this.f6833i;
        RoomDatabase$JournalMode roomDatabase$JournalMode = this.f6834j;
        Context context = this.f6826b;
        RoomDatabase$JournalMode roomDatabase$JournalModeResolve$room_runtime = roomDatabase$JournalMode.resolve$room_runtime(context);
        Executor executor2 = this.f6830f;
        if (executor2 == null) {
            C3386nv.m17626m("Required value was null.");
            return null;
        }
        Executor executor3 = this.f6831g;
        if (executor3 == null) {
            C3386nv.m17626m("Required value was null.");
            return null;
        }
        s02 s02Var = new s02(context, this.f6827c, xn9Var, this.f6836l, this.f6828d, z, roomDatabase$JournalModeResolve$room_runtime, executor2, executor3, null, this.f6840p, this.f6841q, linkedHashSet2, null, null, null, this.f6829e, this.f6839o, this.f6842r, null, null);
        s02Var.f60128q = this.f6843s;
        z21 z21Var = this.f6825a;
        z21Var.getClass();
        Class clsMo16595a = z21Var.mo16595a();
        clsMo16595a.getClass();
        Package r0 = clsMo16595a.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsMo16595a.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsMo16595a.getClassLoader());
            cls.getClass();
            AbstractC0746d abstractC0746d = (AbstractC0746d) cls.getDeclaredConstructor(null).newInstance(null);
            abstractC0746d.getClass();
            abstractC0746d.f6964k = s02Var.f60128q;
            try {
                lq2VarMo2834g = abstractC0746d.mo2834g();
                lq2VarMo2834g.getClass();
            } catch (NotImplementedError unused) {
                lq2VarMo2834g = null;
            }
            if (lq2VarMo2834g == null) {
                new sb2(s02Var, new vp6(abstractC0746d), new RoomDatabase$createConnectionManager$2(abstractC0746d));
                throw null;
            }
            abstractC0746d.f6958e = new sb2(s02Var, lq2VarMo2834g, new RoomDatabase$createConnectionManager$3(2, abstractC0746d, ci8.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1));
            abstractC0746d.f6959f = abstractC0746d.mo2833f();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setMo2838k = abstractC0746d.mo2838k();
            List list = s02Var.f60125n;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setMo2838k.iterator();
            while (true) {
                int i = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                C3386nv.m17626m("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    for (ry5 ry5Var : abstractC0746d.mo2832e(linkedHashMap)) {
                        int i3 = ry5Var.f60039a;
                        int i4 = ry5Var.f60040b;
                        d54 d54Var = s02Var.f60115d;
                        LinkedHashMap linkedHashMap2 = d54Var.f35011a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i3))) {
                            Map mapM15360M = (Map) linkedHashMap2.get(Integer.valueOf(i3));
                            if (mapM15360M == null) {
                                mapM15360M = AbstractC3194a.m15360M();
                            }
                            zContainsKey = mapM15360M.containsKey(Integer.valueOf(i4));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            d54Var.m10099b(ry5Var);
                        }
                    }
                    LinkedHashMap linkedHashMapMo2839l = abstractC0746d.mo2839l();
                    List list2 = s02Var.f60124m;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapMo2839l.entrySet()) {
                        z21 z21Var2 = (z21) entry.getKey();
                        for (z21 z21Var3 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i5 = size3 - 1;
                                if (z21Var3.m25415d(list2.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i5 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i5;
                            }
                            if (size3 < 0) {
                                ij6.m13956n("A required type converter (", z21Var3.m25413b(), ") for ", z21Var2.m25413b(), " is missing in the database configuration.");
                                return null;
                            }
                            Object obj = list2.get(size3);
                            z21Var3.getClass();
                            obj.getClass();
                            abstractC0746d.f6963j.put(z21Var3, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i6 = size4 - 1;
                            if (!zArr2[size4]) {
                                ij6.m13965w("Unexpected type converter ", list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                return null;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size4 = i6;
                        }
                    }
                    abstractC0746d.f6956c = s02Var.f60119h;
                    abstractC0746d.f6957d = new by8(s02Var.f60120i, 1);
                    Executor executor4 = abstractC0746d.f6956c;
                    if (executor4 == null) {
                        fa4.m11636J("internalQueryExecutor");
                        throw null;
                    }
                    vl1 vl1VarM23619a = vz1.m23619a(eh0.m11113J(bna.m3926O(executor4), r46.m20384i()));
                    abstractC0746d.f6954a = vl1VarM23619a;
                    kn1 kn1Var = vl1VarM23619a.f65559a;
                    by8 by8Var = abstractC0746d.f6957d;
                    if (by8Var == null) {
                        fa4.m11636J("internalTransactionExecutor");
                        throw null;
                    }
                    abstractC0746d.f6955b = kn1Var.plus(bna.m3926O(by8Var));
                    abstractC0746d.f6961h = s02Var.f60117f;
                    sb2 sb2Var = abstractC0746d.f6958e;
                    if (sb2Var == null) {
                        fa4.m11636J("connectionManager");
                        throw null;
                    }
                    yn9 yn9Var = (yn9) sb2Var.f60618h;
                    if (yn9Var == null) {
                        yn9VarM12453a = null;
                        break;
                    }
                    yn9VarM12453a = yn9Var;
                    while (!(yn9VarM12453a instanceof ai7)) {
                        if (!(yn9VarM12453a instanceof ga2)) {
                            yn9VarM12453a = null;
                            break;
                        }
                        yn9VarM12453a = ((ga2) yn9VarM12453a).m12453a();
                    }
                    sb2 sb2Var2 = abstractC0746d.f6958e;
                    if (sb2Var2 == null) {
                        fa4.m11636J("connectionManager");
                        throw null;
                    }
                    yn9 yn9Var2 = (yn9) sb2Var2.f60618h;
                    if (yn9Var2 == null) {
                        yn9VarM12453a2 = null;
                        break;
                    }
                    yn9VarM12453a2 = yn9Var2;
                    while (!(yn9VarM12453a2 instanceof r00)) {
                        if (!(yn9VarM12453a2 instanceof ga2)) {
                            yn9VarM12453a2 = null;
                            break;
                        }
                        yn9VarM12453a2 = ((ga2) yn9VarM12453a2).m12453a();
                    }
                    return abstractC0746d;
                }
                z21 z21Var4 = (z21) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i7 = size5 - 1;
                        if (z21Var4.m25415d(list.get(size5))) {
                            zArr[size5] = true;
                            i = size5;
                            break;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        size5 = i7;
                    }
                }
                if (i < 0) {
                    v63.m23135m("A required auto migration spec (", z21Var4.m25413b(), ") is missing in the database configuration.");
                    return null;
                }
                linkedHashMap.put(z21Var4, list.get(i));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsMo16595a.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            ij6.m13957o("Cannot access the constructor ", clsMo16595a.getCanonicalName(), e2);
            return null;
        } catch (InstantiationException e3) {
            ij6.m13957o("Failed to create an instance of ", clsMo16595a.getCanonicalName(), e3);
            return null;
        }
    }
}
