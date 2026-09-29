package com.lingq.core.domain.model.cup;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import p000.lo8;
import p000.os1;
import p000.y38;
import p000.z21;

/* JADX INFO: renamed from: com.lingq.core.domain.model.cup.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1410b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1410b f19002a = new C1410b();

    public final KSerializer serializer() {
        return new lo8("com.lingq.core.domain.model.cup.CupBadge", y38.m24933a(os1.class), new z21[]{y38.m24933a(CupBadge$Champion.class), y38.m24933a(CupBadge$Participation.class), y38.m24933a(CupBadge$Streak.class), y38.m24933a(CupBadge$Unknown.class)}, new KSerializer[]{CupBadge$Champion$$serializer.INSTANCE, CupBadge$Participation$$serializer.INSTANCE, CupBadge$Streak$$serializer.INSTANCE, CupBadge$Unknown$$serializer.INSTANCE}, new Annotation[0]);
    }
}
