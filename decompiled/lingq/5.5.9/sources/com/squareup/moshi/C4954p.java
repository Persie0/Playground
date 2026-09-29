package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Set;
import p439vk.C9756b;
import tk.C9312p;
import uk.C9553b;

/* JADX INFO: renamed from: com.squareup.moshi.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C4954p implements AbstractC4949k.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Type f32268a = Date.class;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC4949k f32269b;

    public C4954p(C9553b c9553b) {
        this.f32269b = c9553b;
    }

    @Override // com.squareup.moshi.AbstractC4949k.a
    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
        if (set.isEmpty()) {
            Set<Annotation> set2 = C9756b.f49811a;
            if (C9312p.m17657b(this.f32268a, type)) {
                return this.f32269b;
            }
        }
        return null;
    }
}
