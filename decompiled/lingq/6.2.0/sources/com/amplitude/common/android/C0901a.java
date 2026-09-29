package com.amplitude.common.android;

import android.content.Context;
import kotlin.AbstractC3192a;
import p000.C3460ph;
import p000.cs4;
import p000.ui3;

/* JADX INFO: renamed from: com.amplitude.common.android.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0901a {

    /* JADX INFO: renamed from: a */
    public final Context f11000a;

    /* JADX INFO: renamed from: b */
    public final boolean f11001b;

    /* JADX INFO: renamed from: c */
    public final boolean f11002c;

    /* JADX INFO: renamed from: d */
    public final cs4 f11003d;

    public C0901a(Context context, boolean z, boolean z2) {
        context.getClass();
        this.f11000a = context;
        this.f11001b = z;
        this.f11002c = z2;
        this.f11003d = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.common.android.AndroidContextProvider$cachedInfo$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return new C3460ph(this.f10999b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final C3460ph m5106a() {
        return (C3460ph) this.f11003d.getValue();
    }
}
