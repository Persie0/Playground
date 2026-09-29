package com.airbnb.lottie.compose;

import androidx.compose.runtime.AbstractC0278f;
import p000.dh9;
import p000.gc2;
import p000.gl5;
import p000.r46;
import p000.t66;
import p000.ui3;
import p000.xb1;
import p000.xc9;

/* JADX INFO: renamed from: com.airbnb.lottie.compose.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0874d implements dh9 {

    /* JADX INFO: renamed from: a */
    public final xb1 f10730a = r46.m20377b();

    /* JADX INFO: renamed from: b */
    public final t66 f10731b = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: c */
    public final t66 f10732c = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: d */
    public final gc2 f10733d;

    /* JADX INFO: renamed from: e */
    public final gc2 f10734e;

    public C0874d() {
        AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0874d c0874d = this.f10692b;
                return Boolean.valueOf(((gl5) ((xc9) c0874d.f10731b).getValue()) == null && ((Throwable) ((xc9) c0874d.f10732c).getValue()) == null);
            }
        });
        this.f10733d = AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0874d c0874d = this.f10690b;
                return Boolean.valueOf((((gl5) ((xc9) c0874d.f10731b).getValue()) == null && ((Throwable) ((xc9) c0874d.f10732c).getValue()) == null) ? false : true);
            }
        });
        AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return Boolean.valueOf(((Throwable) ((xc9) this.f10691b.f10732c).getValue()) != null);
            }
        });
        this.f10734e = AbstractC0278f.m1254d(new ui3() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return Boolean.valueOf(((gl5) ((xc9) this.f10693b.f10731b).getValue()) != null);
            }
        });
    }

    @Override // p000.dh9
    public final Object getValue() {
        return (gl5) ((xc9) this.f10731b).getValue();
    }
}
