package com.lingq.feature.reader.video.state;

import java.util.LinkedHashSet;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.c18;
import p000.i84;
import p000.m83;
import p000.un1;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.state.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2596b {

    /* JADX INFO: renamed from: a */
    public final C3139j9 f31541a;

    /* JADX INFO: renamed from: b */
    public final un1 f31542b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f31543c;

    /* JADX INFO: renamed from: d */
    public final C3244l f31544d;

    /* JADX INFO: renamed from: e */
    public final C3244l f31545e;

    /* JADX INFO: renamed from: f */
    public String f31546f;

    /* JADX INFO: renamed from: g */
    public int f31547g;

    /* JADX INFO: renamed from: h */
    public boolean f31548h;

    /* JADX INFO: renamed from: i */
    public final C3244l f31549i;

    /* JADX INFO: renamed from: j */
    public final C3244l f31550j;

    public C2596b(C3139j9 c3139j9, un1 un1Var) {
        un1Var.getClass();
        this.f31541a = c3139j9;
        this.f31542b = un1Var;
        this.f31543c = new LinkedHashSet();
        C3244l c3244lM17114d = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f31544d = c3244lM17114d;
        this.f31545e = c3244lM17114d;
        this.f31546f = "";
        this.f31549i = AbstractC3352my.m17114d(null);
        this.f31550j = AbstractC3352my.m17114d(i84.f43682d);
    }

    /* JADX INFO: renamed from: a */
    public final void m9525a(c18 c18Var) {
        c18Var.getClass();
        if (this.f31548h) {
            return;
        }
        this.f31548h = true;
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15535n(AbstractC3224d.m15532k(this.f31549i, this.f31550j, c18Var, new VideoLippManager$start$1(this, null)), 300L)), new VideoLippManager$start$2(this, null), 2), this.f31542b);
    }
}
