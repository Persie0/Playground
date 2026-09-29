package p000;

import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0011a9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f370b;

    public /* synthetic */ C0011a9(uo2 uo2Var, bl2 bl2Var) {
        this.f369a = 15;
        this.f370b = uo2Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x025f A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:3:0x0013, B:4:0x00a6, B:6:0x00ac, B:10:0x00d0, B:15:0x00e5, B:18:0x00ef, B:24:0x010d, B:28:0x0117, B:32:0x0125, B:36:0x0134, B:40:0x014a, B:44:0x015c, B:46:0x0162, B:51:0x0178, B:55:0x0182, B:57:0x018b, B:62:0x019d, B:67:0x01af, B:72:0x01ce, B:77:0x01e0, B:81:0x01f3, B:86:0x0211, B:90:0x021a, B:93:0x0226, B:95:0x022c, B:101:0x0245, B:102:0x0259, B:104:0x025f, B:109:0x0271, B:84:0x0204, B:80:0x01eb, B:76:0x01d9, B:71:0x01be, B:66:0x01a8, B:61:0x0196, B:49:0x016c, B:43:0x0158, B:39:0x013e, B:35:0x012e, B:21:0x00fc, B:14:0x00e0, B:9:0x00c7), top: B:124:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0267  */
    /* JADX WARN: Code duplicated, block: B:107:0x0268  */
    /* JADX WARN: Code duplicated, block: B:108:0x026f  */
    /* JADX INFO: renamed from: d */
    private final Object m182d(Object obj) throws Exception {
        ik8 ik8Var;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i;
        LanguageContextNotification languageContextNotification;
        int i2;
        LanguageContextNotification languageContextNotification2;
        ul4 ul4Var = (ul4) this.f370b;
        bk8 bk8Var = (bk8) obj;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM LanguageContextEntity");
        try {
            int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "code");
            int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "pk");
            int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "url");
            int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "repetitionLingQs");
            int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lotdDates");
            int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "isUseFeed");
            int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "intense");
            int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "streakGoal");
            int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "streakDays");
            int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e0, "tags");
            int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e0, "supported");
            int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
            int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e0, "lastUsed");
            int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e0, "knownWords");
            int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e0, "grammarResourceSlug");
            int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e0, "feedLevels");
            int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e0, "scheduledForDeletion");
            int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e0, "email_lotd");
            int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e0, "email_weekly");
            int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e0, "site_lotd");
            int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e0, "site_weekly");
            ArrayList arrayList = new ArrayList();
            while (ik8VarMo2873e0.mo2876a0()) {
                String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                int i3 = iM14108v13;
                ArrayList arrayList2 = arrayList;
                int i4 = (int) ik8VarMo2873e0.getLong(iM14108v2);
                String strMo2875L2 = ik8VarMo2873e0.isNull(iM14108v3) ? null : ik8VarMo2873e0.mo2875L(iM14108v3);
                int i5 = (int) ik8VarMo2873e0.getLong(iM14108v4);
                String strMo2875L3 = ik8VarMo2873e0.isNull(iM14108v5) ? null : ik8VarMo2873e0.mo2875L(iM14108v5);
                qn3 qn3Var = ul4Var.f64044M;
                List listM20058M = qn3Var.m20058M(strMo2875L3);
                if (listM20058M == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                Integer numValueOf = ik8VarMo2873e0.isNull(iM14108v6) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v6));
                boolean z = true;
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                } else {
                    boolValueOf = null;
                }
                String strMo2875L4 = ik8VarMo2873e0.isNull(iM14108v7) ? null : ik8VarMo2873e0.mo2875L(iM14108v7);
                Integer numValueOf2 = ik8VarMo2873e0.isNull(iM14108v8) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v8));
                int i6 = (int) ik8VarMo2873e0.getLong(iM14108v9);
                List listM20058M2 = qn3Var.m20058M(ik8VarMo2873e0.isNull(iM14108v10) ? null : ik8VarMo2873e0.mo2875L(iM14108v10));
                if (listM20058M2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                Integer numValueOf3 = ik8VarMo2873e0.isNull(iM14108v11) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v11));
                if (numValueOf3 != null) {
                    boolValueOf2 = Boolean.valueOf(numValueOf3.intValue() != 0);
                } else {
                    boolValueOf2 = null;
                }
                String strMo2875L5 = ik8VarMo2873e0.isNull(iM14108v12) ? null : ik8VarMo2873e0.mo2875L(iM14108v12);
                String strMo2875L6 = ik8VarMo2873e0.isNull(i3) ? null : ik8VarMo2873e0.mo2875L(i3);
                int i7 = iM14108v14;
                Integer numValueOf4 = ik8VarMo2873e0.isNull(i7) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(i7));
                int i8 = iM14108v15;
                String strMo2875L7 = ik8VarMo2873e0.isNull(i8) ? null : ik8VarMo2873e0.mo2875L(i8);
                int i9 = iM14108v16;
                List listM20058M3 = qn3Var.m20058M(ik8VarMo2873e0.isNull(i9) ? null : ik8VarMo2873e0.mo2875L(i9));
                iM14108v17 = iM14108v17;
                Integer numValueOf5 = ik8VarMo2873e0.isNull(iM14108v17) ? null : Integer.valueOf((int) ik8VarMo2873e0.getLong(iM14108v17));
                if (numValueOf5 != null) {
                    if (numValueOf5.intValue() == 0) {
                        z = false;
                    }
                    boolValueOf3 = Boolean.valueOf(z);
                } else {
                    boolValueOf3 = null;
                }
                iM14108v18 = iM14108v18;
                try {
                    if (ik8VarMo2873e0.isNull(iM14108v18)) {
                        i = iM14108v19;
                        if (ik8VarMo2873e0.isNull(i)) {
                            iM14108v19 = i;
                            languageContextNotification = null;
                        }
                        iM14108v20 = iM14108v20;
                        if (ik8VarMo2873e0.isNull(iM14108v20)) {
                            i2 = iM14108v21;
                            if (!ik8VarMo2873e0.isNull(i2)) {
                                ik8Var = ik8VarMo2873e0;
                                languageContextNotification2 = null;
                            }
                            arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                            iM14108v21 = i2;
                            iM14108v = iM14108v;
                            iM14108v13 = i3;
                            ul4Var = ul4Var;
                            iM14108v2 = iM14108v2;
                            arrayList = arrayList2;
                            iM14108v16 = i9;
                            iM14108v5 = iM14108v5;
                            ik8VarMo2873e0 = ik8Var;
                            iM14108v14 = i7;
                            iM14108v15 = i8;
                            iM14108v3 = iM14108v3;
                            iM14108v4 = iM14108v4;
                        } else {
                            i2 = iM14108v21;
                        }
                        ik8Var = ik8VarMo2873e0;
                        languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(i2));
                        arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                        iM14108v21 = i2;
                        iM14108v = iM14108v;
                        iM14108v13 = i3;
                        ul4Var = ul4Var;
                        iM14108v2 = iM14108v2;
                        arrayList = arrayList2;
                        iM14108v16 = i9;
                        iM14108v5 = iM14108v5;
                        ik8VarMo2873e0 = ik8Var;
                        iM14108v14 = i7;
                        iM14108v15 = i8;
                        iM14108v3 = iM14108v3;
                        iM14108v4 = iM14108v4;
                    } else {
                        i = iM14108v19;
                    }
                    if (ik8VarMo2873e0.isNull(iM14108v20)) {
                        i2 = iM14108v21;
                        if (!ik8VarMo2873e0.isNull(i2)) {
                            ik8Var = ik8VarMo2873e0;
                            languageContextNotification2 = null;
                        }
                        arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                        iM14108v21 = i2;
                        iM14108v = iM14108v;
                        iM14108v13 = i3;
                        ul4Var = ul4Var;
                        iM14108v2 = iM14108v2;
                        arrayList = arrayList2;
                        iM14108v16 = i9;
                        iM14108v5 = iM14108v5;
                        ik8VarMo2873e0 = ik8Var;
                        iM14108v14 = i7;
                        iM14108v15 = i8;
                        iM14108v3 = iM14108v3;
                        iM14108v4 = iM14108v4;
                    } else {
                        i2 = iM14108v21;
                    }
                    languageContextNotification2 = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v20), ik8VarMo2873e0.mo2875L(i2));
                    arrayList2.add(new LanguageContextEntity(strMo2875L, i4, strMo2875L2, i5, listM20058M, languageContextNotification, languageContextNotification2, boolValueOf, strMo2875L4, numValueOf2, i6, listM20058M2, boolValueOf2, strMo2875L5, strMo2875L6, numValueOf4, strMo2875L7, listM20058M3, boolValueOf3));
                    iM14108v21 = i2;
                    iM14108v = iM14108v;
                    iM14108v13 = i3;
                    ul4Var = ul4Var;
                    iM14108v2 = iM14108v2;
                    arrayList = arrayList2;
                    iM14108v16 = i9;
                    iM14108v5 = iM14108v5;
                    ik8VarMo2873e0 = ik8Var;
                    iM14108v14 = i7;
                    iM14108v15 = i8;
                    iM14108v3 = iM14108v3;
                    iM14108v4 = iM14108v4;
                } catch (Throwable th) {
                    th = th;
                    ik8Var.close();
                    throw th;
                }
                iM14108v19 = i;
                languageContextNotification = new LanguageContextNotification(ik8VarMo2873e0.mo2875L(iM14108v18), ik8VarMo2873e0.mo2875L(i));
                iM14108v20 = iM14108v20;
                ik8Var = ik8VarMo2873e0;
            }
            ik8 ik8Var2 = ik8VarMo2873e0;
            ArrayList arrayList3 = arrayList;
            ik8Var2.close();
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            ik8Var = ik8VarMo2873e0;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r12v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v14 ??, new type: an0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v15 ??, new type: an0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: an0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // p000.vi3
    public final java.lang.Object invoke(java.lang.Object r43) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0011a9.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C0011a9(Object obj, int i) {
        this.f369a = i;
        this.f370b = obj;
    }
}
