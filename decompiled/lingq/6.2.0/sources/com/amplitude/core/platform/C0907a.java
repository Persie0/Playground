package com.amplitude.core.platform;

import com.amplitude.android.C0880b;
import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.utilities.C0914b;
import com.amplitude.core.utilities.C0915c;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3192a;
import kotlinx.coroutines.channels.C3211a;
import p000.C2926df;
import p000.bl2;
import p000.cs4;
import p000.cu0;
import p000.do7;
import p000.nn1;
import p000.ui3;
import p000.un1;
import p000.wfb;

/* JADX INFO: renamed from: com.amplitude.core.platform.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0907a {

    /* JADX INFO: renamed from: a */
    public final AbstractC0903a f11095a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f11096b;

    /* JADX INFO: renamed from: c */
    public final bl2 f11097c;

    /* JADX INFO: renamed from: d */
    public final C0914b f11098d;

    /* JADX INFO: renamed from: e */
    public final C0898b f11099e;

    /* JADX INFO: renamed from: f */
    public final un1 f11100f;

    /* JADX INFO: renamed from: g */
    public final cu0 f11101g;

    /* JADX INFO: renamed from: h */
    public final cu0 f11102h;

    /* JADX INFO: renamed from: i */
    public boolean f11103i;

    /* JADX INFO: renamed from: j */
    public boolean f11104j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f11105k;

    /* JADX INFO: renamed from: l */
    public final cs4 f11106l;

    public C0907a(AbstractC0903a abstractC0903a) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C0880b c0880b = abstractC0903a.f11016a;
        bl2 bl2Var = new bl2(c0880b, abstractC0903a.m5113g());
        C0914b c0914b = new C0914b(c0880b.f10795h);
        C0898b c0898bM5114h = abstractC0903a.m5114h();
        un1 un1Var = abstractC0903a.f11018c;
        C3211a c3211aM10525a = do7.m10525a(Integer.MAX_VALUE, 6, null);
        C3211a c3211aM10525a2 = do7.m10525a(Integer.MAX_VALUE, 6, null);
        c0898bM5114h.getClass();
        this.f11095a = abstractC0903a;
        this.f11096b = atomicInteger;
        this.f11097c = bl2Var;
        this.f11098d = c0914b;
        this.f11099e = c0898bM5114h;
        this.f11100f = un1Var;
        this.f11101g = c3211aM10525a;
        this.f11102h = c3211aM10525a2;
        this.f11105k = new AtomicInteger(1);
        this.f11106l = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.core.platform.EventPipeline$responseHandler$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0907a c0907a = this.f11077b;
                C0898b c0898b = c0907a.f11099e;
                AbstractC0903a abstractC0903a2 = c0907a.f11095a;
                C0880b c0880b2 = abstractC0903a2.f11016a;
                un1 un1Var2 = c0907a.f11100f;
                nn1 nn1Var = abstractC0903a2.f11021f;
                c0898b.getClass();
                un1Var2.getClass();
                return new C0915c(c0898b, c0907a, c0880b2, un1Var2, nn1Var, c0898b.f10989a, c0898b.f10991c.get());
            }
        });
        this.f11103i = false;
        this.f11104j = false;
        try {
            Runtime.getRuntime().addShutdownHook(new C2926df(this, 2));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5136a() {
        this.f11103i = true;
        AbstractC0903a abstractC0903a = this.f11095a;
        nn1 nn1Var = abstractC0903a.f11021f;
        EventPipeline$write$1 eventPipeline$write$1 = new EventPipeline$write$1(this, null);
        un1 un1Var = this.f11100f;
        wfb.m23926u(un1Var, nn1Var, null, eventPipeline$write$1, 2);
        wfb.m23926u(un1Var, abstractC0903a.f11020e, null, new EventPipeline$upload$1(this, null), 2);
    }
}
