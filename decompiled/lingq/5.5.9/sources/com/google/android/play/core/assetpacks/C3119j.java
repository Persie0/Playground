package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import p082e1.C5352b;
import p290o6.C7967l0;
import p338qd.C8523a1;
import p338qd.C8532d1;
import p338qd.C8538f1;
import p338qd.C8543h0;
import p338qd.C8550j1;
import p338qd.C8553k1;
import p338qd.C8565o1;
import p338qd.C8570q0;
import p338qd.C8576s0;
import p338qd.C8579t0;
import p338qd.C8582u0;
import sd.C8990a;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3119j {

    /* JADX INFO: renamed from: e */
    public static final C7967l0 f15940e = new C7967l0("ExtractorTaskFinder");

    /* JADX INFO: renamed from: a */
    public final C3118i f15941a;

    /* JADX INFO: renamed from: b */
    public final C3112c f15942b;

    /* JADX INFO: renamed from: c */
    public final C3114e f15943c;

    /* JADX INFO: renamed from: d */
    public final C8990a f15944d;

    public C3119j(C3118i c3118i, C3112c c3112c, C3114e c3114e, C8990a c8990a) {
        this.f15941a = c3118i;
        this.f15942b = c3112c;
        this.f15943c = c3114e;
        this.f15944d = c8990a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final C5352b m8992a() {
        C3118i c3118i;
        C5352b c8565o1;
        C3114e c3114e;
        C3112c c3112c;
        C8543h0 c8543h0;
        C8550j1 c8550j1;
        int iM8999a;
        C8553k1 c8553k1;
        this = this;
        C3118i c3118i2 = this.f15941a;
        try {
            c3118i2.f15939f.lock();
            ArrayList arrayList = new ArrayList();
            for (C8579t0 c8579t0 : c3118i2.f15938e.values()) {
                if (C8523a1.m16632b(c8579t0.f46010c.f45995d)) {
                    arrayList.add(c8579t0);
                }
            }
            if (arrayList.isEmpty()) {
                c3118i2.m8989b();
                return null;
            }
            boolean zM17232a = this.f15944d.m17232a();
            C3112c c3112c2 = this.f15942b;
            C7967l0 c7967l0 = f15940e;
            if (zM17232a) {
                HashMap mapM8978n = c3112c2.m8978n();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c8553k1 = null;
                        break;
                    }
                    C8579t0 c8579t1 = (C8579t0) it.next();
                    C8576s0 c8576s0 = c8579t1.f46010c;
                    Long l10 = (Long) mapM8978n.get(c8576s0.f45992a);
                    if (l10 != null && c8576s0.f45993b == l10.longValue()) {
                        c7967l0.m15811l("Found promote pack task for session %s with pack %s.", Integer.valueOf(c8579t1.f46008a), c8576s0.f45992a);
                        int i10 = c8579t1.f46008a;
                        String str = c8576s0.f45992a;
                        c8553k1 = new C8553k1(i10, str, (int) C3112c.m8965b(new File(c3112c2.m8970d(), str), true), c8579t1.f46009b, c8576s0.f45993b);
                        break;
                    }
                }
                if (c8553k1 != null) {
                    c3118i2.m8989b();
                    return c8553k1;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c8565o1 = null;
                    break;
                }
                C8579t0 c8579t2 = (C8579t0) it2.next();
                try {
                    C8576s0 c8576s1 = c8579t2.f46010c;
                    if (c3112c2.m8972h(c8576s1.f45992a, c8579t2.f46009b, c8576s1.f45993b) == c8576s1.f45997f.size()) {
                        c7967l0.m15811l("Found final move task for session %s with pack %s.", Integer.valueOf(c8579t2.f46008a), c8576s1.f45992a);
                        c8565o1 = new C8538f1(c8579t2.f46008a, c8576s1.f45992a, c8579t2.f46009b, c8576s1.f45993b, c8576s1.f45994c);
                        break;
                    }
                } catch (IOException e10) {
                    throw new zzck(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(c8579t2.f46008a), c8579t2.f46010c.f45992a), e10, c8579t2.f46008a);
                }
            }
            if (c8565o1 == null) {
                Iterator it3 = arrayList.iterator();
                loop3: while (true) {
                    if (!it3.hasNext()) {
                        c8565o1 = null;
                        break;
                    }
                    C8579t0 c8579t3 = (C8579t0) it3.next();
                    C8576s0 c8576s2 = c8579t3.f46010c;
                    if (C8523a1.m16632b(c8576s2.f45995d)) {
                        for (C8582u0 c8582u0 : c8576s2.f45997f) {
                            if (this.f15942b.m8976l(c8576s2.f45992a, c8579t3.f46009b, c8576s2.f45993b, c8582u0.f46012a).exists()) {
                                c7967l0.m15811l("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(c8579t3.f46008a), c8576s2.f45992a, c8582u0.f46012a);
                                c8565o1 = new C8532d1(c8579t3.f46008a, c8576s2.f45992a, c8579t3.f46009b, c8576s2.f45993b, c8582u0.f46012a);
                                break loop3;
                            }
                        }
                    }
                }
                if (c8565o1 == null) {
                    Iterator it4 = arrayList.iterator();
                    loop5: while (true) {
                        if (!it4.hasNext()) {
                            c8565o1 = null;
                            break;
                        }
                        C8579t0 c8579t4 = (C8579t0) it4.next();
                        C8576s0 c8576s3 = c8579t4.f46010c;
                        if (C8523a1.m16632b(c8576s3.f45995d)) {
                            for (C8582u0 c8582u1 : c8576s3.f45997f) {
                                if (this.m8993b(c8579t4, c8582u1) && this.f15942b.m8975k(c8576s3.f45992a, c8579t4.f46009b, c8576s3.f45993b, c8582u1.f46012a).exists()) {
                                    c7967l0.m15811l("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(c8579t4.f46008a), c8576s3.f45992a, c8582u1.f46012a);
                                    c8565o1 = new C8565o1(c8579t4.f46008a, c8576s3.f45992a, c8579t4.f46009b, c8576s3.f45993b, c8582u1.f46012a, c8582u1.f46013b);
                                    break loop5;
                                }
                            }
                        }
                    }
                    if (c8565o1 == null) {
                        Iterator it5 = arrayList.iterator();
                        loop7: while (true) {
                            boolean zHasNext = it5.hasNext();
                            c3114e = this.f15943c;
                            if (!zHasNext) {
                                c3118i = c3118i2;
                                c3112c = c3112c2;
                                c8543h0 = null;
                                break;
                            }
                            try {
                                C8579t0 c8579t5 = (C8579t0) it5.next();
                                C8576s0 c8576s4 = c8579t5.f46010c;
                                int i11 = c8579t5.f46008a;
                                if (C8523a1.m16632b(c8576s4.f45995d)) {
                                    Iterator it6 = c8576s4.f45997f.iterator();
                                    while (it6.hasNext()) {
                                        C8582u0 c8582u2 = (C8582u0) it6.next();
                                        int i12 = c8582u2.f46017f;
                                        boolean z10 = i12 == 1 || i12 == 2;
                                        String str2 = c8582u2.f46012a;
                                        List list = c8582u2.f46015d;
                                        if (!z10) {
                                            C3112c c3112c3 = this.f15942b;
                                            Iterator it7 = it5;
                                            String str3 = c8576s4.f45992a;
                                            Iterator it8 = it6;
                                            String str4 = c8576s4.f45992a;
                                            c3118i = c3118i2;
                                            try {
                                                C8579t0 c8579t6 = c8579t5;
                                                c3112c = c3112c2;
                                                try {
                                                    iM8999a = new C3124o(c3112c3, str3, c8579t5.f46009b, c8576s4.f45993b, c8582u2.f46012a).m8999a();
                                                } catch (IOException e11) {
                                                    c7967l0.m15812m("Slice checkpoint corrupt, restarting extraction. %s", e11);
                                                    iM8999a = 0;
                                                }
                                                if (iM8999a != -1 && ((C8570q0) list.get(iM8999a)).f45947a) {
                                                    c7967l0.m15811l("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", Integer.valueOf(c8582u2.f46016e), Integer.valueOf(i11), str4, str2, Integer.valueOf(iM8999a));
                                                    c8543h0 = new C8543h0(c8579t6.f46008a, c8576s4.f45992a, c8579t6.f46009b, c8576s4.f45993b, c8576s4.f45994c, c8582u2.f46012a, c8582u2.f46016e, iM8999a, list.size(), c8576s4.f45996e, c8576s4.f45995d, c3114e.m8982a(str4, i11, iM8999a, str2));
                                                    break loop7;
                                                }
                                                c8579t5 = c8579t6;
                                                it5 = it7;
                                                it6 = it8;
                                                c3118i2 = c3118i;
                                                c3112c2 = c3112c;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                                this = this;
                                it5 = it5;
                                c3118i2 = c3118i2;
                                c3112c2 = c3112c2;
                            } catch (Throwable th3) {
                                th = th3;
                                c3118i = c3118i2;
                            }
                        }
                        if (c8543h0 != null) {
                            c3118i.m8989b();
                            return c8543h0;
                        }
                        Iterator it9 = arrayList.iterator();
                        loop9: while (true) {
                            if (!it9.hasNext()) {
                                c8550j1 = null;
                                break;
                            }
                            C8579t0 c8579t7 = (C8579t0) it9.next();
                            C8576s0 c8576s5 = c8579t7.f46010c;
                            int i13 = c8579t7.f46008a;
                            if (C8523a1.m16632b(c8576s5.f45995d)) {
                                for (C8582u0 c8582u3 : c8576s5.f45997f) {
                                    int i14 = c8582u3.f46017f;
                                    boolean z11 = i14 == 1 || i14 == 2;
                                    String str5 = c8582u3.f46012a;
                                    if (z11 && ((C8570q0) c8582u3.f46015d.get(0)).f45947a) {
                                        try {
                                            if (!m8993b(c8579t7, c8582u3)) {
                                                Object[] objArr = new Object[4];
                                                objArr[0] = Integer.valueOf(c8582u3.f46017f);
                                                objArr[1] = Integer.valueOf(i13);
                                                String str6 = c8576s5.f45992a;
                                                String str7 = c8576s5.f45992a;
                                                objArr[2] = str6;
                                                objArr[3] = str5;
                                                c7967l0.m15811l("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", objArr);
                                                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStreamM8982a = c3114e.m8982a(str7, i13, 0, str5);
                                                int i15 = c8579t7.f46008a;
                                                String str8 = c8576s5.f45992a;
                                                c3112c.getClass();
                                                c8550j1 = new C8550j1(i15, str8, (int) C3112c.m8965b(new File(c3112c.m8970d(), str8), true), c3112c.m8973i(str7), c8579t7.f46009b, c8576s5.f45993b, c8582u3.f46017f, c8582u3.f46012a, c8582u3.f46014c, autoCloseInputStreamM8982a);
                                                break loop9;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } else {
                                        c3112c = c3112c;
                                    }
                                }
                            }
                            c3112c = c3112c;
                        }
                        if (c8550j1 != null) {
                            c3118i.m8989b();
                            return c8550j1;
                        }
                        c3118i.m8989b();
                        return null;
                    }
                }
            }
            c3118i2.m8989b();
            return c8565o1;
        } catch (Throwable th5) {
            th = th5;
            c3118i = c3118i2;
        }
        c3118i.m8989b();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8993b(C8579t0 c8579t0, C8582u0 c8582u0) {
        C8576s0 c8576s0 = c8579t0.f46010c;
        String str = c8576s0.f45992a;
        String str2 = c8582u0.f46012a;
        C7967l0 c7967l0 = C3124o.f15962h;
        C3112c c3112c = this.f15942b;
        c3112c.getClass();
        File file = new File(new File(new File(new File(c3112c.m8969c(str, c8579t0.f46009b, c8576s0.f45993b), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null) {
                    c7967l0.m15812m("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                    return false;
                }
                if (Integer.parseInt(properties.getProperty("fileStatus")) == 4) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        } catch (IOException e10) {
            c7967l0.m15812m("Could not read checkpoint while checking if extraction finished. %s", e10);
        }
    }
}
