package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.aj1;
import p000.bl3;
import p000.h43;
import p000.i43;
import p000.omd;
import p000.qv7;
import p000.sr2;
import p000.sy0;
import p000.ui3;
import p000.uk9;
import p000.ux8;
import p000.vi3;
import p000.vz1;
import p000.wx8;
import p000.x74;
import p000.y47;
import p000.z91;

/* JADX INFO: renamed from: kotlin.sequences.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3204c extends omd {
    /* JADX INFO: renamed from: i0 */
    public static ux8 m15413i0(Iterator it) {
        it.getClass();
        return new aj1(new z91(it, 2));
    }

    /* JADX INFO: renamed from: j0 */
    public static Object m15414j0(bl3 bl3Var) {
        Iterator it = ((ux8) bl3Var.f8659c).iterator();
        if (it.hasNext()) {
            return bl3Var.f8658b.invoke(it.next());
        }
        uk9.m22775i("Sequence is empty.");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public static Object m15415k0(i43 i43Var) {
        h43 h43Var = new h43(i43Var);
        if (h43Var.hasNext()) {
            return h43Var.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public static C3203b m15416l0(z91 z91Var, qv7 qv7Var) {
        SequencesKt___SequencesKt$flatMap$2 sequencesKt___SequencesKt$flatMap$2 = SequencesKt___SequencesKt$flatMap$2.f47720i;
        return new C3203b(z91Var, qv7Var);
    }

    /* JADX INFO: renamed from: m0 */
    public static ux8 m15417m0(ui3 ui3Var) {
        return new aj1(new bl3(ui3Var, new sy0(6, ui3Var), 0));
    }

    /* JADX INFO: renamed from: n0 */
    public static ux8 m15418n0(Object obj, vi3 vi3Var) {
        return obj == null ? sr2.f61293a : new bl3(new y47(obj, 10), vi3Var, 0);
    }

    /* JADX INFO: renamed from: o0 */
    public static String m15419o0(ux8 ux8Var, String str) {
        ux8Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : ux8Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            x74.m24349f(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: p0 */
    public static i43 m15420p0(ux8 ux8Var, vi3 vi3Var) {
        return new i43(new bl3(ux8Var, vi3Var, 1), false, new wx8(0));
    }

    /* JADX INFO: renamed from: q0 */
    public static List m15421q0(ux8 ux8Var) {
        Iterator it = ux8Var.iterator();
        if (!it.hasNext()) {
            return EmptyList.f47638a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return vz1.m23604J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
