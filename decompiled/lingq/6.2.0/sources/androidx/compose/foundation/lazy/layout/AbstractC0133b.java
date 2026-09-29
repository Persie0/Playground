package androidx.compose.foundation.lazy.layout;

import p000.C3047gq;
import p000.jv4;
import p000.vi3;
import p000.x94;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0133b {
    /* JADX WARN: Code duplicated, block: B:123:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: ItemFoundInScroll -> 0x01c2, TryCatch #7 {ItemFoundInScroll -> 0x01c2, blocks: (B:37:0x00c9, B:38:0x00cb, B:39:0x00ce, B:57:0x011e, B:40:0x00d7), top: B:123:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: ItemFoundInScroll -> 0x01c2, TRY_LEAVE, TryCatch #7 {ItemFoundInScroll -> 0x01c2, blocks: (B:37:0x00c9, B:38:0x00cb, B:39:0x00ce, B:57:0x011e, B:40:0x00d7), top: B:123:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3 A[Catch: ItemFoundInScroll -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #5 {ItemFoundInScroll -> 0x01bc, blocks: (B:35:0x00c5, B:42:0x00e3, B:56:0x010d, B:58:0x0123, B:62:0x0138, B:66:0x0140), top: B:119:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [jv4] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, jv4] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0190 -> B:114:0x019b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m993a(p000.jv4 r28, int r29, int r30, int r31, p000.fb2 r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AbstractC0133b.m993a(jv4, int, int, int, fb2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m994b(boolean z, jv4 jv4Var, int i, int i2) {
        if (z) {
            if (jv4Var.m14685c() > i) {
                return true;
            }
            return jv4Var.m14685c() == i && jv4Var.m14686d() > i2;
        }
        if (jv4Var.m14685c() < i) {
            return true;
        }
        return jv4Var.m14685c() == i && jv4Var.m14686d() < i2;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m995f(jv4 jv4Var, int i) {
        return i <= jv4Var.m14687e() && jv4Var.m14685c() <= i;
    }

    /* JADX INFO: renamed from: c */
    public Object m996c(int i) {
        x94 x94VarM12804h = mo997d().m12804h(i);
        return x94VarM12804h.f67974c.getType().invoke(Integer.valueOf(i - x94VarM12804h.f67972a));
    }

    /* JADX INFO: renamed from: d */
    public abstract C3047gq mo997d();

    /* JADX INFO: renamed from: e */
    public Object m998e(int i) {
        Object objInvoke;
        x94 x94VarM12804h = mo997d().m12804h(i);
        int i2 = i - x94VarM12804h.f67972a;
        vi3 key = x94VarM12804h.f67974c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
