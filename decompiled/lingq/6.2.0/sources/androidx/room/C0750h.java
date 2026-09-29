package androidx.room;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3288l7;
import p000.C3386nv;
import p000.b64;
import p000.ch7;
import p000.e9a;
import p000.fa4;
import p000.np6;
import p000.qn1;
import p000.ui3;
import p000.ux5;
import p000.vi3;
import p000.vl1;
import p000.wfb;
import p000.wq1;
import p000.wx8;
import p000.xfa;
import p000.xwc;

/* JADX INFO: renamed from: androidx.room.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0750h {

    /* JADX INFO: renamed from: l */
    public static final String[] f6972l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f6973a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f6974b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f6975c;

    /* JADX INFO: renamed from: d */
    public final boolean f6976d;

    /* JADX INFO: renamed from: e */
    public final vi3 f6977e;

    /* JADX INFO: renamed from: g */
    public final String[] f6979g;

    /* JADX INFO: renamed from: h */
    public final np6 f6980h;

    /* JADX INFO: renamed from: i */
    public final C0737b f6981i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f6982j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public ui3 f6983k = new C3288l7(16);

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f6978f = new LinkedHashMap();

    public C0750h(AbstractC0746d abstractC0746d, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, vi3 vi3Var) {
        String lowerCase;
        this.f6973a = abstractC0746d;
        this.f6974b = linkedHashMap;
        this.f6975c = linkedHashMap2;
        this.f6976d = z;
        this.f6977e = vi3Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f6978f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f6974b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f6979g = strArr2;
        for (Map.Entry entry : this.f6974b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f6978f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f6978f;
                linkedHashMap3.put(lowerCase4, AbstractC3194a.m15361N(lowerCase3, linkedHashMap3));
            }
        }
        this.f6980h = new np6(this.f6979g.length);
        this.f6981i = new C0737b(this.f6979g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m2852a(C0750h c0750h, ch7 ch7Var, ContinuationImpl continuationImpl) throws Throwable {
        TriggerBasedInvalidationTracker$checkInvalidatedTables$1 triggerBasedInvalidationTracker$checkInvalidatedTables$1;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$checkInvalidatedTables$1) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = (TriggerBasedInvalidationTracker$checkInvalidatedTables$1) continuationImpl;
            int i = triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6757d;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6757d = i - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(c0750h, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(c0750h, continuationImpl);
        }
        Object objMo2817d = triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6755b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6757d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo2817d);
            wx8 wx8Var = new wx8(19);
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6754a = ch7Var;
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6757d = 1;
            objMo2817d = ch7Var.mo2817d("SELECT * FROM room_table_modification_log WHERE invalidated = 1", wx8Var, triggerBasedInvalidationTracker$checkInvalidatedTables$1);
            if (objMo2817d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6754a;
            AbstractC3193b.m15359b(objMo2817d);
            return set;
        }
        ch7Var = (ch7) triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6754a;
        AbstractC3193b.m15359b(objMo2817d);
        Set set2 = (Set) objMo2817d;
        if (!set2.isEmpty()) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6754a = set2;
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.f6757d = 2;
            if (xwc.m24780r(ch7Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", triggerBasedInvalidationTracker$checkInvalidatedTables$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
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
    /* JADX INFO: renamed from: b */
    public static final Object m2853b(C0750h c0750h, ContinuationImpl continuationImpl) throws Throwable {
        TriggerBasedInvalidationTracker$notifyInvalidation$1 triggerBasedInvalidationTracker$notifyInvalidation$1;
        b64 b64Var;
        Object value;
        int[] iArr;
        AbstractC0746d abstractC0746d = c0750h.f6973a;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$notifyInvalidation$1) {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = (TriggerBasedInvalidationTracker$notifyInvalidation$1) continuationImpl;
            int i = triggerBasedInvalidationTracker$notifyInvalidation$1.f6772d;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$notifyInvalidation$1.f6772d = i - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(c0750h, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(c0750h, continuationImpl);
        }
        Object obj = triggerBasedInvalidationTracker$notifyInvalidation$1.f6770b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerBasedInvalidationTracker$notifyInvalidation$1.f6772d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            b64 b64Var2 = abstractC0746d.f6960g;
            boolean zM3351d = b64Var2.m3351d();
            EmptySet emptySet = EmptySet.f47640a;
            if (!zM3351d) {
                return emptySet;
            }
            try {
                if (!c0750h.f6982j.compareAndSet(true, false)) {
                    b64Var2.m3369v();
                    return emptySet;
                }
                if (!((Boolean) c0750h.f6983k.mo0a()).booleanValue()) {
                    b64Var2.m3369v();
                    return emptySet;
                }
                C0735xcf25c6f6 c0735xcf25c6f6 = new C0735xcf25c6f6(c0750h, null);
                triggerBasedInvalidationTracker$notifyInvalidation$1.f6769a = b64Var2;
                triggerBasedInvalidationTracker$notifyInvalidation$1.f6772d = 1;
                Object objM2847t = abstractC0746d.m2847t(false, c0735xcf25c6f6, triggerBasedInvalidationTracker$notifyInvalidation$1);
                if (objM2847t == coroutineSingletons) {
                    return coroutineSingletons;
                }
                b64Var = b64Var2;
                obj = objM2847t;
            } catch (Throwable th) {
                th = th;
                b64Var = b64Var2;
                b64Var.m3369v();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b64Var = triggerBasedInvalidationTracker$notifyInvalidation$1.f6769a;
            try {
                AbstractC3193b.m15359b(obj);
            } catch (Throwable th2) {
                th = th2;
                b64Var.m3369v();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            C0737b c0737b = c0750h.f6981i;
            c0737b.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                C3244l c3244l = c0737b.f6824a;
                do {
                    value = c3244l.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!c3244l.m15570h(value, iArr));
            }
            ((InvalidationTracker$implementation$1) c0750h.f6977e).invoke(set);
        }
        b64Var.m3369v();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (p000.xwc.m24780r(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (p000.xwc.m24780r(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2854c(C0750h c0750h, e9a e9aVar, int i, ContinuationImpl continuationImpl) throws Throwable {
        TriggerBasedInvalidationTracker$startTrackingTable$1 triggerBasedInvalidationTracker$startTrackingTable$1;
        int i2;
        int i3;
        String[] strArr;
        ch7 ch7Var;
        int i4;
        String str;
        String str2;
        boolean z;
        ch7 ch7Var2 = e9aVar;
        int i5 = i;
        c0750h.getClass();
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$startTrackingTable$1) {
            triggerBasedInvalidationTracker$startTrackingTable$1 = (TriggerBasedInvalidationTracker$startTrackingTable$1) continuationImpl;
            int i6 = triggerBasedInvalidationTracker$startTrackingTable$1.f6790i;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$startTrackingTable$1.f6790i = i6 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$startTrackingTable$1 = new TriggerBasedInvalidationTracker$startTrackingTable$1(c0750h, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$startTrackingTable$1 = new TriggerBasedInvalidationTracker$startTrackingTable$1(c0750h, continuationImpl);
        }
        Object obj = triggerBasedInvalidationTracker$startTrackingTable$1.f6788g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = triggerBasedInvalidationTracker$startTrackingTable$1.f6790i;
        boolean z2 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = triggerBasedInvalidationTracker$startTrackingTable$1.f6785d;
                ch7 ch7Var3 = triggerBasedInvalidationTracker$startTrackingTable$1.f6782a;
                AbstractC3193b.m15359b(obj);
                i5 = i8;
                ch7Var2 = ch7Var3;
            } else {
                if (i7 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = triggerBasedInvalidationTracker$startTrackingTable$1.f6787f;
                i3 = triggerBasedInvalidationTracker$startTrackingTable$1.f6786e;
                i2 = triggerBasedInvalidationTracker$startTrackingTable$1.f6785d;
                strArr = triggerBasedInvalidationTracker$startTrackingTable$1.f6784c;
                str = triggerBasedInvalidationTracker$startTrackingTable$1.f6783b;
                ch7Var = triggerBasedInvalidationTracker$startTrackingTable$1.f6782a;
                AbstractC3193b.m15359b(obj);
                z = true;
            }
            i3++;
            z2 = z;
            if (i3 < i4) {
                return xfa.f68157a;
            }
            String str3 = strArr[i3];
            if (c0750h.f6976d) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            z = z2;
            StringBuilder sbM23000w = ux5.m23000w("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
            AbstractC3393o1.m17725C(sbM23000w, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strM24123s = wq1.m24123s(sbM23000w, i2, " AND invalidated = 0; END");
            triggerBasedInvalidationTracker$startTrackingTable$1.f6782a = ch7Var;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6783b = str;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6784c = strArr;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6785d = i2;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6786e = i3;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6787f = i4;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6790i = 2;
        } else {
            AbstractC3193b.m15359b(obj);
            String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)";
            triggerBasedInvalidationTracker$startTrackingTable$1.f6782a = ch7Var2;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6785d = i5;
            triggerBasedInvalidationTracker$startTrackingTable$1.f6790i = 1;
        }
        String str5 = c0750h.f6979g[i5];
        i2 = i5;
        i3 = 0;
        strArr = f6972l;
        ch7Var = ch7Var2;
        i4 = 3;
        str = str5;
        if (i3 < i4) {
            return xfa.f68157a;
        }
        String str6 = strArr[i3];
        if (c0750h.f6976d) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        z = z2;
        StringBuilder sbM23000w2 = ux5.m23000w("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str6, "` AFTER ");
        AbstractC3393o1.m17725C(sbM23000w2, str6, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
        String strM24123s2 = wq1.m24123s(sbM23000w2, i2, " AND invalidated = 0; END");
        triggerBasedInvalidationTracker$startTrackingTable$1.f6782a = ch7Var;
        triggerBasedInvalidationTracker$startTrackingTable$1.f6783b = str;
        triggerBasedInvalidationTracker$startTrackingTable$1.f6784c = strArr;
        triggerBasedInvalidationTracker$startTrackingTable$1.f6785d = i2;
        triggerBasedInvalidationTracker$startTrackingTable$1.f6786e = i3;
        triggerBasedInvalidationTracker$startTrackingTable$1.f6787f = i4;
        triggerBasedInvalidationTracker$startTrackingTable$1.f6790i = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m2855d(androidx.room.C0750h r8, p000.e9a r9, int r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            if (r0 == 0) goto L16
            r0 = r11
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1) r0
            int r1 = r0.f6798h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f6798h = r1
            goto L1b
        L16:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f6796f
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f6798h
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.f6795e
            int r9 = r0.f6794d
            java.lang.String[] r10 = r0.f6793c
            java.lang.String r2 = r0.f6792b
            ch7 r4 = r0.f6791a
            kotlin.AbstractC3193b.m15359b(r11)
            r11 = r10
            r10 = r4
            goto L84
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            r8 = 0
            return r8
        L3d:
            kotlin.AbstractC3193b.m15359b(r11)
            java.lang.String[] r8 = r8.f6979g
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.C0750h.f6972l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4f:
            if (r9 >= r8) goto L86
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = p000.ux5.m22986i(r6, r5, r4)
            r0.f6791a = r10
            r0.f6792b = r2
            r0.f6793c = r11
            r0.f6794d = r9
            r0.f6795e = r8
            r0.f6798h = r3
            java.lang.Object r4 = p000.xwc.m24780r(r10, r4, r0)
            if (r4 != r1) goto L84
            return r1
        L84:
            int r9 = r9 + r3
            goto L4f
        L86:
            xfa r8 = p000.xfa.f68157a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0750h.m2855d(androidx.room.h, e9a, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final void m2856e(ui3 ui3Var, ui3 ui3Var2) {
        ui3Var.getClass();
        ui3Var2.getClass();
        if (this.f6982j.compareAndSet(false, true)) {
            ui3Var.mo0a();
            vl1 vl1Var = this.f6973a.f6954a;
            if (vl1Var != null) {
                wfb.m23926u(vl1Var, new qn1(), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, ui3Var2, null), 2);
            } else {
                fa4.m11636J("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m2857f(ContinuationImpl continuationImpl) {
        TriggerBasedInvalidationTracker$syncTriggers$1 triggerBasedInvalidationTracker$syncTriggers$1;
        b64 b64Var;
        if (continuationImpl instanceof TriggerBasedInvalidationTracker$syncTriggers$1) {
            triggerBasedInvalidationTracker$syncTriggers$1 = (TriggerBasedInvalidationTracker$syncTriggers$1) continuationImpl;
            int i = triggerBasedInvalidationTracker$syncTriggers$1.f6802d;
            if ((i & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$syncTriggers$1.f6802d = i - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuationImpl);
            }
        } else {
            triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuationImpl);
        }
        Object obj = triggerBasedInvalidationTracker$syncTriggers$1.f6800b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = triggerBasedInvalidationTracker$syncTriggers$1.f6802d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            AbstractC0746d abstractC0746d = this.f6973a;
            b64 b64Var2 = abstractC0746d.f6960g;
            if (b64Var2.m3351d()) {
                try {
                    TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this, null);
                    triggerBasedInvalidationTracker$syncTriggers$1.f6799a = b64Var2;
                    triggerBasedInvalidationTracker$syncTriggers$1.f6802d = 1;
                    if (abstractC0746d.m2847t(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$syncTriggers$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    b64Var = b64Var2;
                    b64Var.m3369v();
                } catch (Throwable th) {
                    th = th;
                    b64Var = b64Var2;
                    b64Var.m3369v();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b64Var = triggerBasedInvalidationTracker$syncTriggers$1.f6799a;
            try {
                AbstractC3193b.m15359b(obj);
                b64Var.m3369v();
            } catch (Throwable th2) {
                th = th2;
                b64Var.m3369v();
                throw th;
            }
        }
        return xfa.f68157a;
    }
}
