package com.google.mlkit.vision.text.internal;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p000.C3386nv;
import p000.bjd;
import p000.g06;
import p000.gc1;
import p000.hc1;
import p000.j6d;
import p000.lb2;
import p000.mpb;
import p000.ngd;
import p000.ux5;
import p000.x8d;
import p000.zu2;

/* JADX INFO: loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(x8d.class);
        gc1VarM13189b.m12471a(lb2.m16059c(g06.class));
        gc1VarM13189b.f40520f = new ngd();
        hc1 hc1VarM12472b = gc1VarM13189b.m12472b();
        gc1 gc1VarM13189b2 = hc1.m13189b(j6d.class);
        gc1VarM13189b2.m12471a(lb2.m16059c(x8d.class));
        gc1VarM13189b2.m12471a(lb2.m16059c(zu2.class));
        gc1VarM13189b2.f40520f = new bjd();
        Object[] objArr = {hc1VarM12472b, gc1VarM13189b2.m12472b()};
        for (int i = 0; i < 2; i++) {
            mpb mpbVar = zzbk.f12087b;
            if (objArr[i] == null) {
                C3386nv.m17635v(ux5.m22988k(i, "at index "));
                return null;
            }
        }
        return zzbk.m5497j(objArr, 2);
    }
}
