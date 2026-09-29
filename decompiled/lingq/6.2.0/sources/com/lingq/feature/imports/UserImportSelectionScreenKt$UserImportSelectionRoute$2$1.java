package com.lingq.feature.imports;

import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.C3244l;
import p000.gm5;
import p000.ika;
import p000.jka;
import p000.qla;
import p000.u91;
import p000.vi3;
import p000.vk9;
import p000.wka;
import p000.xfa;
import p000.xka;
import p000.yka;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class UserImportSelectionScreenKt$UserImportSelectionRoute$2$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        yka ykaVar = (yka) obj;
        ykaVar.getClass();
        C2108e c2108e = (C2108e) this.f47704b;
        C3244l c3244l = c2108e.f26164l;
        if (ykaVar instanceof wka) {
            String str = ((wka) ykaVar).f66982a;
            str.getClass();
            jka jkaVar = c2108e.f26154b;
            ika ikaVar = (ika) jkaVar.mo9014u2().getValue();
            int i = qla.f57917a[c2108e.f26161i.ordinal()];
            if (i == 1) {
                ikaVar.getClass();
                ikaVar.f44240d = str;
                jkaVar.mo9011N0(ikaVar);
            } else if (i == 2) {
                if (str.equals("__CREATE_NEW_COURSE__")) {
                    str = (String) c3244l.getValue();
                }
                ikaVar.getClass();
                str.getClass();
                ikaVar.f44239c = str;
                jkaVar.mo9011N0(ikaVar);
            } else if (i == 3) {
                ikaVar.getClass();
                ikaVar.f44237a = str;
                jkaVar.mo9011N0(ikaVar);
            } else if (i == 4) {
                ArrayList arrayListM22624p1 = u91.m22624p1(ikaVar.f44245i);
                if (arrayListM22624p1.contains(str)) {
                    arrayListM22624p1.remove(str);
                } else {
                    arrayListM22624p1.add(str);
                }
                ikaVar.f44245i = arrayListM22624p1;
                jkaVar.mo9011N0(ikaVar);
            }
        } else {
            if (!(ykaVar instanceof xka)) {
                gm5.m12750e();
                return null;
            }
            String string = vk9.m23376L0(((xka) ykaVar).f68320a).toString();
            string.getClass();
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, string));
        }
        return xfa.f68157a;
    }
}
