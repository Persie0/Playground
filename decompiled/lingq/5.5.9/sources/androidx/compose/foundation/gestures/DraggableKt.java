package androidx.compose.foundation.gestures;

import androidx.compose.p017ui.input.pointer.util.C0519a;
import cm.InterfaceC2052l;
import dm.C5207g;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p260m8.C7499b;
import p325po.InterfaceC8428d;
import p338qd.C8573r0;
import p375s0.C8941c;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableKt {
    /* JADX WARN: Code duplicated, block: B:107:0x01f7 A[EDGE_INSN: B:107:0x01f7->B:60:0x01f7 BREAK  A[LOOP:0: B:54:0x01cb->B:58:0x01e6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e6 A[LOOP:0: B:54:0x01cb->B:58:0x01e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x02ea -> B:105:0x02f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0229 -> B:92:0x0291). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0286 -> B:89:0x0287). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.io.Serializable m1454a(p060d1.InterfaceC5016c r19, p081e0.InterfaceC5301c1 r20, p081e0.InterfaceC5301c1 r21, androidx.compose.p017ui.input.pointer.util.C0519a r22, androidx.compose.foundation.gestures.Orientation r23, p464wl.InterfaceC9968c r24) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m1454a(d1.c, e0.c1, e0.c1, androidx.compose.ui.input.pointer.util.a, androidx.compose.foundation.gestures.Orientation, wl.c):java.io.Serializable");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m1455b(InterfaceC5016c interfaceC5016c, C5028o c5028o, long j10, final C0519a c0519a, final InterfaceC8428d interfaceC8428d, final boolean z10, Orientation orientation, InterfaceC9968c interfaceC9968c) {
        float fSignum = Math.signum(C8941c.m17164c(c5028o.f32837c));
        long j11 = c5028o.f32837c;
        interfaceC8428d.mo16479j(new AbstractC0414c.c(C8941c.m17166e(j11, C7499b.m14932c(C8941c.m17164c(j10) * fSignum, C8941c.m17165d(j10) * Math.signum(C8941c.m17165d(j11))))));
        if (z10) {
            j10 = C8941c.m17168g(-1.0f, j10);
        }
        interfaceC8428d.mo16479j(new AbstractC0414c.b(j10));
        return m1456c(interfaceC5016c, orientation, c5028o.f32835a, new InterfaceC2052l<C5028o, C9072e>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C5028o c5028o2) {
                C5028o c5028o3 = c5028o2;
                C5207g.m11111f(c5028o3, "event");
                C8573r0.m16665C(c0519a, c5028o3);
                if (!C8573r0.m16677I(c5028o3)) {
                    long jM16696R0 = C8573r0.m16696R0(c5028o3, false);
                    c5028o3.m10713a();
                    if (z10) {
                        jM16696R0 = C8941c.m17168g(-1.0f, jM16696R0);
                    }
                    interfaceC8428d.mo16479j(new AbstractC0414c.b(jM16696R0));
                }
                return C9072e.f47360a;
            }
        }, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[LOOP:0: B:29:0x0098->B:33:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b8 A[EDGE_INSN: B:75:0x00b8->B:35:0x00b8 BREAK  A[LOOP:0: B:29:0x0098->B:33:0x00ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0089 -> B:28:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m1456c(p060d1.InterfaceC5016c r17, androidx.compose.foundation.gestures.Orientation r18, long r19, cm.InterfaceC2052l<? super p060d1.C5028o, sl.C9072e> r21, p464wl.InterfaceC9968c<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m1456c(d1.c, androidx.compose.foundation.gestures.Orientation, long, cm.l, wl.c):java.lang.Object");
    }
}
