package com.lingq.feature.reader.playback.state;

import com.lingq.feature.reader.content.C2260a;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.m83;
import p000.mv7;
import p000.un1;
import p000.vqb;

/* JADX INFO: renamed from: com.lingq.feature.reader.playback.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2468a {

    /* JADX INFO: renamed from: a */
    public final vqb f29814a;

    /* JADX INFO: renamed from: b */
    public final un1 f29815b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f29816c;

    /* JADX INFO: renamed from: d */
    public String f29817d;

    /* JADX INFO: renamed from: e */
    public boolean f29818e;

    public C2468a(vqb vqbVar, un1 un1Var) {
        un1Var.getClass();
        this.f29814a = vqbVar;
        this.f29815b = un1Var;
        this.f29816c = new LinkedHashSet();
        this.f29817d = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m9370a(C2260a c2260a) {
        c2260a.getClass();
        if (this.f29818e) {
            return;
        }
        this.f29818e = true;
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15536o(new mv7(c2260a.f27957w, 13)), new ReaderPrefetchManager$start$2(this, null), 2), this.f29815b);
    }
}
