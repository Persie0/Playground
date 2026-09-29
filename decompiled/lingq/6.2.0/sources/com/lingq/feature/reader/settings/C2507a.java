package com.lingq.feature.reader.settings;

import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.domain.C1869h;
import com.lingq.core.settings.theme.C1882b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c13;
import p000.c18;
import p000.hm5;
import p000.km7;
import p000.m83;
import p000.nz9;
import p000.si7;
import p000.un1;
import p000.va3;
import p000.vs3;
import p000.xi9;
import p000.yz7;

/* JADX INFO: renamed from: com.lingq.feature.reader.settings.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2507a {

    /* JADX INFO: renamed from: a */
    public final C1882b f30377a;

    /* JADX INFO: renamed from: b */
    public final C3244l f30378b;

    /* JADX INFO: renamed from: c */
    public final C3244l f30379c;

    /* JADX INFO: renamed from: d */
    public final c18 f30380d;

    public C2507a(C1882b c1882b, si7 si7Var, km7 km7Var, va3 va3Var, hm5 hm5Var, C1869h c1869h, C1869h c1869h2, C1869h c1869h3, C1869h c1869h4, un1 un1Var) {
        si7Var.getClass();
        km7Var.getClass();
        va3Var.getClass();
        hm5Var.getClass();
        un1Var.getClass();
        this.f30377a = c1882b;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f30378b = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431));
        this.f30379c = c3244lM17114d2;
        this.f30380d = AbstractC3224d.m15520B(c3244lM17114d2, un1Var, xi9.f68262a, new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431));
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(new c13(c3244lM17114d, 4), new ReaderSettingsStateHolder$special$$inlined$flatMapLatest$1(this, null)), new ReaderSettingsStateHolder$3(this, null), 2), un1Var);
    }
}
