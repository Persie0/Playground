package hn;

import dm.C5207g;
import fo.C5600f;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractC6890a;
import mn.C7647d;
import p139go.InterfaceC5853g;
import p266n.C7669f;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p543do.AbstractC5257t;
import p543do.C5258t0;
import pn.C8413d;
import sm.InterfaceC9073a;
import sm.InterfaceC9075c;

/* JADX INFO: renamed from: hn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6088h extends AbstractC6890a<InterfaceC9075c> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9073a f35835a;

    /* JADX INFO: renamed from: b */
    public final boolean f35836b;

    /* JADX INFO: renamed from: c */
    public final C7669f f35837c;

    /* JADX INFO: renamed from: d */
    public final AnnotationQualifierApplicabilityType f35838d;

    /* JADX INFO: renamed from: e */
    public final boolean f35839e;

    public /* synthetic */ C6088h(InterfaceC9073a interfaceC9073a, boolean z10, C7669f c7669f, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        this(interfaceC9073a, z10, c7669f, annotationQualifierApplicabilityType, false);
    }

    public C6088h(InterfaceC9073a interfaceC9073a, boolean z10, C7669f c7669f, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z11) {
        C5207g.m11111f(c7669f, "containerContext");
        C5207g.m11111f(annotationQualifierApplicabilityType, "containerApplicabilityType");
        this.f35835a = interfaceC9073a;
        this.f35836b = z10;
        this.f35837c = c7669f;
        this.f35838d = annotationQualifierApplicabilityType;
        this.f35839e = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final C7647d m12523e(InterfaceC5853g interfaceC5853g) {
        C5600f c5600f = C5258t0.f33352a;
        InterfaceC8834e interfaceC8834eMo11235q = ((AbstractC5257t) interfaceC5853g).mo11250X0().mo11235q();
        C7647d c7647dM16448g = null;
        InterfaceC8830c interfaceC8830c = interfaceC8834eMo11235q instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo11235q : null;
        if (interfaceC8830c != null) {
            c7647dM16448g = C8413d.m16448g(interfaceC8830c);
        }
        return c7647dM16448g;
    }
}
