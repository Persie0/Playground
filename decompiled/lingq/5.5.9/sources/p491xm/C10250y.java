package p491xm;

import ae.C0062b;
import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5843w;
import gn.InterfaceC5846z;
import java.lang.annotation.Annotation;
import java.util.Collection;
import mn.C7646c;
import mn.C7648e;

/* JADX INFO: renamed from: xm.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C10250y extends AbstractC10238m implements InterfaceC5846z {

    /* JADX INFO: renamed from: a */
    public final AbstractC10248w f51679a;

    /* JADX INFO: renamed from: b */
    public final Annotation[] f51680b;

    /* JADX INFO: renamed from: c */
    public final String f51681c;

    /* JADX INFO: renamed from: d */
    public final boolean f51682d;

    public C10250y(AbstractC10248w abstractC10248w, Annotation[] annotationArr, String str, boolean z10) {
        C5207g.m11111f(annotationArr, "reflectAnnotations");
        this.f51679a = abstractC10248w;
        this.f51680b = annotationArr;
        this.f51681c = str;
        this.f51682d = z10;
    }

    @Override // gn.InterfaceC5846z
    /* JADX INFO: renamed from: a */
    public final C7648e mo12288a() {
        String str = this.f51681c;
        if (str != null) {
            return C7648e.m15231i(str);
        }
        return null;
    }

    @Override // gn.InterfaceC5846z
    /* JADX INFO: renamed from: b */
    public final boolean mo12289b() {
        return this.f51682d;
    }

    @Override // gn.InterfaceC5846z
    /* JADX INFO: renamed from: c */
    public final InterfaceC5843w mo12290c() {
        return this.f51679a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: h */
    public final InterfaceC5820a mo12239h(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return C0062b.m295O0(this.f51680b, c7646c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C10250y.class.getName());
        sb2.append(": ");
        sb2.append(this.f51682d ? "vararg " : "");
        sb2.append(mo12288a());
        sb2.append(": ");
        sb2.append(this.f51679a);
        return sb2.toString();
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection mo12240w() {
        return C0062b.m325Y0(this.f51680b);
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }
}
