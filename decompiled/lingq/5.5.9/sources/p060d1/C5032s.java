package p060d1;

import androidx.compose.p017ui.node.LayoutNode;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p081e0.C5298b1;
import p166i1.C6151j;
import p166i1.InterfaceC6146g0;
import p338qd.C8573r0;
import p375s0.C8941c;

/* JADX INFO: renamed from: d1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5032s {

    /* JADX INFO: renamed from: a */
    public final LayoutNode f32863a;

    /* JADX INFO: renamed from: b */
    public final C5298b1 f32864b;

    /* JADX INFO: renamed from: c */
    public final C5029p f32865c;

    /* JADX INFO: renamed from: d */
    public final C6151j<InterfaceC6146g0> f32866d;

    /* JADX INFO: renamed from: e */
    public boolean f32867e;

    public C5032s(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "root");
        this.f32863a = layoutNode;
        this.f32864b = new C5298b1(layoutNode.f3758U.f35996b);
        this.f32865c = new C5029p();
        this.f32866d = new C6151j<>();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #0 {all -> 0x00f6, blocks: (B:6:0x0012, B:8:0x001e, B:10:0x0029, B:29:0x0056, B:30:0x0061, B:33:0x0069, B:35:0x0071, B:37:0x0077, B:41:0x007e, B:43:0x0092, B:44:0x009b, B:47:0x00ad, B:49:0x00b7, B:52:0x00be, B:53:0x00c2, B:55:0x00c8, B:57:0x00e0, B:13:0x0030, B:14:0x0034, B:16:0x003a, B:18:0x0044), top: B:72:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:6:0x0012, B:8:0x001e, B:10:0x0029, B:29:0x0056, B:30:0x0061, B:33:0x0069, B:35:0x0071, B:37:0x0077, B:41:0x007e, B:43:0x0092, B:44:0x009b, B:47:0x00ad, B:49:0x00b7, B:52:0x00be, B:53:0x00c2, B:55:0x00c8, B:57:0x00e0, B:13:0x0030, B:14:0x0034, B:16:0x003a, B:18:0x0044), top: B:72:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00be A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:6:0x0012, B:8:0x001e, B:10:0x0029, B:29:0x0056, B:30:0x0061, B:33:0x0069, B:35:0x0071, B:37:0x0077, B:41:0x007e, B:43:0x0092, B:44:0x009b, B:47:0x00ad, B:49:0x00b7, B:52:0x00be, B:53:0x00c2, B:55:0x00c8, B:57:0x00e0, B:13:0x0030, B:14:0x0034, B:16:0x003a, B:18:0x0044), top: B:72:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[Catch: all -> 0x00f6, TryCatch #0 {all -> 0x00f6, blocks: (B:6:0x0012, B:8:0x001e, B:10:0x0029, B:29:0x0056, B:30:0x0061, B:33:0x0069, B:35:0x0071, B:37:0x0077, B:41:0x007e, B:43:0x0092, B:44:0x009b, B:47:0x00ad, B:49:0x00b7, B:52:0x00be, B:53:0x00c2, B:55:0x00c8, B:57:0x00e0, B:13:0x0030, B:14:0x0034, B:16:0x003a, B:18:0x0044), top: B:72:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #0 {all -> 0x00f6, blocks: (B:6:0x0012, B:8:0x001e, B:10:0x0029, B:29:0x0056, B:30:0x0061, B:33:0x0069, B:35:0x0071, B:37:0x0077, B:41:0x007e, B:43:0x0092, B:44:0x009b, B:47:0x00ad, B:49:0x00b7, B:52:0x00be, B:53:0x00c2, B:55:0x00c8, B:57:0x00e0, B:13:0x0030, B:14:0x0034, B:16:0x003a, B:18:0x0044), top: B:72:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x009b A[EDGE_INSN: B:74:0x009b->B:44:0x009b BREAK  A[LOOP:0: B:30:0x0061->B:78:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: a */
    public final int m10716a(C5030q c5030q, InterfaceC5037x interfaceC5037x, boolean z10) {
        ?? r10;
        ?? r11;
        Iterator it;
        boolean zHasNext;
        C5298b1 c5298b1;
        Collection collectionValues;
        Iterator it2;
        C5028o c5028o;
        ?? r12;
        int i10;
        C5028o c5028o2;
        boolean z11;
        C6151j<InterfaceC6146g0> c6151j = this.f32866d;
        C5207g.m11111f(interfaceC5037x, "positionCalculator");
        if (this.f32867e) {
            return 0;
        }
        boolean z12 = true;
        try {
            this.f32867e = true;
            C5019f c5019fM10715a = this.f32865c.m10715a(c5030q, interfaceC5037x);
            Object obj = c5019fM10715a.f32814c;
            Collection collectionValues2 = ((Map) obj).values();
            if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                Iterator it3 = collectionValues2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C5028o c5028o3 = (C5028o) it3.next();
                        if ((c5028o3.f32838d || c5028o3.f32841g) != false) {
                            r10 = true;
                            break;
                        }
                    }
                }
                if (r10 == true) {
                    r11 = false;
                } else {
                    r11 = true;
                }
                it = ((Map) obj).values().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    c5298b1 = this.f32864b;
                    if (zHasNext) {
                        break;
                    }
                    c5028o2 = (C5028o) it.next();
                    if (r11 == false || C8573r0.m16675H(c5028o2)) {
                        if (c5028o2.f32842h == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        LayoutNode layoutNode = this.f32863a;
                        long j10 = c5028o2.f32837c;
                        C6151j<InterfaceC6146g0> c6151j2 = this.f32866d;
                        LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
                        layoutNode.m2131u(j10, c6151j2, z11, true);
                        if (!c6151j.isEmpty()) {
                            c5298b1.m11435a(c6151j, c5028o2.f32835a);
                            c6151j.clear();
                        }
                    }
                }
                ((C5023j) c5298b1.f33573b).m10710f();
                boolean zM11436c = c5298b1.m11436c(c5019fM10715a, z10);
                if (c5019fM10715a.f32813b) {
                    collectionValues = ((Map) obj).values();
                    if ((collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                        it2 = collectionValues.iterator();
                        do {
                            if (it2.hasNext()) {
                                c5028o = (C5028o) it2.next();
                                C5207g.m11111f(c5028o, "<this>");
                                if ((!C8941c.m17162a(C8573r0.m16696R0(c5028o, true), C8941c.f46888b)) || !c5028o.m10714b()) {
                                    r12 = false;
                                } else {
                                    r12 = true;
                                }
                            }
                        } while (r12 == false);
                        if (z12) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i11 = i10 | (zM11436c ? 1 : 0);
                        this.f32867e = false;
                        return i11;
                    }
                }
                z12 = false;
                if (z12) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = i10 | (zM11436c ? 1 : 0);
                this.f32867e = false;
                return i12;
            }
            r10 = false;
            if (r10 == true) {
                r11 = true;
            } else {
                r11 = false;
            }
            it = ((Map) obj).values().iterator();
            while (true) {
                zHasNext = it.hasNext();
                c5298b1 = this.f32864b;
                if (zHasNext) {
                    break;
                    break;
                }
                c5028o2 = (C5028o) it.next();
                if (r11 == false) {
                }
                if (c5028o2.f32842h == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                LayoutNode layoutNode2 = this.f32863a;
                long j11 = c5028o2.f32837c;
                C6151j<InterfaceC6146g0> c6151j3 = this.f32866d;
                LayoutNode.C0530b c0530b2 = LayoutNode.f3741d0;
                layoutNode2.m2131u(j11, c6151j3, z11, true);
                if (!c6151j.isEmpty()) {
                    c5298b1.m11435a(c6151j, c5028o2.f32835a);
                    c6151j.clear();
                }
            }
            ((C5023j) c5298b1.f33573b).m10710f();
            boolean zM11436c2 = c5298b1.m11436c(c5019fM10715a, z10);
            if (c5019fM10715a.f32813b) {
                collectionValues = ((Map) obj).values();
                if (collectionValues instanceof Collection) {
                    it2 = collectionValues.iterator();
                    do {
                        if (it2.hasNext()) {
                            c5028o = (C5028o) it2.next();
                            C5207g.m11111f(c5028o, "<this>");
                            if (!C8941c.m17162a(C8573r0.m16696R0(c5028o, true), C8941c.f46888b)) {
                                r12 = false;
                            } else {
                                r12 = false;
                            }
                        }
                    } while (r12 == false);
                } else {
                    it2 = collectionValues.iterator();
                    do {
                        if (it2.hasNext()) {
                            c5028o = (C5028o) it2.next();
                            C5207g.m11111f(c5028o, "<this>");
                            if (!C8941c.m17162a(C8573r0.m16696R0(c5028o, true), C8941c.f46888b)) {
                                r12 = false;
                            } else {
                                r12 = false;
                            }
                        }
                    } while (r12 == false);
                }
                if (z12) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i13 = i10 | (zM11436c2 ? 1 : 0);
                this.f32867e = false;
                return i13;
            }
            z12 = false;
            if (z12) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            int i14 = i10 | (zM11436c2 ? 1 : 0);
            this.f32867e = false;
            return i14;
        } catch (Throwable th2) {
            this.f32867e = false;
            throw th2;
        }
    }
}
