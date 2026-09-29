package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p000.C3386nv;
import p000.gc1;
import p000.hc1;
import p000.lb2;
import p000.p58;
import p000.q3d;
import p000.r46;
import p000.s46;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(s46.class);
        gc1VarM13189b.m12471a(new lb2(2, 0, r46.class));
        gc1VarM13189b.f40520f = p58.f55616j;
        Object[] objArr = {gc1VarM13189b.m12472b()};
        for (int i = 0; i < 1; i++) {
            q3d q3dVar = zzp.f11966b;
            if (objArr[i] == null) {
                C3386nv.m17635v(ux5.m22988k(i, "at index "));
                return null;
            }
        }
        return zzp.m5461j(objArr, 1);
    }
}
