package com.lingq.feature.reader.content.state;

import com.lingq.feature.reader.content.C2260a;
import java.util.LinkedHashSet;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.m83;
import p000.mv7;
import p000.un1;

/* JADX INFO: renamed from: com.lingq.feature.reader.content.state.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2265b {

    /* JADX INFO: renamed from: a */
    public final C3139j9 f28138a;

    /* JADX INFO: renamed from: b */
    public final un1 f28139b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f28140c;

    /* JADX INFO: renamed from: d */
    public final C3244l f28141d;

    /* JADX INFO: renamed from: e */
    public String f28142e;

    /* JADX INFO: renamed from: f */
    public int f28143f;

    /* JADX INFO: renamed from: g */
    public boolean f28144g;

    public C2265b(C3139j9 c3139j9, un1 un1Var) {
        un1Var.getClass();
        this.f28138a = c3139j9;
        this.f28139b = un1Var;
        this.f28140c = new LinkedHashSet();
        this.f28141d = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        this.f28142e = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m9271a(C2260a c2260a, C2264a c2264a) {
        c2260a.getClass();
        c2264a.getClass();
        if (this.f28144g) {
            return;
        }
        this.f28144g = true;
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new mv7(c2260a.f27957w, 10)), new ReaderLippManager$start$2(this, null), 2), this.f28139b);
    }
}
