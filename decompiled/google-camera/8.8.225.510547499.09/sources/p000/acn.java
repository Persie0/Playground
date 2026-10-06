package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acn {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f88a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f89b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f90c = new Object();

    /* JADX INFO: renamed from: a */
    public static void m206a(Context context, int i, acl aclVar) {
        if (context.isRestricted()) {
            aclVar.m200c(-4);
        } else {
            m207b(context, i, new TypedValue(), 0, aclVar, false, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m207b(Context context, int i, TypedValue typedValue, int i2, acl aclVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceM208c = m208c(context, resources, typedValue, i, i2, aclVar, z, z2);
        if (typefaceM208c != null || aclVar != null || z2) {
            return typefaceM208c;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x03a6: MOVE (r3 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:200:0x03a6 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x03aa: MOVE (r3 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:202:0x03aa */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11051. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: c */
    private static android.graphics.Typeface m208c(android.content.Context r23, android.content.res.Resources r24, android.util.TypedValue r25, int r26, int r27, p000.acl r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.acn.m208c(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, acl, boolean, boolean):android.graphics.Typeface");
    }
}
