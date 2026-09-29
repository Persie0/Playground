package com.lingq.core.settings.reader;

import com.lingq.core.data.repository.C1297m;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.n83;
import p000.nm7;
import p000.qm7;
import p000.si7;

/* JADX INFO: renamed from: com.lingq.core.settings.reader.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1879a {

    /* JADX INFO: renamed from: a */
    public final si7 f23068a;

    /* JADX INFO: renamed from: b */
    public final nm7 f23069b;

    /* JADX INFO: renamed from: c */
    public final C1297m f23070c;

    /* JADX INFO: renamed from: d */
    public final C1307w f23071d;

    public C1879a(si7 si7Var, nm7 nm7Var, C1297m c1297m, C1307w c1307w) {
        si7Var.getClass();
        nm7Var.getClass();
        c1297m.getClass();
        c1307w.getClass();
        this.f23068a = si7Var;
        this.f23069b = nm7Var;
        this.f23070c = c1297m;
        this.f23071d = c1307w;
    }

    /* JADX INFO: renamed from: a */
    public final n83 m8652a() {
        qm7 qm7Var = ((C1369b) this.f23069b).f18480m;
        C1368a c1368a = (C1368a) this.f23068a;
        return AbstractC3224d.m15530i(qm7Var, c1368a.f18385X0, c1368a.f18387Y0, AbstractC3224d.m15530i(c1368a.f18389Z0, c1368a.f18392a1, c1368a.f18395b1, c1368a.f18398c1, c1368a.f18401d1, new ReaderSettingsProvider$observeAsianScriptData$1(null)), AbstractC3224d.m15530i(c1368a.f18437p1, c1368a.f18440q1, c1368a.f18443r1, c1368a.f18446s1, c1368a.f18449t1, new ReaderSettingsProvider$observeAsianScriptData$2(null)), new ReaderSettingsProvider$observeAsianScriptData$3(null));
    }

    /* JADX INFO: renamed from: b */
    public final C3228h m8653b() {
        return new C3228h(this.f23070c.m7329c(), ((C1369b) this.f23069b).f18480m, new ReaderSettingsProvider$observeLocaleSettings$1(3, null));
    }

    /* JADX INFO: renamed from: c */
    public final n83 m8654c() {
        C1368a c1368a = (C1368a) this.f23068a;
        return AbstractC3224d.m15530i(c1368a.f18332D0, c1368a.f18410g1, c1368a.f18383W0, c1368a.f18419j1, c1368a.f18452u1, new ReaderSettingsProvider$observeReadingPreferences$1(null));
    }

    /* JADX INFO: renamed from: d */
    public final C3228h m8655d() {
        C1368a c1368a = (C1368a) this.f23068a;
        return new C3228h(c1368a.f18366O1, c1368a.f18369P1, new ReaderSettingsProvider$observeSentenceModePreferences$1(3, null));
    }

    /* JADX INFO: renamed from: e */
    public final C3235e m8656e() {
        C1368a c1368a = (C1368a) this.f23068a;
        return AbstractC3224d.m15521C(new C3228h(AbstractC3224d.m15530i(c1368a.f18362N0, c1368a.f18365O0, c1368a.f18371Q0, c1368a.f18373R0, c1368a.f18379U0, new ReaderSettingsProvider$observeTtsPreferences$basePrefs$1(null)), ((C1369b) this.f23069b).f18480m, new ReaderSettingsProvider$observeTtsPreferences$1(3, null)), new C1878x1e185a4a(null, this));
    }

    /* JADX INFO: renamed from: f */
    public final C3228h m8657f() {
        C1368a c1368a = (C1368a) this.f23068a;
        return new C3228h(AbstractC3224d.m15530i(c1368a.f18353K0, c1368a.f18381V0, c1368a.f18467z1, c1368a.f18464y1, c1368a.f18422k1, new ReaderSettingsProvider$observeWordsPreferences$1(null)), c1368a.f18434o1, new ReaderSettingsProvider$observeWordsPreferences$2$1(3, null));
    }
}
