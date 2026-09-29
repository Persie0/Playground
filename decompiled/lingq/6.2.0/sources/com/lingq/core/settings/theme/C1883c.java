package com.lingq.core.settings.theme;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.model.user.ProfileSettings;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.domain.C1869h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c13;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.gm5;
import p000.gy9;
import p000.hm5;
import p000.hy9;
import p000.iy9;
import p000.jy9;
import p000.km7;
import p000.ky9;
import p000.lda;
import p000.ly9;
import p000.m83;
import p000.my9;
import p000.ny9;
import p000.nz9;
import p000.oy9;
import p000.py9;
import p000.qy9;
import p000.ry9;
import p000.si7;
import p000.sy9;
import p000.ty9;
import p000.uy9;
import p000.va3;
import p000.vs3;
import p000.vy9;
import p000.wfb;
import p000.wta;
import p000.wy9;
import p000.xfa;
import p000.xy9;
import p000.yi7;
import p000.yz7;

/* JADX INFO: renamed from: com.lingq.core.settings.theme.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1883c extends wta implements cma {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f23301b;

    /* JADX INFO: renamed from: c */
    public final C1882b f23302c;

    /* JADX INFO: renamed from: d */
    public final si7 f23303d;

    /* JADX INFO: renamed from: e */
    public final km7 f23304e;

    /* JADX INFO: renamed from: f */
    public final va3 f23305f;

    /* JADX INFO: renamed from: g */
    public final hm5 f23306g;

    /* JADX INFO: renamed from: h */
    public final C1869h f23307h;

    /* JADX INFO: renamed from: i */
    public final C1869h f23308i;

    /* JADX INFO: renamed from: j */
    public final C1869h f23309j;

    /* JADX INFO: renamed from: k */
    public final C1869h f23310k;

    /* JADX INFO: renamed from: l */
    public final C1869h f23311l;

    /* JADX INFO: renamed from: m */
    public final C3244l f23312m;

    /* JADX INFO: renamed from: n */
    public final C3244l f23313n;

    /* JADX INFO: renamed from: o */
    public final C3244l f23314o;

    public C1883c(C1882b c1882b, si7 si7Var, km7 km7Var, va3 va3Var, hm5 hm5Var, C1869h c1869h, C1869h c1869h2, C1869h c1869h3, C1869h c1869h4, C1869h c1869h5, cma cmaVar) {
        si7Var.getClass();
        km7Var.getClass();
        va3Var.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        this.f23301b = cmaVar;
        this.f23302c = c1882b;
        this.f23303d = si7Var;
        this.f23304e = km7Var;
        this.f23305f = va3Var;
        this.f23306g = hm5Var;
        this.f23307h = c1869h;
        this.f23308i = c1869h2;
        this.f23309j = c1869h3;
        this.f23310k = c1869h4;
        this.f23311l = c1869h5;
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f23312m = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431));
        this.f23313n = c3244lM17114d2;
        this.f23314o = c3244lM17114d2;
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(new c13(c3244lM17114d, 12), new ThemeSettingsViewModel$special$$inlined$flatMapLatest$1(this, null)), new ThemeSettingsViewModel$3(this, null), 2), lda.m16103C(this));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: V2 */
    public static final Object m8684V2(C1883c c1883c, ReaderFont readerFont, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ThemeSettingsViewModel$setFont$1 themeSettingsViewModel$setFont$1;
        si7 si7Var = c1883c.f23303d;
        if (continuationImpl instanceof ThemeSettingsViewModel$setFont$1) {
            themeSettingsViewModel$setFont$1 = (ThemeSettingsViewModel$setFont$1) continuationImpl;
            int i = themeSettingsViewModel$setFont$1.f23277e;
            if ((i & Integer.MIN_VALUE) != 0) {
                themeSettingsViewModel$setFont$1.f23277e = i - Integer.MIN_VALUE;
            } else {
                themeSettingsViewModel$setFont$1 = new ThemeSettingsViewModel$setFont$1(c1883c, continuationImpl);
            }
        } else {
            themeSettingsViewModel$setFont$1 = new ThemeSettingsViewModel$setFont$1(c1883c, continuationImpl);
        }
        Object objM15541t = themeSettingsViewModel$setFont$1.f23275c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = themeSettingsViewModel$setFont$1.f23277e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            if (z) {
                c83 c83Var = ((C1368a) si7Var).f18466z0;
                themeSettingsViewModel$setFont$1.f23273a = readerFont;
                themeSettingsViewModel$setFont$1.f23274b = z;
                themeSettingsViewModel$setFont$1.f23277e = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, themeSettingsViewModel$setFont$1);
                if (objM15541t != coroutineSingletons) {
                }
            } else {
                va3 va3Var = c1883c.f23305f;
                themeSettingsViewModel$setFont$1.f23273a = null;
                themeSettingsViewModel$setFont$1.f23274b = z;
                themeSettingsViewModel$setFont$1.f23277e = 3;
                if (va3Var.mo8237v1(readerFont, themeSettingsViewModel$setFont$1) != coroutineSingletons) {
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            if (i2 == 3) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = themeSettingsViewModel$setFont$1.f23274b;
        readerFont = themeSettingsViewModel$setFont$1.f23273a;
        AbstractC3193b.m15359b(objM15541t);
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(c1883c.f23301b.mo4589b2(), readerFont);
        themeSettingsViewModel$setFont$1.f23273a = null;
        themeSettingsViewModel$setFont$1.f23274b = z;
        themeSettingsViewModel$setFont$1.f23277e = 2;
        if (((C1368a) si7Var).m7854M(linkedHashMapM15372Y, themeSettingsViewModel$setFont$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r0).m7856O(r4, r1) == r9) goto L29;
     */
    /* JADX INFO: renamed from: W2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8685W2(C1883c c1883c, double d, ContinuationImpl continuationImpl) throws Throwable {
        ThemeSettingsViewModel$setLineHeight$1 themeSettingsViewModel$setLineHeight$1;
        si7 si7Var = c1883c.f23303d;
        if (continuationImpl instanceof ThemeSettingsViewModel$setLineHeight$1) {
            themeSettingsViewModel$setLineHeight$1 = (ThemeSettingsViewModel$setLineHeight$1) continuationImpl;
            int i = themeSettingsViewModel$setLineHeight$1.f23281d;
            if ((i & Integer.MIN_VALUE) != 0) {
                themeSettingsViewModel$setLineHeight$1.f23281d = i - Integer.MIN_VALUE;
            } else {
                themeSettingsViewModel$setLineHeight$1 = new ThemeSettingsViewModel$setLineHeight$1(c1883c, continuationImpl);
            }
        } else {
            themeSettingsViewModel$setLineHeight$1 = new ThemeSettingsViewModel$setLineHeight$1(c1883c, continuationImpl);
        }
        Object objM15541t = themeSettingsViewModel$setLineHeight$1.f23279b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = themeSettingsViewModel$setLineHeight$1.f23281d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            yi7 yi7Var = ((C1368a) si7Var).f18332D0;
            themeSettingsViewModel$setLineHeight$1.f23278a = d;
            themeSettingsViewModel$setLineHeight$1.f23281d = 1;
            objM15541t = AbstractC3224d.m15541t(yi7Var, themeSettingsViewModel$setLineHeight$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            d = themeSettingsViewModel$setLineHeight$1.f23278a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        double d2 = ((Boolean) objM15541t).booleanValue() ? 1.15d : 0.0d;
        if (d >= d2) {
            d2 = d;
        }
        themeSettingsViewModel$setLineHeight$1.f23278a = d;
        themeSettingsViewModel$setLineHeight$1.f23281d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: X2 */
    public static final Object m8686X2(C1883c c1883c, yz7 yz7Var, ContinuationImpl continuationImpl) throws Throwable {
        ThemeSettingsViewModel$setReaderTheme$1 themeSettingsViewModel$setReaderTheme$1;
        yz7 yz7Var2;
        String str;
        yz7 yz7Var3 = yz7Var;
        si7 si7Var = c1883c.f23303d;
        if (continuationImpl instanceof ThemeSettingsViewModel$setReaderTheme$1) {
            themeSettingsViewModel$setReaderTheme$1 = (ThemeSettingsViewModel$setReaderTheme$1) continuationImpl;
            int i = themeSettingsViewModel$setReaderTheme$1.f23285d;
            if ((i & Integer.MIN_VALUE) != 0) {
                themeSettingsViewModel$setReaderTheme$1.f23285d = i - Integer.MIN_VALUE;
            } else {
                themeSettingsViewModel$setReaderTheme$1 = new ThemeSettingsViewModel$setReaderTheme$1(c1883c, continuationImpl);
            }
        } else {
            themeSettingsViewModel$setReaderTheme$1 = new ThemeSettingsViewModel$setReaderTheme$1(c1883c, continuationImpl);
        }
        Object obj = themeSettingsViewModel$setReaderTheme$1.f23283b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = themeSettingsViewModel$setReaderTheme$1.f23285d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            LqTheme lqTheme = yz7Var3.f70708d;
            themeSettingsViewModel$setReaderTheme$1.f23282a = yz7Var3;
            themeSettingsViewModel$setReaderTheme$1.f23285d = 1;
            if (((C1368a) si7Var).m7882h0(lqTheme, themeSettingsViewModel$setReaderTheme$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            yz7Var3 = themeSettingsViewModel$setReaderTheme$1.f23282a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yz7Var2 = themeSettingsViewModel$setReaderTheme$1.f23282a;
            AbstractC3193b.m15359b(obj);
        }
        str = yz7Var2.f70705a;
        themeSettingsViewModel$setReaderTheme$1.f23282a = null;
        themeSettingsViewModel$setReaderTheme$1.f23285d = 3;
        if (((C1368a) si7Var).m7859R(str, themeSettingsViewModel$setReaderTheme$1) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
        km7 km7Var = c1883c.f23304e;
        String lowerCase = yz7Var3.f70708d.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, lowerCase, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 16777215);
        themeSettingsViewModel$setReaderTheme$1.f23282a = yz7Var3;
        themeSettingsViewModel$setReaderTheme$1.f23285d = 2;
        ((C1267a) km7Var).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            yz7Var2 = yz7Var3;
            str = yz7Var2.f70705a;
            themeSettingsViewModel$setReaderTheme$1.f23282a = null;
            themeSettingsViewModel$setReaderTheme$1.f23285d = 3;
            if (((C1368a) si7Var).m7859R(str, themeSettingsViewModel$setReaderTheme$1) != coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: Y2 */
    public static final Object m8687Y2(C1883c c1883c, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ThemeSettingsViewModel$setSentenceTranslation$1 themeSettingsViewModel$setSentenceTranslation$1;
        si7 si7Var = c1883c.f23303d;
        if (continuationImpl instanceof ThemeSettingsViewModel$setSentenceTranslation$1) {
            themeSettingsViewModel$setSentenceTranslation$1 = (ThemeSettingsViewModel$setSentenceTranslation$1) continuationImpl;
            int i = themeSettingsViewModel$setSentenceTranslation$1.f23289d;
            if ((i & Integer.MIN_VALUE) != 0) {
                themeSettingsViewModel$setSentenceTranslation$1.f23289d = i - Integer.MIN_VALUE;
            } else {
                themeSettingsViewModel$setSentenceTranslation$1 = new ThemeSettingsViewModel$setSentenceTranslation$1(c1883c, continuationImpl);
            }
        } else {
            themeSettingsViewModel$setSentenceTranslation$1 = new ThemeSettingsViewModel$setSentenceTranslation$1(c1883c, continuationImpl);
        }
        Object objM15541t = themeSettingsViewModel$setSentenceTranslation$1.f23287b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = themeSettingsViewModel$setSentenceTranslation$1.f23289d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            themeSettingsViewModel$setSentenceTranslation$1.f23286a = z;
            themeSettingsViewModel$setSentenceTranslation$1.f23289d = 1;
            if (((C1368a) si7Var).m7857P(z, themeSettingsViewModel$setSentenceTranslation$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = themeSettingsViewModel$setSentenceTranslation$1.f23286a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM15541t);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = themeSettingsViewModel$setSentenceTranslation$1.f23286a;
            AbstractC3193b.m15359b(objM15541t);
        }
        if (((Number) objM15541t).doubleValue() < 1.15d) {
            themeSettingsViewModel$setSentenceTranslation$1.f23286a = z;
            themeSettingsViewModel$setSentenceTranslation$1.f23289d = 3;
            if (((C1368a) si7Var).m7856O(1.15d, themeSettingsViewModel$setSentenceTranslation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        if (z) {
            yi7 yi7Var = ((C1368a) si7Var).f18329C0;
            themeSettingsViewModel$setSentenceTranslation$1.f23286a = z;
            themeSettingsViewModel$setSentenceTranslation$1.f23289d = 2;
            objM15541t = AbstractC3224d.m15541t(yi7Var, themeSettingsViewModel$setSentenceTranslation$1);
            if (objM15541t != coroutineSingletons) {
                if (((Number) objM15541t).doubleValue() < 1.15d) {
                    themeSettingsViewModel$setSentenceTranslation$1.f23286a = z;
                    themeSettingsViewModel$setSentenceTranslation$1.f23289d = 3;
                    if (((C1368a) si7Var).m7856O(1.15d, themeSettingsViewModel$setSentenceTranslation$1) == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f23301b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f23301b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f23301b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f23301b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f23301b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f23301b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f23301b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f23301b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f23301b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f23301b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f23301b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f23301b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f23301b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f23301b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f23301b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f23301b.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f23301b.mo4587X();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m8688Z2(xy9 xy9Var) {
        xy9Var.getClass();
        if (xy9Var instanceof ky9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$1(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof my9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$2(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof jy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$3(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof ny9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$4(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof ly9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$5(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof ty9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$6(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof iy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$7(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof oy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$9(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof sy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$10(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof ry9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$11(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof qy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$12(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof hy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$13(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof vy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$14(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof py9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$15(this, xy9Var, null), 3);
            return;
        }
        if (xy9Var instanceof wy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$16(this, xy9Var, null), 3);
        } else if (xy9Var instanceof uy9) {
            wfb.m23926u(lda.m16103C(this), null, null, new ThemeSettingsViewModel$handleAction$17(this, xy9Var, null), 3);
        } else {
            if (xy9Var.equals(gy9.f41534a)) {
                return;
            }
            gm5.m12750e();
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f23301b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f23301b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f23301b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f23301b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f23301b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f23301b.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f23301b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f23301b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f23301b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f23301b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f23301b.mo4598w2();
    }
}
