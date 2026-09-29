package p543do;

import dm.C5207g;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5854h;
import sm.InterfaceC9075c;

/* JADX INFO: renamed from: do.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5265x extends AbstractC5262v0 implements InterfaceC5853g, InterfaceC5854h {
    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5265x mo11217b1(boolean z10);

    @Override // p543do.AbstractC5262v0
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5265x mo11243d1(C5238j0 c5238j0);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<InterfaceC9075c> it = mo11289w().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", DescriptorRenderer.f39547b.mo13981p(it.next(), null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb2.append(strArr[i10]);
            }
        }
        sb2.append(mo11250X0());
        if (!mo11240V0().isEmpty()) {
            C6752c.m13429W(mo11240V0(), sb2, ", ", "<", ">", null, 112);
        }
        if (mo11242Y0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
