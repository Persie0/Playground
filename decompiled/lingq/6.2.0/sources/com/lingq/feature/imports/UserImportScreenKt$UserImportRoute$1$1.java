package com.lingq.feature.imports;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.a24;
import p000.b24;
import p000.c24;
import p000.d24;
import p000.gm5;
import p000.ika;
import p000.jka;
import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.y14;
import p000.z14;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class UserImportScreenKt$UserImportRoute$1$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        d24 d24Var = (d24) obj;
        d24Var.getClass();
        C2109f c2109f = (C2109f) this.f47704b;
        c2109f.getClass();
        if (d24Var.equals(b24.f7791a)) {
            wfb.m23926u(lda.m16103C(c2109f), c2109f.f26180l, null, new UserImportViewModel$importLesson$1(c2109f, null), 2);
        } else if (d24Var.equals(a24.f91a)) {
            c2109f.m9016W2();
        } else if (d24Var instanceof z14) {
            c2109f.m9018Y2(((z14) d24Var).f70746a);
        } else if (d24Var instanceof c24) {
            String str = ((c24) d24Var).f9350a;
            str.getClass();
            jka jkaVar = c2109f.f26170b;
            jkaVar.mo9011N0(ika.m13999a((ika) jkaVar.mo9014u2().getValue(), null, str, null, null, null, null, null, null, null, 1021));
        } else {
            if (!(d24Var instanceof y14)) {
                gm5.m12750e();
                return null;
            }
            wfb.m23926u(lda.m16103C(c2109f), null, null, new UserImportViewModel$updateAutoOpenAfterImport$1(c2109f, ((y14) d24Var).f69091a, null), 3);
        }
        return xfa.f68157a;
    }
}
